import java.util.Scanner;

public class PROEDROS extends XRHSTHS {
	private String name;
	
	public PROEDROS(String email, String password, SYSTHMA s, String name) {
		super(email, password, s);
		this.name=name;
	}

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

	public void ElegxosSygkroushs(FAKELOS_AITHSHS fakelosAithshs) {
		for(TAKTIKO_MELOS m:fakelosAithshs.getListaTaktikwnMelwn()) {
			System.out.println("Pliktrologiste 'ok; an to taktiko melos"+m+"exei prosbash sthn aithsh, 'oxi' diaforetika");
			 Scanner sc=new Scanner (System.in);
			 String input= sc.nextLine();
			 if(input=="ok") {
				m.setExeiProsbash(true);	
				}
			 else {
				 m.setExeiProsbash(false);
			 }
		}
	}

}