package implementacao;

public class Cliente {
	public static void main(String[] args) {
		
		MensagemMediator mediador = new MensagemMediator();
	
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		SymbianColleague symbian = new SymbianColleague(mediador);
	
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(symbian);
		
		symbian.enviarMensagem("Oi, eu sou um Symbian!");
		System.out.println("=========");
		android.enviarMensagem("Oi, Eu sou um Android!");
		System.out.println("=========");
		ios.enviarMensagem("Olá a todos, Eu sou um iOs!");

		
//		MensagemMediator mediador = new MensagemMediator();
//		
//		AndroidColleague android = new AndroidColleague(mediador);
//		IOSColleague ios = new IOSColleague(mediador);
//	
//		mediador.adicionarColleague(android);
//		mediador.adicionarColleague(ios);
//		
//		android.enviarMensagem("Oi IOS, Eu sou um Android!");
//		System.out.println("=========");
//		ios.enviarMensagem("Oi Android, Eu sou um iOs!");
		
//		MensagemMediator mediador = new MensagemMediator();
//	
//		AndroidColleague android = new AndroidColleague(mediador);
//		SymbianColleague symbian = new SymbianColleague(mediador);
//	
//		mediador.adicionarColleague(android);
//		mediador.adicionarColleague(symbian);
//		
//		symbian.enviarMensagem("Oi Android, eu sou um Symbian!");
//		System.out.println("=========");
//		android.enviarMensagem("Oi Symbian, Eu sou um Android!");
		
	}
}
