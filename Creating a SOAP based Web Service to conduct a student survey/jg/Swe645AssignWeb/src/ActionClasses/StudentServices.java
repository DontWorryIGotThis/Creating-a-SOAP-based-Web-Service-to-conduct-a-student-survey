package ActionClasses;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import SubmitForm.PersistantSubmitFormInf;


import com.opensymphony.xwork2.ActionSupport;

public class StudentServices extends ActionSupport implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Form variables
	private String FirstName;
	private String LastName;
	private String SAddress;
	private String City;
	private String State;
	private String ZIP;
	private String Tel;
	private String Email;
	private String Day;
	private String Month;
	private String Year;
	private List<String> Liked;
	private String Recommend;
	private String Raffle;
	private String Comments;
	private Integer MEAN;
	private Integer STDDeviation;
	private String ECName1;
	private String ECName2;
	private String ECTel1;
	private String ECTel2;
	
	private ArrayList<String> ListOfForms;
	private RaffleObject a;
		
//----------------------------------------------------------------------Setters
	public void setFirstName(String fname){
		FirstName = fname;
	}
	public void setLastName(String lname){
		LastName = lname;
	}
	public void setSAddress(String saddr){
		SAddress = saddr;
	}
	public void setCity(String cty){
		City = cty;
	}
	public void setState(String state){
		State = state;
	}
	public void setZIP(String sip){
		ZIP = sip;
	}
	public void setTel(String tel){
		Tel = tel;
	}
	public void setEmail(String mail){
		Email = mail;
	}
	public void setDay(String day){
		Day = day;
	}
	public void setMonth(String mon){
		Month = mon;
	}
	public void setYear(String yea){
		Year = yea;
	}
	public void setLiked(List<String> like){
		Liked = like;
	}
	public void setRecommend(String rec){
		Recommend = rec;
	}
	public void setRaffle(String raf){
		Raffle = raf;
	}
	public void setComments(String com	){
		Comments = com;
	}

	public String getECName1() {
		return ECName1;
	}
	public void setECName1(String eCName1) {
		ECName1 = eCName1;
	}
	public String getECName2() {
		return ECName2;
	}
	public void setECName2(String eCName2) {
		ECName2 = eCName2;
	}
	public String getECTel1() {
		return ECTel1;
	}
	public void setECTel1(String eCTel1) {
		ECTel1 = eCTel1;
	}
	public String getECTel2() {
		return ECTel2;
	}
	public void setECTel2(String eCTel2) {
		ECTel2 = eCTel2;
	}
	//-------------------------------------------------------------------------------Getters
	public String getFirstName(){
		return FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public String getSAddress(){
		return SAddress ;
	}
	public String getCity(){
		return City ;
	}
	public String getState(){
		return State ;
	}
	public String getZIP(){
		return ZIP ;
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
	public List<String> getLiked(){
		return Liked;
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
	
	public String geta(){
		return a.Mean+" and "+a.StdDeviation;
	}
	public Integer getMEAN(){
		return MEAN ;
	}
	public Integer getSTDDeviation(){
		return STDDeviation ;
	}
	public ArrayList<String> getListOfForms(){
		return ListOfForms;
	}
	
	
	
	// ------------------------ Raffle related methods
	public static class RaffleObject implements Serializable{
		private static final long serialVersionUID = 1L;
		String RaffleString;
		private Integer Mean;
		Integer variance;
		private Integer StdDeviation;
		public RaffleObject(String RafString) {
			RaffleString = RafString;		
		}
		
		public Integer getMean(){
			return Mean;
		}
		
		public Integer getStdDeviation(){
			return StdDeviation;					
		}
		
		public boolean Raffle(){
			Integer a1 =Integer.parseInt(RaffleString.substring(0, 2));
			Integer a2 =Integer.parseInt(RaffleString.substring(3, 5));
			Integer a3 =Integer.parseInt(RaffleString.substring(6, 8));
			Integer a4 =Integer.parseInt(RaffleString.substring(9, 11));
			Integer a5 =Integer.parseInt(RaffleString.substring(12, 14));
			Integer a6 =Integer.parseInt(RaffleString.substring(15, 17));
			Integer a7 =Integer.parseInt(RaffleString.substring(18, 20));
			Integer a8 =Integer.parseInt(RaffleString.substring(21, 23));
			Integer a9 =Integer.parseInt(RaffleString.substring(24, 26));
			Integer a10 =Integer.parseInt(RaffleString.substring(27, 29));		
			
			Mean = (a1+a2+a3+a4+a5+a6+a7+a8+a9+a10)/10;
			
			Integer b1 = a1 - Mean;
			Integer b2 = a2 - Mean;
			Integer b3 = a3 - Mean;
			Integer b4 = a4 - Mean;
			Integer b5 = a5 - Mean;
			Integer b6 = a6 - Mean;
			Integer b7 = a7 - Mean;
			Integer b8 = a8 - Mean;
			Integer b9 = a9 - Mean;
			Integer b10 = a10 - Mean;
			
			b1=b1*b1;
			b2=b2*b2;
			b3=b3*b3;
			b4=b4*b4;
			b5=b5*b5;
			b6=b6*b6;
			b7=b7*b7;
			b8=b8*b8;
			b9=b9*b9;
			b10=b10*b10;
			
			variance = b1+b2+b3+b4+b5+b6+b7+b8+b9+b10;
			StdDeviation =  (int) Math.sqrt(variance);
			System.out.println(Mean);
			if(Mean>=90)
				return true;
			
			return false;
		}
	}
	
	
	public String CreateForm() throws IOException{
		SubmitForm();
		a = new RaffleObject(Raffle);
		
		if(a.Raffle()){
			MEAN= a.getMean();
			STDDeviation = a.getStdDeviation();
			return "raffle";
		}
		else
		{
			MEAN= a.getMean();
			STDDeviation = a.getStdDeviation();
			return "success"; 
		}
			
	}
	
	public boolean SubmitForm(){
		InitialContext con;
		String likes ="";
		for(String a :Liked){
			likes = likes+" "+a;
		}
		try {
			con = new InitialContext();
			PersistantSubmitFormInf SubmitFormObj = (PersistantSubmitFormInf) con.lookup("java:global/Swe645AssiEAR/Swe645AssignmentEJB/PersistantSubmitForm!SubmitForm.PersistantSubmitFormInf");
			SubmitFormObj.CommitForm(FirstName, LastName, SAddress, City, State, ZIP, Tel, Email, Day, Month, Year, likes, Recommend, Raffle, Comments, ECName1, ECTel1, ECName2, ECTel2);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String toString (){
		return FirstName+"*"+LastName+"*"+SAddress+"*"+City+"*"+State+"*"+ZIP+"*"+Tel+"*"+Email+"*"+Day+"*"+Month+"*"+Year+"*"+Liked+"*"+Recommend+"*"+Raffle+"*"+Comments+"*";
	}
	
	
	
	@Override
	public void validate(){
		
		String RegularXp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		if(FirstName == null || FirstName.trim().equals(""))
			addFieldError("FirstName", "Please enter a first name");
		if(LastName == null || LastName.trim().equals(""))
			addFieldError("LastName", "Please enter a Last name");
		if(SAddress == null || SAddress.trim().equals(""))
			addFieldError("SAddress", "Please enter the street address");
		if(City == null || City.trim().equals(""))
			addFieldError("City", "Please enter the name of the city");
		if(State == null || State.trim().equals(""))
			addFieldError("State", "Please enter the name of the state");
		if(ZIP == null || ZIP.trim().equals("") || (!(ZIP.matches("-?\\d+(\\.\\d+)?")))|| ZIP.length()!=5)
			addFieldError("ZIP", "Please enter you 5 digit zip code");
		if(Tel == null || Tel.trim().equals("") || (!(Tel.matches("-?\\d+(\\.\\d+)?")))|| Tel.length()!=10)
			addFieldError("Tel", "Please enter your 10 digit telephone number");
		if(Email == null || Email.trim().equals("")||(!(Email.matches(RegularXp))))
			addFieldError("Email", "Please enter your email address");
		if(Day == null || Day.trim().equals("")||(!(Day.matches("-?\\d+(\\.\\d+)?"))))
			addFieldError("Day", "Please enter the date of the month in 2 digits between 1 and 31");
		if(Month == null || Month.trim().equals("")||(!(Month.matches("-?\\d+(\\.\\d+)?"))))
			addFieldError("Month", "Please enter the month is 2 digits between 1 and 12");
		if(Year == null || Year.trim().equals("") ||(!(Year.matches("-?\\d+(\\.\\d+)?"))))
			addFieldError("Year", "Please enter the year using 4 digits");
		if(Liked == null || Liked.size() == 0)
			addFieldError("Liked", "Please checkmark according to what you like about the campus");
		if(Recommend == null || Recommend.trim().equals(""))
			addFieldError("Recommend", "Please let us know if you intend on recommending the school to others");
		if(Raffle == null || Raffle.trim().equals(""))
			addFieldError("Raffle", "Please enter 10 two digit number separated by a comma (,)");
		if(Comments == null || Comments.trim().equals(""))
			addFieldError("Comments", "Please mention your comments below");
	}
	
	public ArrayList<String> listSurvey(){
		File SurveyListFile = new File("/SurveyLister.txt");
		FileReader ReadFile;
		ListOfForms=new ArrayList<String>();
		try {
			ReadFile = new FileReader(SurveyListFile);
			BufferedReader ReadBuffer = new BufferedReader(ReadFile);
			String b;
			while (!((b = ReadBuffer.readLine())==null))
				ListOfForms.add(b);
			ReadFile.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return ListOfForms;
	}
}
