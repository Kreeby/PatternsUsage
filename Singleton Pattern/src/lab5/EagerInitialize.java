package lab5;

public class EagerInitialize {
	
	private static final EagerInitialize eager = new EagerInitialize();
	
	private EagerInitialize() {}
	
	public static EagerInitialize getInstance() {
		return eager;
	}
}
