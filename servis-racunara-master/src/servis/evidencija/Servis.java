package servis.evidencija;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import racunar.Desktop;
import racunar.LapTop;

public class Servis {

	private List<EvidencijaRacunara> racunari; 
	
	public Servis() {
		this.racunari = new ArrayList<>(); 
	}
	
	public void dodajRacunarNaServis(EvidencijaRacunara racunarZaEvidenciju) {
		racunari.add(racunarZaEvidenciju);
	}
	
	public void preuzmiURad(String evidencioniBroj) {
		for (EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencija.setStatusServisa(Status.U_RADU);
			}
		}
	}
	
	public void zavrsiServis(String evidencioniBroj) {
		for (EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencija.setStatusServisa(Status.ZAVRSEN_SERVIS);
				evidencija.setDatumZavrsetkaServisa(LocalDate.now());
			}
		}
	}
	
	public void racunariNaServisu() {
		for (EvidencijaRacunara evidencija : racunari) {
			evidencija.informacijeOEvidenciji();
		}
		////////////////////////////////////////////////////////////////////////////////////////////
	}
		public void desktopRacunariNaServisu() {
			
			for (EvidencijaRacunara evidencija : racunari) {
				if(evidencija.getRacunar() instanceof Desktop) {
				evidencija.informacijeOEvidenciji(); {
					// import desktop
					
				}
				}
			
			
			}
		}
		
				
				public void laptopRacunariNaServisu() {
					
					for (EvidencijaRacunara evidencija : racunari) {
						if(evidencija.getRacunar() instanceof LapTop) {
						evidencija.informacijeOEvidenciji(); {
							// import desktop
				
				
				
						}
						

						}
		
						}
		
			}
					
					public void spisakRacunaraURadu() {
						
						for (EvidencijaRacunara evidencija : racunari) {
							if(evidencija.getStatusServisa().equals(Status.U_RADU)){
								evidencija.informacijeOEvidenciji(); {
								}
								//}
								//else {
								//	System.out.println("Nijedan nije u radu");
									
								//}
							
								
								// isprobati sa else i BREAK
								
								// ili neki boolean
									// 3 puta stampa jer je u petlji
							
								// pomocu booleana
								
								// van viticastih if
								
								
					// nije get evidencioni broj vc statusservisa
								}
					
							}
					
						
					}


					

	}

