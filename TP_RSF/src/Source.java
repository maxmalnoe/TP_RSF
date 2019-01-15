import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Source {
	//recout des flux que la source achemine sur la topologie jusqu'a la destination
	protected static Queue<Paquet> listAttente;
	
	public Source() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void fillListAttente() {
		listAttente = new ArrayBlockingQueue<Paquet>(20);
		for(int i =0; i<10;i++) {
			
			Paquet p = new Paquet();
			p = Paquet.createPacket("flux1");
			p.id=i;
			p.createTime=System.currentTimeMillis();
			try {
			listAttente.add(p);
			}catch (NullPointerException e) {
				System.out.print("NullPointerException caught");
			}
		}
		System.out.println(listAttente);
		
	}
	
	public static void consumeListAttente() {
		if(!listAttente.isEmpty()) {
			
		
		Paquet p = listAttente.poll();
		System.out.println("ID: "+p.id+", Date de création du paquet: "+p.createTime+"; Taille du paquet: "+p.taillepacket);
		Paquet p1 = listAttente.poll();
		System.out.println("ID: "+p1.id+", Date de création du paquet: "+p1.createTime+"; Taille du paquet: "+p1.taillepacket);
		}
		
	}
	
	public static void main(String[] args) {
		fillListAttente();
		consumeListAttente();
	}

}
