
class ObjectStudent 
	{
		int rollno;
		String sname;
		
		void readStudent(int r,String sn)
		{
			rollno=r;
			sname=sn;
		}
		
		void displayStudent()
		{
			System.out.println(rollno + " " + sname);
		}
	}
