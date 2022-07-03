
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KATHIGITHS extends XRHSTHS {
	private String name;
	private String last_name;
	//private AITHSH neaAITHSH; //EPREPE NA PROSTETHEI

	public KATHIGITHS(String email, String password, SYSTHMA s,String name,String last_name,AITHSH neaAITHSH) {
		super(email, password, s);
		this.name=name;
		this.last_name=last_name;
		//this.neaAITHSH=neaAITHSH;
	}
	public void YpobolhAithshs(AITHSH neaAithsh) {
		//Date date, ArrayList<String> arxeia, KATHIGITHS myKathigiths, String katastash, boolean protok
		AITHSH neaAITHSH=new AITHSH(null, null, null, last_name, false);
	while(true) {
		System.out.println("Plhktrologhste 'e' gia eisagwgh arxeiwn kai 'o' gia ejodo");
		 Scanner sc=new Scanner (System.in);
		 String in= sc.nextLine(); 
		if(in=="e") {
			System.out.println("Plhktrologhst to keimeno sas");
			 Scanner s=new Scanner (System.in);
			 String keimeno= s.nextLine(); 
			 neaAithsh.getArxeia().add(keimeno);
		}
		else {
			break;
		}
	}
	Date currentDate=new Date();
	neaAithsh.setDate(currentDate);
	neaAithsh.setMyKathigiths(this);	
}
	}