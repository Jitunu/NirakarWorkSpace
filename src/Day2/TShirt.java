package Day2;

public class TShirt {
	
	String color;
	String material;
	String design;
	
	
	void setData(String colr,String Mterial,String Design){
		
		color=colr;
		material= Mterial;
		design = Design;
	}
	
	  void getData() { // displays the stored data
          System.out.println("T shirt Info :- ");
          System.out.println("T shirt color : " + color + ",  shirt Maretial : " + material+" ,shirt Maretial"+design);
      }
	
	public static void main(String[] args) {
	TShirt shirt = new TShirt();
	TShirt shirt2 = new TShirt();
	TShirt shirt3= new TShirt();
	
	shirt.setData("red", "cotton", "Small");
	shirt2.setData("Blue", "Silk", "Large");
	shirt3.setData("Yellow", "cotton", "X-Large");
	shirt.getData();
	shirt2.getData();
	shirt3.getData();
	
	
	
		
		

	}

}
