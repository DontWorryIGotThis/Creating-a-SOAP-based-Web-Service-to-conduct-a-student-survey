package persistence;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forminstance")
public class FormInstance {
	@Id
	private String Email;
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String State;
	private String Zip;
	private String Tel;	
	private String Day;
	private String Month;
	private String Year;
	private String Likes;
	private String Recommend;
	private String Raffle;
	private String Comments;
	
	//private List<EmergencyContact> EDetails;
	//private persistence.EmergencyContact EDetails;
	
	//-------------------------------------------------------------------------------Getters
	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable(name="forminstanceedetails", joinColumns={@JoinColumn(name="Email")}, inverseJoinColumns={@JoinColumn(name="econtactphone")})
	private List<EmergencyContact> EDetails;
	public List<EmergencyContact> getEDetails() {
		return EDetails;
	}
	
	public void setEDetails(List<EmergencyContact> eDetails) {
		EDetails = eDetails;
	}
	
	public String getFirstName(){
		return FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public String getAddress(){
		return Address ;
	}
	public String getCity(){
		return City ;
	}
	public String getState(){
		return State ;
	}
	public String getZip(){
		return Zip;
	}
	public String getTel(){
		return Tel ;
	}
	public String getEmail(){
		return Email;
	}
	public String getDay(){
		return Day ;
	}
	public String getMonth(){
		return Month ;
	}
	public String getYear(){
		return Year ;
	}
	public String getLikes(){
		return Likes;
	}
	public String getRecommend(){
		return Recommend ;
	}
	public String getRaffle(){
		return Raffle ;
	}
	public String getComments(){
		return Comments;
	}
	
	//-------------------------------------------------------------------------------Setters
	
	public void setFirstName(String a){
		FirstName=a;
	}
	public void setLastName(String a){
		LastName= a;
	}
	public void setAddress(String a){
		Address=a ;
	}
	public void setCity(String a){
		City=a ;
	}
	public void setState(String a){
		State=a ;
	}
	public void setZip(String a){
		Zip=a;
	}
	public void setTel(String a){
		Tel =a;
	}
	public void setEmail(String a){
		Email=a;
	}
	public void setDay(String a){
		Day=a ;
	}
	public void setMonth(String a){
		Month= a ;
	}
	public void setYear(String a){
		Year =a;
	}
	public void setLikes(String a){
		Likes= a;
	}
	public void setRecommend(String a){
		Recommend =a ;
	}
	public void setRaffle(String a){
		Raffle =a;
	}
	public void setComments(String a){
		Comments= a;
	}
	
	@Override
	public String toString(){
		return "FormInstance.toString=[ "+FirstName+" "+LastName+" "+Address+" "+City+" "+State+" "+Zip+" "+Tel+" "+Email+" "+Day+" "+Month+" "+Year+" "+Likes+" "+Recommend+" "+Raffle+" "+Comments;
	}
		

}
