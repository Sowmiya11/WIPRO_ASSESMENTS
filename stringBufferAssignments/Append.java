public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mArk"; //First string
		String str2="kat"; //Second string
		str1.toLowerCase();
		str2.toLowerCase();
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
			System.out.println((str1+str2.substring(1, str2.length())).toLowerCase());
		else
			System.out.println(str1+str2);
		System.out.println(str1.charAt(0));
		
	}

}
