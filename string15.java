import java.util.*;
public class string15 {

	public static void main(String[] args) {
				
		
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String 1 : ");
		String string1 = str.nextLine().toUpperCase();
		
		
		System.out.print("Enter the String 2 : ");
		String string2 = str.nextLine().toUpperCase();
		int j =0;
		
		for(int i =0 ;i<string1.length();i++)
		{
			if(string2.charAt(j)!=string1.charAt(i)) {
				
				string1=string1.replace(string1.charAt(i), '+');
				j++;
				
			}
			if (j>=string2.length())break;
			
			
			
		}
		
		
		System.out.println("Answer :"+string1);
	
	
	}
}
	