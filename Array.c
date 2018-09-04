#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "Array.h"


//code got problem
JNIEXPORT void JNICALL Java_Array_pass (JNIEnv *env, jobject jobj, jint n1, jint n2) {
	jint num1, num2;
	int i, j;
	//srand(time(NULL));
	int randomnum = rand();
	char randomletter;
	num1 = ((jint)n1);
	num2 = ((jint)n2);
	
	
	// char randomletter = 'A' + rand() % 26;
	// printf("%c", randomletter);
	
	
 	jchar arr[num1][num2];
	
	for (i = 0; i<num1; i++) {
		for (j = 0; j<num2; j++) {
			
			randomletter = 'A' + rand() % 26;
			arr[i][j] = randomletter;
		}
	}    

	for (i = 0; i<num1; i++) {
		for (j = 0; j<num2; j++) {
			
			printf("%c", arr[i][j]);
	 }
}   
	


// return arr; 


}