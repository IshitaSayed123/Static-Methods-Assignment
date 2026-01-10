package methods;
public class example{
	//approach-1
//	public static boolean isEven(int num) {
//		if (num % 2==0) {
//			System.out.println("even");
//			return true;
//		} else {
//			System.out.println("odd");
//			return false;
//		}
//	}
//	approach-2
	public static boolean isEven(int num) {
		return num%2==0;
	}
	public static void main(String[] args) {
//		approach-1
//		int num=10;
//		isEven(10);	
		int num=10;
		if(isEven(num)) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		isEven(30);
	}

}
