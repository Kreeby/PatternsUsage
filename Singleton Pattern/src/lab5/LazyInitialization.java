package lab5;

public class LazyInitialization {

	
	private static LazyInitialization lazy = null;
	
    private LazyInitialization() {}
    
    
    public static LazyInitialization getInstance() {
        if (lazy == null) {  
          synchronized(LazyInitialization.class) {
          lazy = new LazyInitialization();
          }
        }
        return lazy;
    }
}
