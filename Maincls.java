/* Write a Java Program that does the following related to Inheritance:
a.Create an abstract class called Vehicle which contains the 'year_of_manufacture' data memeber and two abstract methods 'getData()'
and 'putData() with a constructor.
b.Create two derived classes "TwoWheeler" and "FourWheeler" and implement the abstract methods.Make "FourWheeler" as final class/
c.Create class 'MyTwoWheeler' which is a sub-class of "TwoWheeler" and demonstrate the use of super keyword to initialize data members
of "MyTwoWheeler". */


abstract class Vehicle{
	int year_of_manufacture;
	abstract int getdata();
	abstract void putdata(int year_of_manufacture);
}

class TwoWheeler extends Vehicle{

	TwoWheeler(){
		System.out.println("This is two wheeler\n");
	}

	int getdata(){
		return year_of_manufacture;
	}
		
	void putdata(int year_of_manufacture){
		this.year_of_manufacture = year_of_manufacture;
	}
}

class FourWheeler extends Vehicle{

	FourWheeler(){
		System.out.println("This is Four Wheeler\n");
	}

	int getdata(){
		return year_of_manufacture;
	}

	void putdata(int year_of_manufacture){
		this.year_of_manufacture = year_of_manufacture;
	}
}

class MyTwoWheeler extends TwoWheeler{
	MyTwoWheeler(){
		super();
		System.out.println("This is the MyTwoWheeler class\n");
	}
}

class Maincls{
	public static void main(String[] args){
		Vehicle v1 = new TwoWheeler();
		v1.putdata(10);
		int s = v1.getdata();
		System.out.println("The year of manufacture of TwoWheeler is:"+s);
		Vehicle v2 = new FourWheeler();
		v2.putdata(20);
		int t = v2.getdata();
		System.out.println("The year of manufacture of FourWheeler is :"+t);
		TwoWheeler v3 = new MyTwoWheeler();
	}
}




