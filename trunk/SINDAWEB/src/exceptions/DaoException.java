package exceptions;

@SuppressWarnings("serial")
public class DaoException extends Exception {
	
	Exception desc;
	
	public DaoException (Exception e) {
		this.desc = e;
	}

}
