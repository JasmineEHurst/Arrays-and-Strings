#include <stdio.h>

void findPairs(int array[], int sum, int size);

int main(){
	 int array[] = {1, 4, 45, 6, 10, -8};
	 int sum = 16;
	 int size = 6;
	 
	 findPairs(array, sum, size);
}

void findPairs(int array[], int sum, int size){
	int array_size = size;
	for(int i = 0; i < array_size; i++){
		for(int j = i + 1;j < array_size; j++){
			if(array[i] + array[j] == sum){
				printf("There is a pair in the array ");
				for(int n = 0; n < array_size; n++){
					printf("%d ", array[n]);
				}
				printf("that creates the sum %d \n", sum);
				printf("First pair found is %d, %d", array[i], array[j]);
			}
	

		}
	}
}
