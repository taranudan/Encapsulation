package kitchen;

public class SmallCup extends Cup {
	
	
	public SmallCup (String liquidName, int liquidVolume ) {
		super (liquidName, liquidVolume);

	}
	
	public void setLiquidVolume(int liquidVolume) {			
    	if (liquidVolume>= 0 && liquidVolume <= 250) {
    		this.liquidVolume = liquidVolume;
    	}
    	else {
    		System.err.println ("The data entered for liquidVolume is incorrect");
    	}
	}
	
}
