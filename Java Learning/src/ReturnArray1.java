
public class ReturnArray1 {
	static int[] get()
	{
	return new int[] {5,10,15,20,25};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=get();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
