//object initialization using constructor

class ObjectConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectRectangle or1=new ObjectRectangle();
		ObjectRectangle or2=new ObjectRectangle();
		
		or1.getRectangle(2, 4);
		or2.getRectangle(5, 8);
		
		or1.calculateArea();
		or2.calculateArea();
	}

}
