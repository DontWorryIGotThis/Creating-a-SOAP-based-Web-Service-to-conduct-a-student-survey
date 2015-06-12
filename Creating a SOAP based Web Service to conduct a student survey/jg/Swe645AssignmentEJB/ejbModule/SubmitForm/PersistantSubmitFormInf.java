package SubmitForm;

import javax.ejb.Remote;

@Remote
public interface PersistantSubmitFormInf {
	public boolean CommitForm(String FirstName, String LastName, String SAddress, String City, String State, String ZIP, String Tel, String Email, String Day, String Month, String Year, String likes, String Recommend, String Raffle, String Comments, String ECName1, String ECTel1, String ECName2, String ECTel2);
}
