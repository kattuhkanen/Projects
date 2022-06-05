
public class Henkilotesti{

	public static void main(String[] args) {
		//Henkilo ada = new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa");
		//Henkilo esko = new Henkilo("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
		
		//System.out.println(ada);
		//System.out.println(esko);

		
		Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
		System.out.println(olli);
		//int op = olli.getopintopisteita();
		//System.out.println(op);
		
		olli.opiskele();
		System.out.println(olli);
	}

}	

