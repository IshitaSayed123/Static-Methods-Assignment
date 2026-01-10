package methods;
public class Calculator {
	public static int add(int i, int j) {
		int sum=i+j;
		return sum;
	}
	public static int sub(int i, int j) {
		int sub=i-j;
		return sub;
	}
	public static int mul(int i, int j) {
		int mul=i*j;
		return mul;
	}
	public static int div(int i, int j) {
		int div=i/j;
		return div;
	}
	public static int mod(int i, int j) {
		int mod=i%j;
		return mod;
	}
	public static void main(String[] args) {
		int i=28, j=12;
		System.out.println("Addition of "+ i+" and " + j+ " is: "+add(i,j));
		System.out.println("Subtraction of "+ i+" and " + j+ " is: "+sub(i,j));
		System.out.println("Multiplication of "+ i+" and " + j+ " is: "+mul(i,j));
		System.out.println("Division of "+ i+" and " + j+ " is: "+div(i,j));
		System.out.println("Modulus of "+ i+" and " + j+ " is: "+mod(i,j));
	}
}
