package PackagePractice;

public class intTOstring {

	public static void main(String[] args) {
		int i = 251;
		String ab = Integer.toString(i);
		System.out.println(ab);
		
		String ac = String.valueOf(i);
		System.out.println(ac);
		
		String str1 = "123456";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
		int num2 = Integer.valueOf(str1);
		System.out.println(num2);
	}

}
