
public class StringCharAt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Welcome to javatpoint portal";
		for(int i=0;i<=name.length()-1;i++)
		//{
			if(i%2!=0)
			{
				System.out.println("Char at " +i+ " Place " + name.charAt(i));
			}
		//}
	}

}
