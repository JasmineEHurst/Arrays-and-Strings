import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scan.nextLine();
		System.out.println(isUnique(s));
	}
	/*Assumes ASCII with 128 characters*/
	public static boolean isUnique(String s){
		boolean[] usedCharacters = new boolean[128];
		/*If the string has more than the available characters, 
		 * then it must have repeated a character*/
		if(s.length() > 128){
			return false;
		}/*For every character check if it has been used before*/
		for(int i = 0; i < s.length(); i++){
			/*Cast the character into its integer form*/
			int character = s.charAt(i);
			/*if the character is found*/
			if(usedCharacters[character]){
				return false;
			}else{
				usedCharacters[character] = true;
			}
		}
		return true;
	}

}
