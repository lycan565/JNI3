# JNI3

Simple JNI program that creates a 2D Array in C and content of the array is based on random A-Z characters while passing the array back to Java for array content display <br />

<br />

CLI command to run JNI program(for my pc): <br />
javac Array.java <br />
javac -h . Array.java <br />
x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Array.dll Array.c <br />
java Array
