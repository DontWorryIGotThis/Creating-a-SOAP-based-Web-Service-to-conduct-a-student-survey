package retrieveForm;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import persistence.FormInstance;

@Stateless
public class PersistentFormRetrieve implements PersistentFormRetrieveInf {
	
	private static final String PERSISTENCE_UNIT_NAME = "EmConfigForForm";
	private static EntityManagerFactory factory;

	@Transactional
	public ArrayList<Row> SearchForm(String FirstName, String LastName, String City, String State) {
    	ArrayList<Row> ArrayListofRow = new ArrayList<Row>();
    	if(FirstName == null)
    		FirstName ="";
    	if(LastName == null)
    		LastName ="";
    	if(City == null)
    		City ="";
    	if(State == null)
    		State ="";
    	
    	factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    
	    em.getTransaction().begin();
	    Query q = em.createQuery("select t from FormInstance t");
	    List<FormInstance> ListOfForms = q.getResultList();
	    for(int i=0; i<ListOfForms.size();i++)
	    {
	    	//System.out.println("Entered forloop");
			if(ListOfForms.get(i).getFirstName().contains(FirstName))
			{
				//System.out.println("Firstname: Matched");
				if(ListOfForms.get(i).getLastName().contains(LastName))
				{
					//System.out.println("Lastname: Matched");
					if(ListOfForms.get(i).getCity().contains(City))
					{
						//System.out.println("City: Matched");
						if(ListOfForms.get(i).getState().contains(State))
						{
							//System.out.println("State: Matched");
							//System.out.println("Satisfied all ifs");
							ArrayListofRow.add(new Row(ListOfForms.get(i).getFirstName(), ListOfForms.get(i).getLastName(), ListOfForms.get(i).getAddress(), ListOfForms.get(i).getCity(), ListOfForms.get(i).getState(), ListOfForms.get(i).getZip(),  ListOfForms.get(i).getTel(), ListOfForms.get(i).getEmail(), ListOfForms.get(i).getDay(), ListOfForms.get(i).getMonth(), ListOfForms.get(i).getYear(), ListOfForms.get(i).getLikes(), ListOfForms.get(i).getRecommend(), ListOfForms.get(i).getRaffle(), ListOfForms.get(i).getComments()/*,ListOfForms.get(i).getEDetails().toString()*/));
							System.out.println("The first name is "+ListOfForms.get(i).getFirstName());
						}
					}
	    		}
			}
		}
	    em.getTransaction().commit();
	    return ArrayListofRow;
	}

}
