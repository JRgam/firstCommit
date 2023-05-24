
public class Methods {
	
	public static void main(String[] args ) {
		
		String firstName = "Jr";
		String lastName = "Gam";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Ray", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		
	}
	
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		
	
		
		
		
		
		
	}

}




