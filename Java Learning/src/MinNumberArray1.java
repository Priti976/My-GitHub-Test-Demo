
public class MinNumberArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,62,2,32,14};
		min(a);
	}
	
		static void min(int arr[])
		{
			int min=arr[0];
			for(int i=1;i<arr.length;i++)
				if(min>arr[i])
					min=arr[i];
			System.out.println(min);
		
		}
	}


