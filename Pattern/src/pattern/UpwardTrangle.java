package pattern;

public class UpwardTrangle {
	public static void main(String[] args) {
		int x=5;
		int i,j;
		for(i=1;i<=x;i++) {
			for(j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}

}
