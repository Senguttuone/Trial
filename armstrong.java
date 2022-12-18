import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to find the number is ARMSTRONG no or NON ARMSTRONG no");
		int num=obj.nextInt();
		int refer=num;
	int temp=0;
		while(num>0)
		{
			int a=num%10;
			temp=temp+(a*a*a);
			num=num/10;
		}
		
		System.out.println(refer==temp);
		if(refer==temp)
		{
			System.out.println("the given number is Armstrong");
		
		}
		else
		{
			System.out.println("the given number is Non armstrong 0");
		}
	}

}
