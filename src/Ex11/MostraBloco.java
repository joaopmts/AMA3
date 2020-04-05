package Ex11;


public class MostraBloco  implements AbstractFactory{
	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "BlocoNotas": return new BlocoDeNotas();
		}
		return null;
	}
}
