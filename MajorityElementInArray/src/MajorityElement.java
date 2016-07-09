import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		int array[] = {1, 3, 3, 1, 2};
		findMajorityElement(array);
	}

	public static void findMajorityElement(int array[]){
		for(int i = 0; i< array.length; i++){
			int counter = 1;
			for(int j = array.length - 1; j > i; j--){
				if(array[i] == array[j]){
					counter++;
					if(counter > array.length / 2){
						System.out.printf("The majority element is %d ", array[i]);
						return;
					}
				}
			}
		}
		System.out.printf("There is no majority element");
	}
}
