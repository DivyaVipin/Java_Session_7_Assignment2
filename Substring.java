import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main string");
		String mainString=sc.nextLine();
		System.out.println("Enter the sub string");
		String subString=sc.nextLine();
		if(mainString.contains(subString))
		{
			found=true;
			System.out.println("Substring "+subString+ " is found in "+mainString+":"+found);
		}
		else
		{
			found=false;
			System.out.println("Substring "+subString+ "is not found in "+mainString+":"+found);
		}
		
	}
	
}
