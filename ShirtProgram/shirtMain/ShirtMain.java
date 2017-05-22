package shirtMain;
import ShirtPackage.*;


	
final class PullOver extends Shirt{
		
		boolean has_hood, has_stripes;
		
			public PullOver(int s, int p, boolean hood, boolean stripes){
				super(s,p);
				has_hood = hood;
				has_stripes = stripes;
			}
			
			public void setColor(String c){
				super.color = c;
			}
			
			public String getColor(){
				return super.color;
			}
			
			public void getDetails(){
				System.out.println("Details of PullOver:\n");
				System.out.println("Size: "+super.size+"\nPrice: "+super.price+"\nColor:"+this.getColor()+"\nHas_Hood: "+has_hood+"\nHas_Stripes: "+has_stripes);

			}
			
	}

class FormalShirt extends Shirt{
	
boolean has_selves, has_stripes;
	
	public FormalShirt(int s, int p, boolean selves, boolean stripes){
			
			super(s,p);
			has_selves = selves;
			has_stripes = stripes;
		}
		
		public void setColor(String c){
			super.color = c;
		}
		
		public String getColor(){
			return super.color;
		}
		
		public void getDetails(){
			System.out.println("Details of FormalShirt:\n");
			System.out.println("Size: "+super.size+"\nPrice: "+super.price+"\nColor:"+this.getColor()+"\nHas_Hood: "+has_selves+"\nHas_Stripes: "+has_stripes);

		}
		
}

class PartyWear extends FormalShirt{
	String brand;
	
	PartyWear(int s, int p, boolean ss, boolean st, String b){
		super(s,p,ss,st);
		brand = b;
	}
	public void getDetails()
	{
		System.out.println("\nBrand: " + brand + "\nSize: " + super.size + "\nPrice: " + super.price + "\nSleeves: " + has_selves + "\nStripes: " + has_stripes + "\nColour: " + this.getColor());
	}
}

public class ShirtMain {
	
	public static void main(String[] args){
		PullOver s1 = new PullOver(10, 20 ,true,false);
		FormalShirt s2 = new FormalShirt(20, 30 , false, false);
		PartyWear s3 = new PartyWear(30,50,true, true,"LV");
		s1.setColor("green");
		s2.setColor("Red");
		s3.setColor("Bluee");
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		
	}
}
