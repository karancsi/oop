
public class Rectangle {

	private int a_oldal, b_oldal;
	public Rectangle(int a_oldal, int b_oldal){
		this.a_oldal = a_oldal;
		this.b_oldal =b_oldal;
	}
	
	public Rectangle (int oldalhossz){
		this.a_oldal= oldalhossz;
		this.b_oldal= oldalhossz;
		
	}

	public String toString() {
		return "Rectangle [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + "]";
	}
	public void setOldalak(int a_oldal, int b_oldal){
		this.a_oldal = a_oldal;
		this.b_oldal =b_oldal;
	}
	
	public void setOldalak(int oldalhossz){
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;
	}
	
	
	
	/*}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
