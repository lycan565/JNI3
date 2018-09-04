import java.util.Scanner;

public class Array{
	
    
    static{
          System.loadLibrary("Array");
    }

	public native void pass(int n1, int n2);
	
	
     public static void main(String[] args) {
		 
         Scanner scanner = new Scanner(System.in);
         System.out.printf("Enter first number: ");
         int num1 = scanner.nextInt();
		 
		
		 Scanner scanner2 = new Scanner(System.in);
         System.out.printf("Enter second number: ");
         int num2 = scanner2.nextInt();
		  
		 
		 Array ar = new Array();
		 ar.pass(num1, num2);
		 
		 
		 
		for (int i = 0; i<num1; i++) {
			for (int j = 0; j<num2; j++) {
				System.out.println("The 2D array contains: ");
			}
		}
		
		
}

//how to run (for me):
//javac Array.java
//javac -h . Array.java
//x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Array.dll Array.c

//To do:
//I pass the value to c file idk how to pass array back
//Exception handling for when not number is entered
//Up to u to do: Bonus will be given if student provide additional feature that is attractive and useful


}