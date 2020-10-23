package practice;


public class Decimalformat {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=9;
		double c = (double)a / (double)b;
		
		System.out.println("\nKhi chua lam tron: "+c);
		
		System.out.printf("\nSau khi lam tron: \nLam tron dung printf: %.2f",c);
		
		System.out.println("\nLam trong dung Math.round(): "+ Math.round(c*100.0)/100.0);
		
		System.out.println("Lam tron dung math.ceil(): "+ Math.ceil(c*100.0)/100.0);
	}

}
