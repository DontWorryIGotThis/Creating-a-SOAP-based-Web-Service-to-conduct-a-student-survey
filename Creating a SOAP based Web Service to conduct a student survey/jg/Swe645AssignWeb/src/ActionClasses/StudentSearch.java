package ActionClasses;

import java.io.Serializable;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;






import removeForm.PersistentRemoveFormInf;
import retrieveForm.PersistentFormRetrieveInf;
import retrieveForm.Row;

import com.opensymphony.xwork2.ActionSupport;

public class StudentSearch extends ActionSupport implements Serializable{
	private static final long serialVersionUID = 1L;
	String FirstName;
	String LastName;
	String City;
	String State;
	ArrayList<Row> SetofRows;
	String IdToRemove;
	
	

	public String ListSearch(){
		InitialContext con;
		try {
			con = new InitialContext();
			PersistentFormRetrieveInf RetrieveFormObj = (PersistentFormRetrieveInf) con.lookup("java:global/Swe645AssiEAR/Swe645AssignmentEJB/PersistentFormRetrieve!retrieveForm.PersistentFormRetrieveInf");
			SetofRows = RetrieveFormObj.SearchForm(FirstName, LastName, City, State);
			return "RetrievedDesiredForm";
		}catch (NamingException e) {
			e.printStackTrace();
		}
		return "FailedToRetrieveDesiredForm";
	}
	
	public String GetAllForms(){
		InitialContext con;
		try {
			con = new InitialContext();
			PersistentFormRetrieveInf RetrieveFormObj = (PersistentFormRetrieveInf) con.lookup("java:global/Swe645AssiEAR/Swe645AssignmentEJB/PersistentFormRetrieve!retrieveForm.PersistentFormRetrieveInf");
			SetofRows = RetrieveFormObj.SearchForm(null, null, null, null);
			return "gotall";
		}catch (NamingException e) {
			e.printStackTrace();
		}
		return "fail";
	}
	
	public String Saw(){
		InitialContext con;
		try {
			con = new InitialContext();
			PersistentRemoveFormInf RemoveFormObj = (PersistentRemoveFormInf) con.lookup("java:global/Swe645AssiEAR/Swe645AssignmentEJB/PersistentRemoveForm!removeForm.PersistentRemoveFormInf");
			RemoveFormObj.RemoveForm(IdToRemove);
			ListSearch();
			return "gotit";
		}catch (NamingException e) {
			e.printStackTrace();	
		}
		return "fail";
	}
	
	
	public void validate(){
		
		String RegularXp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		if(FirstName == null || FirstName.trim().equals(""))
			addFieldError("FirstName", "Please enter a first name");
		if(LastName == null || LastName.trim().equals(""))
			addFieldError("LastName", "Please enter a Last name");
		if(City == null || City.trim().equals(""))
			addFieldError("City", "Please enter the name of the city");
		if(State == null || State.trim().equals(""))
			addFieldError("State", "Please enter the name of the state");
	}
	

    public void setFirstName(String fname){
    	FirstName = fname;
    }
    public void setLastName(String lname){
    	LastName = lname;
    }
    public void setCity(String city){
    	City = city;
    }
    public void setState(String state){
    	State = state;
    }
    
    public void setIdToRemove(String idToRemove) {
		IdToRemove = idToRemove;
	}
	
    public String getFirstName(){
    	return FirstName;
    }
    public String getLastName(){
    	return LastName;
    }
    public String getCity(){
    	return City;
    }
    public String getState(){
    	return State;
    }
    public String getIdToRemove() {
		return IdToRemove;
	}
    
    public ArrayList<Row> getSetofRows(){
    	return SetofRows;
    }
    
    

	

}
