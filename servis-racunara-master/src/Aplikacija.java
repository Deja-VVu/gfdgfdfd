
import java.util.Scanner;
import racunar.Desktop;
import racunar.LapTop;
import racunar.Racunar;
import racunar.TipKucista;
import servis.evidencija.EvidencijaRacunara;
import servis.evidencija.Servis;

public class Aplikacija {

	public static void main(String[] args) {
		//priprema podataka
		Servis servisSasa = new Servis();
		
		Racunar djoletovRacunar = new LapTop("87897987", 2.5D, "Toshiba", 15.6);
		EvidencijaRacunara djoletovaEvidencija = new EvidencijaRacunara("1A", "Djordje", djoletovRacunar);
		
		servisSasa.dodajRacunarNaServis(djoletovaEvidencija);
		
		Racunar tanjinRacunar = new LapTop("878979", 2.4D, "dell", 15.6);
		EvidencijaRacunara tanjinaEvidencija = new EvidencijaRacunara("3A", "Tanja", tanjinRacunar);
		
		servisSasa.dodajRacunarNaServis(tanjinaEvidencija);

		
		Racunar novRacunar = new Desktop("d2424", 2.6, "dell", TipKucista.ATX);
		EvidencijaRacunara novRacunarEvidencija= new EvidencijaRacunara("4A","Milos",novRacunar);
		
		servisSasa.dodajRacunarNaServis(novRacunarEvidencija);
		
		Scanner ulaz = new Scanner(System.in);

		while(true) {
		System.out.println("Komande za rad sa servisom: ");
		System.out.println("   0 - izlazak iz aplikacije");
		System.out.println("   1 - pregled racunara na servisu");
		System.out.println("   2 - unos nove evidencije");
		System.out.println("   3 - uzmi na obradu");
		System.out.println("   4 - zavrsi servis");
		System.out.println("   8 - spisak Laptopova");
		System.out.println("   9 - spisak Desktopova");

		int ulaznaKomanda = ulaz.nextInt();
		if(ulaznaKomanda == 0) {
			System.out.println("*** Izlaz iz aplikacije. ***");
			break;
		}
		if(ulaznaKomanda == 1) {
			servisSasa.racunariNaServisu();
		}
		if(ulaznaKomanda == 2) {
			EvidencijaRacunara er = Helper.unesiEvidenciju(ulaz);
			servisSasa.dodajRacunarNaServis(er);
			System.out.println("*** Uspesno ste dodali racunar u servis. ***");
			System.out.println("");
		}
		if(ulaznaKomanda == 3) {
			System.out.println("Unesi evidencioni broj: ");
			String evidencioniBroj = ulaz.next();
			servisSasa.preuzmiURad(evidencioniBroj);
		}
		if(ulaznaKomanda == 4) {
			System.out.println("Unesi evidencioni broj: ");
			String evidencioniBroj = ulaz.next();
			servisSasa.zavrsiServis(evidencioniBroj);
		}
		
		if (ulaznaKomanda == 7) {
			servisSasa.spisakRacunaraURadu();
			
			//System.out.println("Serviseri zabusavaju!!!");
			// ne moze else
		
		if (ulaznaKomanda == 8) {
			servisSasa.desktopRacunariNaServisu();
		}
		
		if (ulaznaKomanda == 9) {
			servisSasa.laptopRacunariNaServisu();
		}
		
		
		
		
		}
		
		
		}
	}

}
