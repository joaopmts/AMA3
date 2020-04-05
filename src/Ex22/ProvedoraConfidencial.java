package Ex22;

public class ProvedoraConfidencial implements Provedora {
	public String proverInfo() {
		return lerArquivo("confidencial.txt");
	}
}
