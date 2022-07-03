import java.util.Scanner;

public class GRAMMATEIA extends XRHSTHS {

	public GRAMMATEIA(String email, String password, SYSTHMA s) {
		super(email, password, s);
	}


	private FAKELOS_AITHSHS fakelos;

	public boolean checkAithsh(FAKELOS_AITHSHS fakelos) {
		System.out.println("Plhktrologiste 'ok' an h aithsh"+fakelos.getId()+"einai dekth, 'oxi' diaforetika");
		 Scanner s=new Scanner (System.in);
		 String input= s.nextLine();
		 if(input=="ok") {
			 return true;
		 }
		 else {
			 return false;
		 }	 
	}
	/*καταστασεις αιτησης:
	    elliphs,upo ajiologhsh,egkekrimenh,
	 */
	public void UpdatePage(String katastash) {
		System.out.println("Pliktrologiste 'e' gia elliphs, 'u' gia upo ajiologhsh h 'e' gia egkekrimenh gia thn aithsh"+fakelos.getId());
		 Scanner s=new Scanner (System.in);
		 String input= s.nextLine();
		 if(input=="e") {
			 fakelos.getMyAithsh().setKatastash("elliphs");
		 }
		 else if(input=="u") {
			 fakelos.getMyAithsh().setKatastash("upo ajiologhsh");
		 }
		 else {
			 fakelos.getMyAithsh().setKatastash("egkekrimenh");
		 }
	}

	
	public void prwtokolisi(FAKELOS_AITHSHS fakelos) {
		System.out.println("Pliktrologiste 'prwtokolisi' gia na prwtokolisete thn aithsh h 'exit' gia ejodo");
		 Scanner scan=new Scanner (System.in);
		 String in= scan.nextLine();
		 if(in=="prwtokolisi") {
			 fakelos.getMyAithsh().setProtok(true);
		 }
		 else {
			 fakelos.getMyAithsh().setProtok(false);
		 }
	}

}