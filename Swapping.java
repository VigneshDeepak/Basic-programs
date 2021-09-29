package basicPrograms;

public class Swapping {

	public static void main(String[] args) {
		int a=10,b=30,temp;
		System.out.println("Before swapping : " +a +" "+b );
		
//		temp=a;
//		a=b;			//swapping using third variable
//		b=temp;
//		
//		a=a+b;
//		b=a-b;			//swapping using + and -
//		a=a-b;
//		
//		a=a*b;
//		b=a/b;			//swapping using * and /
//		a=a/b;
		
//		a=a^b;
//		b=a^b;			//bitwise swapping
//		a=a^b;
		
		b=a+b-(a=b);   //single statement swapping
		
		
		System.out.println("after swapping : "+a+" "+b);
				

	}

}
