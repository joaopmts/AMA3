package Ex11;

public class MostraConsole implements AbstractFactory {
	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "Console": return new Console();
		}
		return null;
	}
}
