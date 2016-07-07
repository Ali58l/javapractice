public class Main{

	public static void main(String[] args){
		double pi = MyMath.calculatePI();
		double radian = pi / 2;
		double sin = MyMath.calculateSin(radian);
		int factorial = MyMath.factorial(4);
		System.out.println(factorial);
	}
}