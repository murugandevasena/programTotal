
public class Calculator {

	public int calAdd(int a2, int b2) {
		// TODO Auto-generated method stub
		return a2+b2;
	}
	public int calcSub(int a2, int b2) {
		// TODO Auto-generated method stub
		return a2-b2;
	}
	public int calDivide(int a2, int b2) {
		// TODO Auto-generated method stub
		return a2/b2;
	}
	
	public String reverse(String s) {
		String temp ="";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		return temp;
		
	}
	

}
