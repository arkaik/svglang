TARGET =	Asl

# Directories
ROOT =		$(PWD)
SRCDIR = 	$(ROOT)/src
LIBDIR =	$(ROOT)/libs
CLASSDIR = 	$(ROOT)/classes
MAIN =		$(SRCDIR)/$(TARGET)
PARSER =	$(SRCDIR)/parser
INTERP =	$(SRCDIR)/interp
DATATYPE =	$(SRCDIR)/interp/datatype
JAVADOC =	$(ROOT)/javadoc
BIN =		$(ROOT)/bin

# Executable
EXEC = 		$(BIN)/$(TARGET)
JARFILE =	$(BIN)/$(TARGET).jar
MANIFEST=	$(BIN)/$(TARGET)_Manifest.txt

# Libraries and Classpath
LIB_ANTLR =	$(LIBDIR)/antlr-3.4-complete.jar
LIB_CLI =	$(LIBDIR)/commons-cli-1.2.jar

CLASSPATH=	$(LIB_ANTLR):$(LIB_CLI)
JARPATH=	"$(LIB_ANTLR) $(LIB_CLI)"


# Distribution (tar) file
DATE= 		$(shell date +"%d%b%y")
DISTRIB=	$(TARGET)_$(DATE).tgz

# Classpath


# Flags
JFLAGS =	-classpath $(CLASSPATH) -d $(CLASSDIR)
DOCFLAGS =	-classpath $(CLASSPATH) -d $(JAVADOC) -private

# Source files
GRAMMAR = 		$(PARSER)/$(TARGET).g

MAIN_SRC =		$(MAIN)/$(TARGET).java

PARSER_SRC =	$(PARSER)/$(TARGET)Lexer.java \
				$(PARSER)/$(TARGET)Parser.java

INTERP_SRC =	$(INTERP)/Interp.java \
				$(INTERP)/Stack.java \
				$(INTERP)/Data.java \
				$(INTERP)/WebExecution.java \
				$(INTERP)/$(TARGET)Tree.java \
				$(INTERP)/AslTreeAdaptor.java

DATATYPE_SRC =	$(DATATYPE)/SvglangBoolean.java \
				$(DATATYPE)/SvglangInteger.java \
				$(DATATYPE)/SvglangFloat.java \
				$(DATATYPE)/SvglangObject.java \
				$(DATATYPE)/SvglangRectangle.java \
				$(DATATYPE)/SvglangVoid.java

ALL_SRC =		$(MAIN_SRC) $(PARSER_SRC) $(INTERP_SRC) $(DATATYPE_SRC)

all: compile exec docs

compile:
	java -jar $(LIB_ANTLR) -o $(PARSER) $(GRAMMAR)
	if [ ! -e $(CLASSDIR) ]; then\
	  mkdir $(CLASSDIR);\
	fi
	javac $(JFLAGS) $(ALL_SRC) -Xlint:unchecked

docs:
	javadoc $(DOCFLAGS) $(ALL_SRC)

exec:
	if [ ! -e $(BIN) ]; then\
	  mkdir $(BIN);\
	fi
	echo "Main-Class: Asl.Asl" > $(MANIFEST)
	echo "Class-Path: $(JARPATH)" >> $(MANIFEST)
	cd $(CLASSDIR); jar -cmf $(MANIFEST) $(JARFILE) *
	printf "#!/bin/sh\n\n" > $(EXEC)
	printf 'exec java -enableassertions -jar $(JARFILE) "$$@"' >> $(EXEC)
	chmod a+x $(EXEC)

clean:
	rm -rf $(PARSER)/*.java $(PARSER)/*.tokens
	rm -rf $(CLASSDIR)
	rm -rf $(JAVADOC)
	rm -rf $(BIN)

tar: clean
	cd ..; tar cvzf $(DISTRIB) $(TARGET); mv $(DISTRIB) $(TARGET); cd $(TARGET)
