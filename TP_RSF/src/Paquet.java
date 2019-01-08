
public class Paquet {
	//paquet qui transite de la source à la destination, avec contraintes et taille différentes, délai à respecter pour chaque paquet
	//paquet issu d'un flux particulier (audio, videao, stream)	
	static int taillepacket;
	static int delay;
	static int data [];
	
	public Paquet() {
		// TODO Auto-generated constructor stub
		taillepacket = 100;
		delay=0;
		data = new int[taillepacket];
		
	}
	
	public static Paquet createPacket(String fluxname) {
		Paquet p = new Paquet();
		p.taillepacket = taillepacket;
		switch(fluxname) {
			case ("flux1") :
				p.delay=25;
				for(int i=0; i<p.taillepacket;i++) {
					if(Math.random()< 0.5) {
						p.data[i]=0;
					}
					else {
						p.data[i]=1;
					}
				}
				break;
				
			case ("flux2") :
				p.delay=50;
				for(int i=0; i<taillepacket;i++) {
					if(Math.random()< 0.5) {
						p.data[i]=0;
					}
					else {
						p.data[i]=1;
					}
				}
				break;
				
			case ("flux3") :
				p.delay=100;
				for(int i=0; i<taillepacket;i++) {
					if(Math.random()< 0.5) {
						p.data[i]=0;
					}
					else {
						p.data[i]=1;
					}
				}
				break;
			
			default: System.out.println("Non valide"); break;
				
		}
		return p;
	}

}
