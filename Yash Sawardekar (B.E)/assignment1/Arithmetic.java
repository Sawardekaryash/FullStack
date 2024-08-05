package assignment1;

public class Arithmetic {
void add(int a, int b) {
	int s=a+b;
	System.out.println("Addition is :"+s);
}
void Sub(int a, int b) {
	int s=a-b;
	System.out.println("Substraction is :"+s);
}
void Mul(int a, int b) {
	int s=a*b;
	System.out.println("Multiplication is :"+s);
}
void Div(int a, int b) {
	int s=a/b;
	System.out.println("Division is :"+s);
}
void Mod(int a, int b) {
	int s=a%b;
	System.out.println("Modulo is :"+s);
}
	public static void main(String args[]) 
	{
		Arithmetic y=new Arithmetic();
		y.add(5,7);
		y.Sub(5,7);
		y.Mul(5,7);
		y.Div(5,7);
		y.Mod(5,7);
	}
	
	
}

