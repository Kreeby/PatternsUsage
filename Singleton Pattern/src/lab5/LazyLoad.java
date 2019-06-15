package lab5;

public class LazyLoad {

	
	private LazyLoad() {
	}
	
	
    public static class LazyHolder {
        private final static LazyLoad lazyLoad = new LazyLoad();
    }
    
    public static LazyLoad getInstance() {
        return LazyHolder.lazyLoad;
    }
    
    
}
