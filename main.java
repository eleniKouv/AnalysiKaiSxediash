import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	 SYSTHMA s=new SYSTHMA(null,null);
	 AITHSH neaAithsh = null;
	 KATHIGITHS k;
	 // ArrayList<XRHSTHS> stoixeiaXrhstwn, ArrayList<FAKELOS_AITHSHS> fakelosAithshs
	 ArrayList<String> arx=new ArrayList();
	 arx.add("arx1");
	 arx.add("arx2");
	 k=new KATHIGITHS("nikolaidhs@uom.edu.gr","nik12345", s, "nikos","nikolaidhs", neaAithsh);
	 k.YpobolhAithshs(neaAithsh);
	
	  
	 //DHMIOYRGIA_XRHSTH
	 System.out.println("Parakalw eisagete to email sas");
	 Scanner scan=new Scanner (System.in);
	 String email= scan.nextLine();
	 System.out.println("Parakalw eisagete ton kwdiko prosbashs pou epithimite");
	 Scanner scan2=new Scanner (System.in);
	 String kwd= scan2.nextLine();
	 XRHSTHS x1=new XRHSTHS(email,kwd,s); 
	 x1.dhmiourgiaXrhsth(email, kwd, s); //prosthikh xrhsth sto systhma
	 
	 //EISODOS STO SYSTHMA
	 System.out.println("Enter email");
	 Scanner sc=new Scanner (System.in);
	 String email1= sc.nextLine();    
	 System.out.println("Enter password");
	 Scanner sc2=new Scanner (System.in);
	 String password= sc.nextLine();    
	 x1.enter(email1,password);
	}

}
