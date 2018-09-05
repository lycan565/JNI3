#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "Array.h"


JNIEXPORT jcharArray JNICALL Java_Array_passValue (JNIEnv *env, jobject jobj, jint row, jint column) {
	
	int index = 0;
	srand(time(NULL));
	char randomletter;
	
	
 	jchar arr[row][column];
	
	for (int i = 0; i<row; i++) {
		for (int j = 0; j<column; j++) {
			
			randomletter = 'A' + rand() % 26;
			arr[i][j] = randomletter;
		}
	}    

	//For showing the content of 2D array with random A-Z character in C file
	printf("\nThe content of 2D array in C: \n\n");
	
	for (int i = 0; i<row; i++) {
		for (int j = 0; j<column; j++) {
			
			printf("%c", arr[i][j]);
		}	
		
		printf("\n");
		
	}   
	
	
	jcharArray CArray;
	
	int length = row * column;
	CArray = (*env)->NewCharArray(env, length);
	
	if (CArray == NULL) {
		return NULL;
	}
	
	
	for(int i=0; i<row; i++)
	{
		for(int j = 0; j<column; j++)
		{
			(*env)->SetCharArrayRegion(env, CArray, index, column, arr[i]);
		}
		index+=column;
	}
	
	return CArray;
	
}