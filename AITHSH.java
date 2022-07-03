import java.util.ArrayList;
import java.util.Date;

public class AITHSH {

	private Date date; //XREIASTHKE NA ALLAXTEI APO STRING SE DATE, TO CLASS DIAGRAM DEN DINEI
	private ArrayList<String> arxeia;         //AYTH TH DYNATOTHTA
	private KATHIGITHS myKathigiths;
	private String katastash;
	private boolean protok; //EPREPE NA PROSTETHEI
	
	
	public AITHSH(Date date, ArrayList<String> arxeia, KATHIGITHS myKathigiths, String katastash, boolean protok) {
		super();
		this.date = date;
		this.arxeia = arxeia;
		this.myKathigiths = myKathigiths;
		this.katastash = katastash;
		this.protok = protok;
	}
	public String getKatastash() {
		return katastash;
	}
	public void setKatastash(String katastash) {
		this.katastash = katastash;
	}
	public boolean isProtok() {
		return protok;
	}
	public void setProtok(boolean protok) {
		this.protok = protok;
	}
	public ArrayList<String> getArxeia() {
		return arxeia;
	}
	public void setArxeia(ArrayList<String> arxeia) {
		this.arxeia = arxeia;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date currentDate) {
		this.date = currentDate;
	}
	public KATHIGITHS getMyKathigiths() {
		return myKathigiths;
	}
	public void setMyKathigiths(KATHIGITHS myKathigiths) {
		this.myKathigiths = myKathigiths;
	}
	

}