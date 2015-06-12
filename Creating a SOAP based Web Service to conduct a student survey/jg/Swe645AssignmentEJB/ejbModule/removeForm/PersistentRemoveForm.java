package removeForm;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.sun.istack.internal.logging.Logger;

import persistence.FormInstance;
import sun.util.logging.resources.logging;

@Stateless
public class PersistentRemoveForm implements PersistentRemoveFormInf {
	private static final long serialVersionUID = 1L;
	private static final String PERSISTENCE_UNIT_NAME = "EmConfigForForm";
	private static EntityManagerFactory factory;
	
	@Transactional
	public boolean RemoveForm(String Email) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    //Logger log = Logger.getLogger(this.getClass()); 
	    
	    try {
			em.getTransaction().begin();
			Query q = em.createQuery("from FormInstance t where t.Email = :Email").setParameter("Email", Email);
			List<FormInstance> FormListToDel = q.getResultList();
			for(FormInstance l: FormListToDel)	
				em.remove(l);		
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;	
		}
	}

}
