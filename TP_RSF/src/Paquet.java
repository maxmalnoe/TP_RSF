
public class Paquet {
	//paquet qui transite de la source à la destination, avec contraintes et taille différentes, délai à respecter pour chaque paquet
	//paquet issu d'un flux particulier (audio, videao, stream)	
	protected int TAILLEPACKET = 100;
	protected int DELAY = 0;
	protected int DATA [];
	
	public Paquet() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public int [] createPacket(String fluxname) {
		int tab []= new int [TAILLEPACKET];
		switch(fluxname) {
			case ("flux1") :
				DELAY=25;
				for(int i=0; i<TAILLEPACKET;i++) {
					if(Math.random()< 0.5) {
						tab[i]=0;
					}
					else {
						tab[i]=1;
					}
				}
				break;
				
			case ("flux2") :
				DELAY=50;
				for(int i=0; i<TAILLEPACKET;i++) {
					if(Math.random()< 0.5) {
						tab[i]=0;
					}
					else {
						tab[i]=1;
					}
				}
				break;
				
			case ("flux3") :
				DELAY=100;
				for(int i=0; i<TAILLEPACKET;i++) {
					if(Math.random()< 0.5) {
						tab[i]=0;
					}
					else {
						tab[i]=1;
					}
				}
				break;
			
			default: System.out.println("Non valide"); break;
				
		}
		return tab;
	}

}
