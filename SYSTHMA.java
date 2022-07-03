import java.util.ArrayList;

public class SYSTHMA {

	private ArrayList<XRHSTHS> stoixeiaXrhstwn;
	
	private ArrayList<FAKELOS_AITHSHS> fakelosAithshs;
	
	
	public SYSTHMA(ArrayList<XRHSTHS> stoixeiaXrhstwn, ArrayList<FAKELOS_AITHSHS> fakelosAithshs) {
		super();
		this.stoixeiaXrhstwn = stoixeiaXrhstwn;
		this.fakelosAithshs = fakelosAithshs;
	}
	public ArrayList<XRHSTHS> getStoixeiaXrhstwn() {
		return stoixeiaXrhstwn;
	}
	public void setStoixeiaXrhstwn(ArrayList<XRHSTHS> stoixeiaXrhstwn) {
		this.stoixeiaXrhstwn = stoixeiaXrhstwn;
	}
	public ArrayList<FAKELOS_AITHSHS> getFakelosAithshs() {
		return fakelosAithshs;
	}
	public void setFakelosAithshs(ArrayList<FAKELOS_AITHSHS> fakelosAithshs) {
		this.fakelosAithshs = fakelosAithshs;
	}
	public boolean addXrhsth(XRHSTHS aXrhsths) { //XREIASTHKE KAI AYTH H BOOLEAN METHODOS
		//if(stoixeiaXrhstwn.size()!=0) {
		if(!stoixeiaXrhstwn.isEmpty()) {
		for(XRHSTHS x:stoixeiaXrhstwn) {
			if(aXrhsths.getEmail()==x.getEmail()) {
				System.out.println("To email xrhsimopoiohtai hdh");
				return false;
			}}
		}
		stoixeiaXrhstwn.add(aXrhsths);
		return true;
	}
	

	
}