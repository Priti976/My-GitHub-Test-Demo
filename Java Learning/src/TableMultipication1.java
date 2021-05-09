import java.util.Scanner;

public class TableMultipication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		System.out.println(num+"*"+i+"="+(num*i));
			
	}

}
