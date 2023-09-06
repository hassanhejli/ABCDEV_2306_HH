package passeTemps;

public class app {

	public static void main(String[] args) {
		
		PasseTemps montreConnectee = new PasseTemps("AppleWatch", 20, 45, 59, false, false);
		PasseTemps reveil = new PasseTemps("casio", 23, 59, 59, false, false);
		
		boolean test1 = montreConnectee.sonnerieNouvelleHeure();
		boolean test2 = reveil.sonnerieNouvelleHeure();
		boolean test3 = montreConnectee.nouvelleMinute();
		boolean test4 = reveil.nouvelleMinute();
		boolean test5 = montreConnectee.nouvelleSeconde();
		boolean test6 = reveil.nouvelleSeconde();
		
		String ilEstLheure = montreConnectee.get_horloge();
		boolean caSonne = reveil.get_sonnerie();
		
		reveil.quelleHeureEstIl();
		
		
		

	}

}
