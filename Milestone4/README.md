--How to run !VWLS--

Grammar : NoVwls.g4

Good inputs :
  - good1-goodtype.vwls
    antlr4run.bat NoVwls.g4 program good1-goodtype.vwls
  - good2-scope.vwls
    antlr4run.bat NoVwls.g4 program good2-scope.vwls
  - good3-loops.vwls
    antlr4run.bat NoVwls.g4 program good3-loops.vwls

Bad inputs : 
  - bad1-type.vwls
    antlr4run.bat NoVwls.g4 program bad1-type.vwls
  - bad2-funct.vwls
    antlr4run.bat NoVwls.g4 program bad2-funct.vwls
  - bad3-arr.vwls
    antlr4run.bat NoVwls.g4 program bad3-arr.vwls

How to run with antlr4:
0) Have the antlr4 jar file downloaded
    **For best results, put in same folder as grammar and inputs
1) Run the grammar
    antlr4 NoVwls.g4
2) Compile the Java files
    javac -cp "C:path\to\jarfile\antlr-4.13.2-complete.jar" *.java
3) Run the file
    antlr4run.bat NoVwls.g4 program testfile.vwls
4) Compile the New Java File
    javac NoVwlsProgram.java
5) Run the java file
    java NoVwlsProgram


