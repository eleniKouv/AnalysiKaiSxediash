import java.util.ArrayList;

public class FAKELOS_AITHSHS {

	private String id;
	private ArrayList<TAKTIKO_MELOS> listaTaktikwnMelwn; //EPREPE NA EINAI LISTA ANTI GIA APLA TAKTIKO MELOS
	private AITHSH myAithsh; //EPREPE NA PROSTETHEI
	
	
	public FAKELOS_AITHSHS(String id, ArrayList<TAKTIKO_MELOS> listaTaktikwnMelwn, AITHSH myAithsh) {
		super();
		this.id = id;
		this.listaTaktikwnMelwn = listaTaktikwnMelwn;
		this.myAithsh = myAithsh;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<TAKTIKO_MELOS> getListaTaktikwnMelwn() {
		return listaTaktikwnMelwn;
	}
	public void setListaTaktikwnMelwn(ArrayList<TAKTIKO_MELOS> listaTaktikwnMelwn) {
		this.listaTaktikwnMelwn = listaTaktikwnMelwn;
	}
	public AITHSH getMyAithsh() {
		return myAithsh;
	}
	public void setMyAithsh(AITHSH myAithsh) {
		this.myAithsh = myAithsh;
	}

}