package programs;

public class OverLoading {
	void  add(int i,int j){
		int k=i+j;
		System.out.println(k);
	}
	void add(double i,int j){
		double k=i+j;
		System.out.println(k);
	}
	public static void main(String[] args) {
		
		OverLoading loading= new OverLoading();
		loading.add(4.8,6);
		
	}
}
