package wsConsumer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import retrieveform.PersistentFormRetrieve1;

import retrieveform.PersistentFormRetrieve1Service;


import com.opensymphony.xwork2.ActionSupport;

public class StudentSearch extends ActionSupport implements Serializable{
	private static final long serialVersionUID = 1L;
	String FirstName;
	String LastName;
	String City;
	String State;
	List<String> SetofRows;
	String IdToRemove;
	
	

	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public List<String> getSetofRows() {
		return SetofRows;
	}



	public void setSetofRows(List<String> setofRows) {
		SetofRows = setofRows;
	}



	public String getIdToRemove() {
		return IdToRemove;
	}



	public void setIdToRemove(String idToRemove) {
		IdToRemove = idToRemove;
	}



	public String ListSearch(){
		InitialContext con;
		try {
			con = new InitialContext();
			PersistentFormRetrieve1Service service = new PersistentFormRetrieve1Service();
			PersistentFormRetrieve1 ServiceSOAP= service.getPersistentFormRetrieve1Port();
			SetofRows = ServiceSOAP.searchForm(FirstName, LastName, City, State);
			//PersistentFormRetrieveInf RetrieveFormObj = (PersistentFormRetrieveInf) con.lookup("java:global/Swe645AssiEAR/Swe645AssignmentEJB/PersistentFormRetrieve!retrieveForm.PersistentFormRetrieveInf");
			//SetofRows = RetrieveFormObj.SearchForm(FirstName, LastName, City, State);
			return "RetrievedDesiredForm";
		}catch (NamingException e) {
			e.printStackTrace();
		}
		return "FailedToRetrieveDesiredForm";
	}

}
