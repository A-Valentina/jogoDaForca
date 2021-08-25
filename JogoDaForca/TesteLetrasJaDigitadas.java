 public class TesteLetrasJaDigitadas {
 
	public static void main (String[] args) {
		
			Palavra palavra = BancoDePalavras.getPalavraSorteada(); // Criamos a palavra somente para que possamos realizar o teste
			System.out.println("A palavra eh: "+palavra);
			
			ControladorDeLetrasJaDigitadas a = new ControladorDeLetrasJaDigitadas (); // Instanciando objeto "a"
			ControladorDeLetrasJaDigitadas b = new ControladorDeLetrasJaDigitadas (); // Instanciando objeto "b"
			
				try
				{
					System.out.print   ("Digite uma letra: ");
					char letra1 = Character.toUpperCase (Teclado.getUmChar()); // Capturando letra
					

					if (a.isJaDigitada (letra1))  // Verifica se a letra já foi digitada
						System.err.println ("A letra: " +letra1+ " ja foi digitada!\n");
					else
					{
						a.registre (letra1);  // Se ainda não foi digitada, registra.
					}
					
					System.out.print   ("Digite outra letra: "); // Solicitamos a digitação de outra letra
					char letra2 = Character.toUpperCase (Teclado.getUmChar()); // Capturando outra letra
					
					while (letra2 == letra1) { // Enquanto a letra2 for igual a letra1, ficará solicitando outra letra
						System.err.print ("A letra: " +letra1+ " ja foi digitada, digite outra: ");
						letra2 = Character.toUpperCase (Teclado.getUmChar()); // Capturando outra letra
						
					   if (letra2 != letra1) // Caso digite uma diferente, sai do while e continua o programa
					    break;
					}
						b.registre (letra2);  // Se ainda não foi digitada, registra.
					
					System.out.println ();
					System.out.println ("Letras Digitadas: " +a +b); // Verificando quais as letras que já foram digitadas
					System.out.println ();
					
					// Testando método equals
					System.out.println();System.out.println();
					System.out.println("Verificando se a primeira letra digitada eh igual a segunda: " +a.equals(b));
					
					// Testando método hashcode
					System.out.println();System.out.println();
					System.out.println("Calculo Hashcode da primeira letra digitada: " +a.hashCode());	// Calculo do Hascode de "a"
					System.out.println();
					System.out.println("Calculo Hashcode da segunda letra digitada: " +b.hashCode());	// Calculo do Hascode de "b"
					
					// Testando método clone
					System.out.println();System.out.println();
					ControladorDeLetrasJaDigitadas c = (ControladorDeLetrasJaDigitadas) a.clone();	// Clonando A em C
					System.out.println("Clonando a primeira letra em uma terceira: "+c);
					System.out.println();
					System.out.println("Calculo Hashcode da terceira letra: " +c.hashCode());	// Calculo do Hascode de "c" que deve ser o mesmo de "a"
				}
				catch (Exception erro)
				{
					System.err.println (erro.getMessage());
				}
				
		}
 
 }
