package exceptions;

@SuppressWarnings("serial")
public class DaoException extends Exception {
	
	String desc;
	
	public DaoException (String desc) {
		this.desc = desc;
	}

}
