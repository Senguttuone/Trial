public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=323;
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

			System.out.println("tng 0");

			System.out.println("the given number is ng 0");
			System.out.println("make visible timee");

		}
	}

}
