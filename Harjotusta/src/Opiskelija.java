public class Opiskelija extends Henkilo {

	private int opintopisteet;
	
	public Opiskelija(String nimi, String osoite) {
		super(nimi, osoite);
		this.opintopisteet = 1;
		
	}
	
	public int getopintopisteita() {
		return this.opintopisteet;
		
	}
	public int opiskele() {
		return this.opintopisteet++;
	}
	@Override
	public String toString() {
		return super.toString() + "\n  opintopisteita " + this.getopintopisteita();
	

	public int opiskele() {
		return this.opintopisteet++;
		
	}

}
