package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.resteasy.spi.touri.MappedBy;

@Entity
@Table(name="emergencycontact")
public class EmergencyContact {
	
	@Id
	@Column(name="econtactphone")
	String EContactPhone;
	String EContactName;
	
	public String getEContactPhone() {
		return EContactPhone;
	}
	public void setEContactPhone(String eContactPhone) {
		EContactPhone = eContactPhone;
	}
	public String getEContactName() {
		return EContactName;
	}
	public void setEContactName(String eContactName) {
		EContactName = eContactName;
	}
	
	
	

}
