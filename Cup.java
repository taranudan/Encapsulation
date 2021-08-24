package kitchen;

public class Cup {
	
	  private String liquidName;
	  private int liquidVolume;

	    public Cup(){
	    
	    }
	    
	    public Cup( String liquidName, int liquidVolume ){
	    	setLiquidName(liquidName);	
	    	setLiquidVolume(liquidVolume);
	    }
	    
	    public String getLiquidName() {
			return liquidName;
		}
	    
	    public void setLiquidName(String liquidName) {
	    	if (liquidName == "Water" || liquidName == "Milk" || liquidName == "Tea") {
	    		this.liquidName = liquidName;
	    	}
	    	else {
	    		System.err.println ("The data entered for liquidName is incorrect");
	    	}			
		}
	    
	    public int getLiquidVolume() {
			return liquidVolume;
		}
	    
	    public void setLiquidVolume(int liquidVolume) {			
	    	if (liquidVolume>= 0 && liquidVolume <= 600) {
	    		this.liquidVolume = liquidVolume;
	    	}
	    	else {
	    		System.err.println ("The data entered for liquidVolume is incorrect");
	    	}
		}
}
