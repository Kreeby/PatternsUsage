package lab5;

public class EagerStatic {

	
	  private static final EagerStatic instance;

	    private EagerStatic() {}

	    
	    static {
	        try {
	            instance = new EagerStatic();
	        } catch (Exception ex) {
	            throw ex;
	        }
	    }

	    
	    public static EagerStatic getInstance() {
	        return instance;
	    }
}
