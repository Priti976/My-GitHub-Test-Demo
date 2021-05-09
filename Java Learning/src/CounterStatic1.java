//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class CounterStatic1 {
	int count=0;//will get memory each time when the instance is created  
  
CounterStatic1(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
	CounterStatic1 c1=new CounterStatic1();  
	CounterStatic1 c2=new CounterStatic1();  
	CounterStatic1 c3=new CounterStatic1();  
}  
}  


