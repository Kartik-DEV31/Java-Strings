import java.util.*;

public class string19 {

	public static void main(String args[]) {
		
		Scanner str = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int n = str.nextInt();
		String string[]= new String[n];
		
		for (int i = 0 ;i<n;i++)
		{
			
			System.out.print("Enter String"+i+" : ");
			string[i]=str.nextLine(); 
			
		
		}
		
	}
	
	
	
}
