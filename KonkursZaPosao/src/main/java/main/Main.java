package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) {


        ArrayList<Kandidat> kandidati = new ArrayList<Kandidat>();

        String prekid = "";
        while(!prekid.equals("Prekid")) {
            Kandidat dodavanjeKandidata = new Kandidat();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Uneti ime, prezime i godine kandidata: ");
            dodavanjeKandidata.setIme(scanner.next());
            dodavanjeKandidata.setPrezime(scanner.next());
            dodavanjeKandidata.setGodine(scanner.nextInt());

            System.out.println("Uneti podaci o kandidatu su: " + dodavanjeKandidata.getIme() + " " + dodavanjeKandidata.getPrezime() + " " + dodavanjeKandidata.getGodine());

                if (kandidati.contains(dodavanjeKandidata.getIme()) && kandidati.contains(dodavanjeKandidata.getPrezime()) && kandidati.contains(dodavanjeKandidata.getGodine())) {
                    System.out.println("Kandidat se vec nalazi u bazi!");
                } else {
                    kandidati.add(dodavanjeKandidata);
                }

            System.out.println("Ukoliko zelite da unesete novog kandidata napisite 'Unesi', a ukoliko zelite da prekinete sa unosom, napisite 'Prekid'.");

            String noviPrekid = scanner.next();
            prekid = noviPrekid;

        }
        System.out.println("Ispis unetih kandidata: ");
        for (int i = 0; i < kandidati.size(); i++) {
            System.out.println("Podaci o kandidatu: " + kandidati.get(i));
        }
    }
}


//            String unetoIme = scanner.next();
//            String unetoPrezime = scanner.next();
//            int uneteGodine = scanner.nextInt();

//            Kandidat unosKandidata = dodavanjeKandidata;
//            for (int i = 0; i < kandidati.size(); i++) {
//                if (kandidati.equals(kandidati.get(i))) {
//                    System.out.println("Ovaj kandidat vec postoji u bazi podataka!");
//                } else {
//
//                }
//            }