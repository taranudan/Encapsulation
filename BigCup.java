package kitchen;

public class BigCup extends Cup {
	

	public BigCup (String liquidName, int liquidVolume ) {
		super (liquidName, liquidVolume);

	}
	
	public void setLiquidVolume(int liquidVolume) {			
    		if (liquidVolume>= 0 && liquidVolume <= 1000) {
    			this.liquidVolume = liquidVolume;
    		}
    		else {
    			System.err.println ("The data entered for liquidVolume is incorrect");
    		}
	}
}
