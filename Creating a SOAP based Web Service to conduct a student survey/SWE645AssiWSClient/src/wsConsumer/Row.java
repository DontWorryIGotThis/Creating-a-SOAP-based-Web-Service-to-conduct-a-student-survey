package wsConsumer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Row implements Serializable{
	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String Zip;
	String Tel;
	String Email;
	String Day;
	String Month;
	String Year;
	String Likes;
	String Recommend;
	String Raffle;
	String Comments;
	String ECName1;
	String ECName2;
	String ECPhone1;
	String ECPhone2;
	
	public Row(){}
	public Row(String firstname, String lastname, String address, String city, String state, String zip, String tel, String email, String day, String month, String year, String likes, String recommend, String raffle, String comments/*,String ECName1, String ECPhone1, String ECName2, String ECPhone2*/){
		this.FirstName = firstname;
		this.LastName = lastname;
		this.Address = address;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.Tel = tel;
		this.Email = email;
		this.Day = day;
		this.Month = month;
		this.Year = year;
		this.Likes = likes;
		this.Recommend = recommend;
		this.Raffle = raffle;
		this.Comments = comments;
		this.ECName1= ECName1;
		this.ECPhone1= ECPhone1;
		this.ECName2= ECName2;
		this.ECPhone2= ECPhone2;
	}
	

//-------------------------------------------------------------------------------Getters
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
	
	@Override
	public String toString(){
		return "FormInstance.toString=[ "+FirstName+" "+LastName+" "+Address+" "+City+" "+State+" "+Zip+" "+Tel+" "+Email+" "+Day+" "+Month+" "+Year+" "+Likes+" "+Recommend+" "+Raffle+" "+Comments;
	}
}
