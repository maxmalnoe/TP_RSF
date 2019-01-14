
public class Flux {
	//flux audio ou video ou autres contenant un certain nombre de paquets avec des délai et des priorité
		//exemple: flux audio de 5 paquets de taille 10 avec un délai de 25ms
	public Flux() {
		// TODO Auto-generated constructor stub
	}
	
	public static void createFlux() {
		Paquet p = new Paquet();
		p = Paquet.createPacket("flux1");
		System.out.println("le paquet :"+p.data);
	}

	public static void main(String[] args) {
		
		createFlux();
	}
}
