//Object initialization through method

class MethodInitialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStudent os1=new ObjectStudent();
		ObjectStudent os2=new ObjectStudent();
		
		os1.readStudent(11,"aaa");
		os2.readStudent(12,"bbb");
		
		os1.displayStudent();
		os2.displayStudent();		

	}

}
