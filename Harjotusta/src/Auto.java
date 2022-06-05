package viikko5;

public class Auto {



    /*

     * N�m� muuttujat ovat jokaiselle autolle yksil�lliset ja ne s�ilyv�t koko olion

     * olemassaolon ajan.

     */

    private String merkki;

    private int kilometrit;



    /**

     * T�ll� konstruktorilla alustetaan olion muuttujiin new-luontik�skyss� annetut

     * arvot.

     * 

     * @param merkki

     */

    public Auto(String merkki) {

        this.merkki = merkki;

        this.kilometrit = 0;

    }



    /**

     * T�ll� julkisella metodilla tarjotaan ulkopuolisille luokille mahdollisuus

     * muuttaa auton matkamittaria.

     * 

     * @param kilometrit Kasvatettava kilometrim��r� kokonaislukuna

     */

    public void aja(int kilometrit) {

        this.kilometrit += kilometrit;

    }



    /**

     * toString-metodin avulla olioista voidaan muodostaa automaattisesti loogisia

     * merkkijonoesityksi�.

     */

    @Override

    public String toString() {

        return this.merkki + ", " + this.kilometrit + " km.";

    }

    

    

}