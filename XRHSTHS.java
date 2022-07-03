public class XRHSTHS {

	private String email;
	private String password;
	private SYSTHMA s;


	public XRHSTHS(String email, String password, SYSTHMA s) {
		super();
		this.email = email;
		this.password = password;
		this.s = s;
	}

	public boolean enter(String email, String password) {
		for(XRHSTHS i:s.getStoixeiaXrhstwn()) {
			if(i.getEmail()==email) {
				if(i.password==password) {
					return true;
				}
				else {
					System.out.println("Lathos kwdikos prosbashs");
					return false;
				}
			}
		}
		System.out.println("Den brethike xrhsths me auta ta stoixeia");
		return false;
	}

	public boolean dhmiourgiaXrhsth(String email, String password, SYSTHMA pinakasStoixeiwn) {
		XRHSTHS aXrhsths=new XRHSTHS(email,password,pinakasStoixeiwn);
		return pinakasStoixeiwn.addXrhsth(aXrhsths);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}