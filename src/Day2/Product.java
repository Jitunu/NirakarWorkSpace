package Day2;

public class Product {

	
	int ProID;
	String ProName;
	float ProPrice ;
	void setData(int ProfessionalID, String ProfessionalName,int ProfessionalPrice) { // stores the input data
		ProID = ProfessionalID;
		
		ProPrice=(float) (ProfessionalPrice+ProfessionalPrice*0.28);
	      }
	      void getData() { // displays the stored data
	          System.out.println("Product Info :- ");
	          System.out.println("Product ID : " + ProID + ",  Product Name : " + ProPrice);
	      }
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setData(12, "Nirakar", 2600);
		product.getData();
		
	}
}
