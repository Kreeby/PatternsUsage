package lab5;

public class LazyInitializeDoubleCheck {
	
	private static LazyInitializeDoubleCheck lazyDouble = null;
    private LazyInitializeDoubleCheck() {}
    
    
    public static LazyInitializeDoubleCheck getInstance() {
        if (lazyDouble == null) {
            synchronized (LazyInitializeDoubleCheck.class) {
                if (lazyDouble == null) {
                    lazyDouble = new LazyInitializeDoubleCheck();
                    
                }
            }
        }
        return lazyDouble;
    }
}
