
public class Paquet {
	//paquet qui transite de la source à la destination, avec contraintes et taille différentes, délai à respecter pour chaque paquet
	//paquet issu d'un flux particulier (audio, videao, stream)	
	 protected static int taillepacket;
	 protected int delay;
	 protected int data [];
	 protected int id;
	 protected long createTime;
	
	public Paquet() {
		// TODO Auto-generated constructor stub
		this.taillepacket = 100;
		this.delay=0; // crainte de temps a respecter
		this.data = new int[taillepacket];
		this.id=0;
		this.createTime=0;
		
	}
	
	
	public static Paquet createPacket(String fluxname) {
		Paquet p = new Paquet();
		switch(fluxname) {
			case ("flux1") :
				p.delay=25;
				for(int i=0; i<taillepacket;i++) {
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
			
			default: System.out.println("Non valide");break;
				
		}
		return p;
	}

}
