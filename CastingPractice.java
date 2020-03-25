package allCasting;

public class CastingPractice {

	public static void main(String[] args) {
		boolean live = true; // 1 bit
		byte age = 25; //8 bit = 1 byte
		short length = 32000; //16 bit = 2 byte
		char chr = 'M'; //16 bit unicode
		String str1 = "718-312-2613";
		String str2 = "Hello.. World !";
		int distance = 2123134141; // 32 bit = 4 byte
		long altitude = 92000011112222444l; //64 bit = 8 byte
		float floatings = 3.142857143f; //32 bit = 4 byte
		double dbl = 3.14; //64 bit 8 byte
		
		
	/*
	 **conversion flow:byte>short>char>int>long>float>double
Widening casting is done automatically when passing a smaller size type to a larger size type:
	 */
		
		short shrtAge = age; //performed widening casting as {byte age} > {short shrtAge};
		System.out.println(shrtAge); // 25;
		long lngDistance = distance; //performed widening casting as int distance >long lngDistance; 
	    
		
		/*
		 * *conversion flow: double>float>long>int>char>short>byte
Narrowing casting must be done manually by placing the type in parentheses in front of the value:
		 */
		
		System.out.println("double-dbl = :"+dbl);
		int newInt = (int) dbl; //performed a narrow casting double>integer..
		System.out.println("int-newInt = :"+newInt);
	}

}



















/*
 
 System.out.println("Min Val of Byte: "+Byte.MIN_VALUE);
		System.out.println("Max Val of Byte: "+Byte.MAX_VALUE);
		System.out.println("Size of Byte: "+Byte.SIZE);
		System.out.println("Min Val of Short: "+Short.MIN_VALUE);
		System.out.println("Max Val of Short: "+Short.MAX_VALUE);
		System.out.println("Size of Short: "+Short.SIZE);
		System.out.println("Max Val of Character: "+Character.MAX_VALUE);
		System.out.println("Min Val of Character: "+Character.MIN_VALUE);
		System.out.println("Size of Character: "+Character.SIZE);
		System.out.println("Min Val of Integer: "+Integer.MIN_VALUE);
		System.out.println("Max Val of Integer: "+Integer.MAX_VALUE);
		System.out.println("Size of Integer: "+ Integer.SIZE);
		System.out.println("Min Val of Long: "+Long.MAX_VALUE);
		System.out.println("Max Val of Long: "+Long.MIN_VALUE);
		System.out.println("Size of Long: "+Long.SIZE);
		System.out.println("Min Val of Float: "+Float.MIN_VALUE);	
		System.out.println("Max Val of Float: "+Float.MAX_VALUE);
		System.out.println("Size of Float: "+Float.SIZE);
		System.out.println("Max Val of Double: "+Double.MAX_VALUE);
		System.out.println("Min Val of Double: "+Double.MIN_VALUE);
		System.out.println("Size of Double: "+Double.SIZE);

*/