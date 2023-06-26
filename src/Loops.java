
public class Loops {

	public static int cbrt(int i) {
		int result;
		result= i*i*i;
		return result;
	}

	public static int sqrt(int i) {
		int result;
		result = i*i;
		return result;
	}

	public static void main(String[] args) {
		
	int x=0;
	int y=0;
	
	for(int i=0;i<10;i++) {
			x= sqrt(i);
			y= cbrt(i);
			System.out.print(i + "\t");
			System.out.print(x + "\t");
			System.out.print(y +"\t");
			System.out.println();		
		}

	}

}


