--How to run !VWLS--

Grammar : NoVwls.g4

How to run with antlr4:
0) Have the antlr4 jar file downloaded
    **For best results, put in same folder as grammar and inputs
1) Run the grammar
    antlr4 NoVwls.g4
2) Compile the Java files
    javac -cp "C:path\to\jarfile\antlr-4.13.2-complete.jar" *.java
3) Run the file
    antlr4-run.bat NoVwls.g4 program testfile.vwls
4) Run the RARS file
    java -jar rars1_6.jar nc code.s

