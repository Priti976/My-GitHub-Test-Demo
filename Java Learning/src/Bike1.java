//Method overriding
//here we are calling the method of parent class with child class object

//creating child class
class Bike1 extends Vehicle1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an instances of child class
		Bike1 b= new Bike1();
		
		//creating the method with child class instances
		b.run();
		
	}
	
}
