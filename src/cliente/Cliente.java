package cliente;

import implementacao.AndroidColleague;
import implementacao.IOSColleague;
import implementacao.MensagemMediator;
import implementacao.SymbianColleague;

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
		
	}
}
