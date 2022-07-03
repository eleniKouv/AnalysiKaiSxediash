import java.util.Scanner;

public class TAKTIKO_MELOS extends XRHSTHS {

	private int prothesmia;
	private String name;
	private boolean exeiProsbash;
	private FAKELOS_AITHSHS fakelos; //EPREPE NA PROSTETHEI

	public TAKTIKO_MELOS(String email, String password, SYSTHMA s,int prothesmia,String name,boolean exeiProsbash,FAKELOS_AITHSHS fakelos) {
		super(email, password, s);
		this.prothesmia=prothesmia;
		this.name=name;
		this.exeiProsbash=exeiProsbash;
		this.fakelos=fakelos;
	}
	public void axiologhshAithshs(String keimenoAxiologhshs, boolean apofash) {
		System.out.println("Parakalw plhktrologiste to keimeno ths ajiologhshs");
		Scanner scan=new Scanner (System.in);
		keimenoAxiologhshs= scan.nextLine();
		System.out.println("Pliktrologiste 'e' gia egkekrimenh h 'a' gia apporiptea aithsh");
		Scanner s=new Scanner (System.in);
		String in= s.nextLine();
		if(in=="e") {
			fakelos.getMyAithsh().setProtok(true);
		}
		else {
			fakelos.getMyAithsh().setProtok(false);
		}
	}
	public boolean isExeiProsbash() {
		return exeiProsbash;
	}
	public void setExeiProsbash(boolean exeiProsbash) {
		this.exeiProsbash = exeiProsbash;
	}

}