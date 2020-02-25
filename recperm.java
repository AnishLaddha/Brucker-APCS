import java.util.*;
public class recperm{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Input string: ");
		String input = console.next();
		permutations(input.toCharArray(), 0);

	}
	private static void swapper(char[] ch, int i, int j){
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	} 
	private static void permutations(char[] ch, int index){
		if(index == ch.length -1){
			System.out.println(String.valueOf(ch));

		}
		for(int i = index; i < ch.length; i++){
			swapper(ch, index, i);
			permutations(ch, index +1);
			swapper(ch, index, i);
		}
	}
}
