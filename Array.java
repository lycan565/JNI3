import java.util.Scanner;
import java.util.InputMismatchException;

public class Array{
	
    
    static{
          System.loadLibrary("Array");
    }

	public native char[] passValue(int row, int column);
	
	
     public static void main(String[] args) {
		 
		 char array[];
		 int arrayRow, arrayColumn, rowInput, columnInput;
		 
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nEnter row number for 2D array: ");
		 
		 do {

			try {
				arrayRow = scanner.nextInt();
				if ( arrayRow>= 0) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner.nextLine();
			}

			System.out.print("\nInput must be an integer more than or equals to 0!\nEnter row number for 2D array: ");
		} while (true);
		 
		 
		 Scanner scanner2 = new Scanner(System.in);
         System.out.print("\nEnter column number for 2D array: ");
		 
		 do {

			try {
				arrayColumn = scanner2.nextInt();
				if ( arrayColumn>= 0) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner2.nextLine();
			}

			System.out.print("\nInput must be an integer more than or equals to 0!\nEnter column number for 2D array: ");
		} while (true);
		 
		 Array ar = new Array();
		 array = ar.passValue(arrayRow, arrayColumn);
		 
		 System.out.println("\nThe content of the array in Java: \n");
		 
		 int arraySize = arrayRow * arrayColumn;
		 int nextLine = arrayColumn - 1;
		
		for (int i = 0; i<arraySize; i++) {
		
			if(i % arrayColumn == 0 && i!=0){
				
				System.out.print("\n");
				
			}
		
			System.out.print(array[i]); 
		 
		}
		
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("\n\nEnter the specific element row index number to retrieve: ");
	
		do {

				try {
					rowInput = scanner3.nextInt();
					if ( rowInput>= 0 && rowInput<arrayRow) break;

				} catch (InputMismatchException e) {
				} finally {
					scanner3.nextLine();
				}

				System.out.print("\nInput must be an integer more than or equals to 0 and less than or equals to the max row index number of the 2D array!\nEnter the specific element row index number to retrieve: ");
			} while (true);
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.print("\nEnter the specific element column index number to retrieve: "); 
		
		do {

				try {
					columnInput = scanner4.nextInt();
					if ( columnInput>= 0 && columnInput<arrayColumn) break;

				} catch (InputMismatchException e) {
				} finally {
					scanner4.nextLine();
				}

				System.out.print("\nInput must be an integer more than or equals to 0 and less than or equals to the max column index number of the 2D array!\nEnter the specific element column index number to retrieve: ");
			} while (true);
		
		
		
		int retrieveIndex = (rowInput * arrayColumn) + columnInput;
		System.out.print("\nThe character at arr["+rowInput+","+columnInput+"] of the 2D Array in C and displayed in JAVA: "+array[retrieveIndex]+"\n");
		
		 scanner.close();
		 scanner2.close();
		 scanner3.close();
		 scanner4.close();

	}
	
}
