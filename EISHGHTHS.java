import java.util.Scanner;

public class EISHGHTHS extends TAKTIKO_MELOS {
	private EISHGHSH myEishghsh;


	public EISHGHTHS(String email, String password, SYSTHMA s,int prothesmia,String name,boolean exeiProsbash,FAKELOS_AITHSHS fakelos,EISHGHSH myEishghsh) {
		super(email,password,s,prothesmia,name,exeiProsbash,fakelos);
		this.myEishghsh=myEishghsh;
	}
	public void writeEishghsh(EISHGHSH myEishghsh) {
	   	System.out.println("Parakalw grapste thn eishghsh sas");
		 Scanner sc=new Scanner (System.in);
		 String keimeno= sc.nextLine(); 
		 myEishghsh.setKeimenoEishghshs(keimeno);
	}

}