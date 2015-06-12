package SubmitForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import persistence.EmergencyContact;
import persistence.FormInstance;
@Stateless
public class PersistantSubmitForm implements PersistantSubmitFormInf{
	
	private static final String PERSISTENCE_UNIT_NAME = "EmConfigForForm";
	private static EntityManagerFactory factory;

	@Transactional
	public boolean CommitForm(String FirstName, String LastName,String SAddress, String City, String State, String ZIP, String Tel,	String Email, String Day, String Month, String Year, String likes,String Recommend, String Raffle, String Comments, String ECName1, String ECTel1, String ECName2, String ECTel2) {
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    FormInstance FormToPersist = new FormInstance();
	    EmergencyContact EC1 = new EmergencyContact();
	    EmergencyContact EC2 = new EmergencyContact();
	    
	    FormToPersist.setFirstName(FirstName);
	    FormToPersist.setLastName(LastName);
	    FormToPersist.setAddress(SAddress);
	    FormToPersist.setCity(City);
	    FormToPersist.setState(State);
	    FormToPersist.setZip(ZIP);
	    FormToPersist.setTel(Tel);
	    FormToPersist.setEmail(Email);
	    FormToPersist.setDay(Day);
	    FormToPersist.setMonth(Month);
	    FormToPersist.setYear(Year);
	    FormToPersist.setLikes(likes);
	    FormToPersist.setRecommend(Recommend);
	    FormToPersist.setRaffle(Raffle);
	    FormToPersist.setComments(Comments);
	    
	    EC1.setEContactName(ECName1);
	    EC1.setEContactPhone(ECTel1);
	    EC2.setEContactName(ECName2);
	    EC2.setEContactPhone(ECTel2);
	    
	    List<EmergencyContact> ECCollection = new ArrayList<EmergencyContact>();
		ECCollection.add(EC1);
		ECCollection.add(EC2);
		
		FormToPersist.setEDetails(ECCollection);
		
	    em.getTransaction().begin();
	    em.persist(FormToPersist);
	    em.flush();
	    em.getTransaction().commit();
		return false;
    }
}
