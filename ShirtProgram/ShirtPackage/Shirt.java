/*2. Write a Java Program that does the following related to Inheritance where:
Abstract class Shirt with members size, price and color, constructors and abstract methods getColor() and putColor().
Inherit the Shirt class to obtain 2 classes : final class “PullOver” (with members has_hood, has_stripes)  and  class “FormalShirt”( with members  has_full_sleeve, has_stripes). 
Create class ‘PartyWear’(with member brand) which is a sub-class of “FormalShirt” and demonstrate the use of super keyword to initialize data members of “PartyWear”.
Use packages and  inheritance.
*/

package ShirtPackage;

public abstract class Shirt {
	public int size, price;
	public String color;
	
	protected Shirt(int s, int p){
		size = s;
		price = p;
	}
	protected abstract void setColor(String c);
	protected abstract String getColor();
	protected abstract void getDetails();
}
