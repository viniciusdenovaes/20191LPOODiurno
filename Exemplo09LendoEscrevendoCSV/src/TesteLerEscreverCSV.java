import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteLerEscreverCSV {
	
	public static void main(String[] args) {
		System.out.println(
				System.getProperty("user.dir"));
		System.out.println(
				System.getProperty("user.home"));
		
		String caminhoCSV = 
				System.getProperty("user.dir")
				+ File.separator + "files"
				+ File.separator + "teste.csv";
		System.out.println(caminhoCSV);
		
		ArrayList<Pato> patos = new ArrayList<>();
		patos.add(new Pato("donal", 15, 5.5));
		patos.add(new Pato("marg", 14, 4.5));
		patos.add(new Pato("quane", 5, 2.5));
		
		
		try {
			PrintWriter out = new PrintWriter(
					caminhoCSV, StandardCharsets.UTF_8);
			for(Pato pato : patos) {
				out.println(pato.nome + 
						"|" + pato.idade + 
						"|" + (pato.preco+1));
			}
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<Pato> novosPatos = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream(caminhoCSV);
			Scanner in = new Scanner(fis, "UTF-8");
			while(in.hasNextLine()) {
				String line = in.nextLine();
				String[] palavras = line.split("\\|");
				String novoNome = palavras[0];
				int novaIdade = Integer.parseInt(palavras[1]);
				double novoPreco = Double.parseDouble(palavras[2]);
				Pato novoPato = new Pato(novoNome, novaIdade, novoPreco);
				novosPatos.add(novoPato);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(novosPatos);
		
		
		
		
		
	}

}
