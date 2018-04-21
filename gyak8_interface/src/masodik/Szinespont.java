package masodik;
import java.awt.color.*;

public class Szinespont extends Pont implements Iszinezheto{
	private Color szin;
	public Szinespont(double x, double y,Color szin) {
		super(x, y);
		this.szin=szin;
		
	}
	public Szinespont (Color szin){
		super (0,0);
		this.szin = szin;
	}
	public Color getSzin();
	{
	return szin;	
	}
	
	public void setSzin(Color szin){
		this.szin=szin;
	}


}
