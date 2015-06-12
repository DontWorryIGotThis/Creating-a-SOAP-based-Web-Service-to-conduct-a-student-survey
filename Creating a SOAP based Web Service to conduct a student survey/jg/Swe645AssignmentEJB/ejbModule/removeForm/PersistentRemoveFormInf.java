package removeForm;

import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface PersistentRemoveFormInf extends Serializable {
	
	public boolean RemoveForm(String Email);

}
