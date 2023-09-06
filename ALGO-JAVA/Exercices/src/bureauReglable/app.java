package bureauReglable;

public class app {

	public static void main(String[] args) {
		
		BureauReglable bureauReglableProg = new BureauReglable(150, 90, 115, 100, 120, 140, false, false);
		
		boolean test1 = bureauReglableProg.descendre(20);
		boolean test2 = bureauReglableProg.monter(10);
		boolean test3 = bureauReglableProg.choisirPosition(2);
		boolean test4 = bureauReglableProg.monter(50);
		boolean test5 = bureauReglableProg.choisirPosition(3);
		boolean test6 = bureauReglableProg.choisirPosition(5);
		boolean test7 = bureauReglableProg.descendre(90);
		

	}

}
