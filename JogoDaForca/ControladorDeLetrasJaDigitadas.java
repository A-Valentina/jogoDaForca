public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";

        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
         for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
		    if (this.letrasJaDigitadas.charAt(i) == letra)
		        return true;
		 }
          return false;

        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre (char letra) throws Exception
    {

        if(this.isJaDigitada(letra) == true)
        throw new Exception("Erro pois a letra ja foi digitada");

        this.letrasJaDigitadas += letra;


		// verifica se a letra fornecida ja foi digitada (pode usar
		// o método this.isJaDigitada, para isso), lancando uma exceção
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {

		String ret = "";

		      for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
		        ret += this.letrasJaDigitadas.charAt(i) + ",";

        return ret;
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por vírgula (,).
    }

    public boolean equals (Object obj) // verificar se this e obj são iguais
    {
        if (obj == null)
		       return false;

		       if (obj.getClass() != this.getClass()) // verifica se as classes não são iguais
		       return false;

		       ControladorDeLetrasJaDigitadas outro = (ControladorDeLetrasJaDigitadas)obj; // Desvelar o obj como ControladorDeLetrasJaDigitadas, pois são duas classes diferentes e com isso não se poderia usar o equals.

		       for (int i = 0; i < this.letrasJaDigitadas.length(); i++)
		          if (this.letrasJaDigitadas.charAt(i) != outro.letrasJaDigitadas.charAt(i)) // Verifica se as letras já digitadas dos 2 objetos não são iguais
		          return false;

          return true;
    }

    public int hashCode ()
    {

       	 int ret = 1;

	   		 	ret = 3 * ret +(new String(this.letrasJaDigitadas)).hashCode();

	             if (ret < 0)
	             ret = -ret; // se o ret for número negativo, transforma em positivo

	   		return ret;
        // calcular e retornar o hashcode de this

    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
		if(controladorDeLetrasJaDigitadas == null)
			            throw new Exception("Parâmetro nulo");

			        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas ;

        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone () // criar uma cópia do this com o construtor de cópia e retornar
    {
        ControladorDeLetrasJaDigitadas ret = null; // deve-se declarar fora do try, pois não reconhece algo instanciado dentro do try
		       try {
		        ret = new ControladorDeLetrasJaDigitadas(this);

			   } catch(Exception ex)
			   {
				   } // vazio pois nunca dara erro, pois o this sempre sera um parametro valido

       return ret;

    }
}
