package sajat;
import java.awt.color.*;;

public class szinespont extends Pont implements Iszinezheto{
	private Color szin;
	public szinespont(double x, double y,Color szin) {
		super(x, y);
		this.szin=szin;
		
	}
	public szinespont (Color szin){
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
