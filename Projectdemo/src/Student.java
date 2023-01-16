
public class Student {

	public static void main(String[] args) {
		
		String s1=new String("Roshan");
		String s2=new String("roshan");
		s1=s2;
		System.out.println(s1.equals(s2));
		StringBuffer s3=new StringBuffer("Mehare");
		StringBuffer s4=new StringBuffer("Mehare");
		System.out.println(s3.equals(s4));
		StringBuilder s5= new StringBuilder("Mohan");
		
	}
}
