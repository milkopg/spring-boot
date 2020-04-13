package fundamentals.exception;

public class ApplicationNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2230121040368322053L;

	public ApplicationNotFoundException(String exception) {
        super(exception);
    }
}
