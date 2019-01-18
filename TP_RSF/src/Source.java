import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;

public class Source {
	//recout des flux que la source achemine sur la topologie jusqu'a la destination
	protected static Queue<Paquet> listAttente;


	public Source() {
		// TODO Auto-generated constructor stub

	}

	public static void fillListAttente(List<Paquet> lp) {
		for (Paquet p : lp) {
			try {if(listAttente.size()<20) {
				listAttente.add(p);
			}
			}catch (NullPointerException e) {
				System.out.print("NullPointerException caught");
			}

			System.out.println(listAttente);
		}


	}

	public static List<Paquet> chooseList(List<Paquet> lp1,List<Paquet> lp2,List<Paquet> lp3){
		List<Paquet>lp= new ArrayList<>();
		/*for(int i=0; i<lp1.size()+lp2.size()+lp3.size();i++) {
			if(Math.random()< 0.33) {
				lp.add(lp1.get(i));
			}
			else if(Math.random()<0.66&&Math.random()>0.33){
				lp=lp2;
			}
			else {
				lp=lp3;
			}
		}*/
		for(int i=0; i<lp1.size();i++) {
			lp.add(lp1.get(i));
		}
		for(int i=0; i<lp2.size();i++) {
			lp.add(lp2.get(i));
		}
		for(int i=0; i<lp3.size();i++) {
			lp.add(lp3.get(i));
		}
		Collections.shuffle(lp);
		return lp;
		
	}


//		public static void main(String[] args) {
//			List<Paquet> lp1 = Flux.createFlux("flux1");
//			List<Paquet> lp2 = Flux.createFlux("flux2");
//			List<Paquet> lp3 = Flux.createFlux("flux3");
//			
//			List<Paquet> lp= chooseList(lp1, lp2, lp3);
//			for(int i=0; i<lp.size();i++) {
//				System.out.println(lp.get(i).id);
//			}
//
//		}

}
