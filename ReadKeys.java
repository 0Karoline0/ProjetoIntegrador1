import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Classe ReadKeys
// Permite a Entrada de Dados via Teclado
// Parametros: Mensagem a ser exibida na tela

public class ReadKeys {

	InputStreamReader digita = new InputStreamReader(System.in);
	BufferedReader ler = new BufferedReader(digita);

	String dado = "";

	public String leitura(String mens) {
		try {
			System.out.print(mens + " ");
			dado = ler.readLine();
		} catch (IOException e) {
		}
		return dado;
	}
}