 public static void main(String[] args) { 
	 String[] passwords = new String[3];

	 passwords[0] = "421499!";
	 passwords[1] = "cVTT1290?";
	 passwords[2] = "11?1!cV32A";

	 for ( String str : passwords ){
	     if (str.length() > 7 && str.contains("?")){
	         System.out.println(str);
	     }
	 }

