package domino;

public class app {

	public static void main(String[] args) {
		
		Domino domino1 = new Domino(3,3);
		Domino domino2 = new Domino(3,4);
		Domino domino3 = new Domino(2,6);
		
		boolean test1 = domino1.coteAcote(domino2);
		boolean test2 = domino2.coteAcote(domino3);
		
		domino1.affichePoints();
		domino2.affichePoints();
		domino3.valeur();
	}

}
