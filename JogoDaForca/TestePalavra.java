public class TestePalavra {

	public static void main (String[] args) {
		try {
				Palavra a = new Palavra ("NATAL"); //okay
				System.out.println("Primeira palavra: " +a);
				
				Palavra b = new Palavra ("PRESENTE"); //okay
				System.out.println("Segunda palavra: " +b);
				
				System.out.println();
								
				String texto = a.toString(); // Teste Metodo Palavra
				System.out.println("Testando a PRIMEIRA Palavra: " +texto);
				
				System.out.println();
				
                int tamanho = a.getTamanho(); // Teste método getTamanho
                System.out.println("O tamanho da PRIMEIRA palavra eh: "+tamanho);
                
                System.out.println();
                
                System.out.print ("Digite uma letra para verifica-la na PRIMEIRA palavra: ");
				char letra = Character.toUpperCase (Teclado.getUmChar()); // Capturando letra digitada pelo usuario
				
				int qtdA = a.getQuantidade(letra);  // Teste do método getQuantidade
				if (qtdA == 1) {
					System.out.println("A primeira palavra possui: " +qtdA+ " letra(s) "+letra);
				} 
				else if (qtdA > 1) {
					 System.out.println("A PRIMEIRA palavra possui: "+qtdA+" letras "+letra);
					 System.out.println();
					 System.out.println("Em qual ocorrencia deseja verificar a posicao desta letra?"); // Solicitando ocrrencia para o usuario
					 int ocorr = Character.toUpperCase (Teclado.getUmInt());
					if (ocorr > qtdA) {
						System.err.println("Ocorrencia maior que numero de vezes");
					} else {
						int testea = a.getPosicaoDaIezimaOcorrencia (ocorr,(char)letra); // Testando o método getPosicaoDaIezimaOcorrencia
						System.out.println("A ocorrencia "+ocorr+" da letra: " +letra+" esta na posicao: "+testea);
					}
				} else {
					System.err.println("A PRIMEIRA palavra nao possui a letra " +letra);
				}
				
				System.out.println();
				
				System.out.println("Teste do método compareTo: " +a.compareTo(b));

		} catch(Exception erro) {
			System.out.println(erro.getMessage());
		}
	}
}
