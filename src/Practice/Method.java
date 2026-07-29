package Practice;

public class Method {
	
	public static int add(int i, int j) {
		System.out.println("Addition performing");
		int c = i+j;
		return c;
	}

	public static void main(String[] args) {
		
		int i =3;
		int j =7;
		
		int d = add(i,j);
		System.out.println(d);
	}
}
