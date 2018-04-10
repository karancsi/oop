package forgástest;

public abstract class Hasáb {
	private int height;
	 
	public Hasáb(int height){
		this.height=height;
	}
	 public int getHeight(){
		 return height;
	 }
	public abstract double baseArea();
	
	public double getVolume(){
		return baseArea()*this.height;
	}
	
	public boolean hasabCompare(Hasáb other){
		if(this.getVolume()> other.getVolume())
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
