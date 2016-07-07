  import java.util.*;
  class Fact{
		private static int i = 0;
		private static int j = 0;
		List<Integer> list = new ArrayList();
	public static void main(String[] args){
		Fact fact = new Fact();
		
		fact.factor();
	}
	
	public void factor(){
		while ( i < 3){
			list.add(i,i);
		//	System.out.println(list.get(i));
			i++;
			j++;
			factor();
			System.out.println(list.get(j-1));
		}
	}

}

//		System.out.println(fact.factor(4));
//	}
	
//	public int factor(int n){
//		if ( n < 0 ) return 1;
//		if ( n == 0 ) return 1;		 
		 
//		return n * factor(n-1) ;
//	}
