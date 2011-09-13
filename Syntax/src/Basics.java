
public class Basics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is a comment
		int i;
		i = 1 + 2;
		
		System.out.println(i);
	
		String s = "This is a String";
		String s2 = "This is a String";
		
		//Equivalence
		System.out.println(s == s2);
		s = "This is ";
		s = s + "a String";
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		//Autoboxing
		int primitiveInt = 42;
		Integer integerObject = new Integer(13); 
		//Create a new Integer object that wraps a value of 13
		integerObject = primitiveInt;
		System.out.print(integerObject + "\n");  //prints 42 in the console
		System.out.println(primitiveInt);
	}

}
