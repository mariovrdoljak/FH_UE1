
public class ZinsDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float kontostand =0;
		float zins = 0;
		float erg;
		
		kontostand = 1000;
		zins = (float )2.5;
		
		erg = kontostand * (zins/100) ;
		
		
		
		System.out.println("Die Zinsen betragen: " + erg + " €");		
		System.out.println("Die Zinsen betragen: " + ZinsBer(1000,3)+ " €");
		System.out.println("Die Zinsen betragen: " + ZinsBer(2000,(float)3.85)+ " €");
		System.out.println("Die Zinsen betragen: " + ZinsBer(1500,(float)8.88)+ " €");
		System.out.println("Die Zinsen betragen: " + ZinsBer(1812,(float)0.12)+ " €");

	}

	public static float ZinsBer(float a,float b)
	{
		
		
		return a * (b/100);
		
		
	}

}
	


