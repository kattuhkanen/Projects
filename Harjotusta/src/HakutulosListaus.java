import java.util.ArrayList;
import java.util.List;

public class HakutulosListaus {

    public static void main(String[] args) {
        List<TavallinenIlmoitus> hakutulokset = new ArrayList<>();

        // N�m� tulokset vastaavat hakua "keitti�":
        TavallinenIlmoitus matto = new TavallinenIlmoitus("Matto", "Hyv� keitti�n matto", "Martta");
        AsuntoIlmoitus yksioPorvoossa = new AsuntoIlmoitus("Yksi� Porvoossa", "Valoisa yksi�", "Pekka", "Porvoonkatu 1",
                1, 27);
        MatkailuvaunuIlmoitus adriaMatrix = new MatkailuvaunuIlmoitus("Adria Matrix", "Hyv� asuntoauto",
                "Asuntoauto Oy", 2020, "bensa", "automaatti");

        // getKuvausteksti on m��ritelty TavallinenIlmoitus-luokassa, ja se periytyy
        // kaikille aliluokille
        String kuvaus = yksioPorvoossa.getKuvausteksti();

        hakutulokset.add(matto);
        hakutulokset.add(yksioPorvoossa);
        hakutulokset.add(adriaMatrix);

        for (int i = 0; i < hakutulokset.size(); i++) {
            TavallinenIlmoitus ilmoitus = hakutulokset.get(i);

            // toString-metodia kutsutaan automaattisesti aina siit� luokasta, jonka olio
            // `ilmoitus` on
            System.out.println(ilmoitus.toString());
        }
    }
}
