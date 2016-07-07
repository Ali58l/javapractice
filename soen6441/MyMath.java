public class MyMath{

	public static double calculatePI(){
		return 3.14;
	}
	
	public static double calculateSin(double radian){
	
		return radian; 
	}
	
	/**
	* f: int > 0 
	**/
	public static int factorial(int f){
		if ( f < 1) return 1;
		if ( f == 1 ) return 1;

		return f * factorial( f - 1);
	}

}