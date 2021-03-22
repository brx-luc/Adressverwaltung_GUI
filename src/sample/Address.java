package sample;

public class Address {
    private String vorname;
    private String nachname;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public Address(String vorname, String nachname, String strasse, String hausnummer, String plz, String ort){
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }
}
