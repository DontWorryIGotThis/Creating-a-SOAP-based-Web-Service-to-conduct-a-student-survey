package ActionClasses;

import java.io.Serializable;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.struts2.ServletActionContext;

import removeForm.PersistentRemoveFormInf;
import retrieveForm.PersistentFormRetrieveInf;
import retrieveForm.Row;

import com.opensymphony.xwork2.ActionSupport;

public class RetrieveAllForms extends ActionSupport implements Serializable {

	private static final long serialVersionUID = 1L;
	ArrayList<Row> SetofRows;
	private String IdToRemove;
	
	
	
	public String getIdToRemove() {
		return IdToRemove;
	}

	public void setIdToRemove(String idToBeRemoved) {
		IdToRemove = idToBeRemoved;
	}

	public ArrayList<Row> getSetofRows(){
    	return SetofRows;
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
			GetAllForms();
			return "gotall";
		}catch (NamingException e) {
			e.printStackTrace();	
		}
		return "fail";
	}
}
