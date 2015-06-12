package retrieveForm;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface PersistentFormRetrieveInf extends Serializable {
	public ArrayList<Row> SearchForm( String FirstName, String LastName, String City, String State);
}
