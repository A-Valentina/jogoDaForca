public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		if (qtd < 0)
         throw new Exception("Valor invalido");

         this.texto = new char[qtd];

         for (int i = 0; i < qtd; i++)
              this.texto[i] = '_';

		// verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
    }

    public void revele (int posicao, char letra) throws Exception
    {
		if (posicao < 0 || posicao >= this.texto.length)
		   throw new Exception("Erro ao encontrar posição");

		this.texto[posicao] = letra;

		// verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++)
          if (this.texto[i] == '_')
          return true;

          return false;


        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
      String ret = "";

      for (int i = 0; i < this.texto.length; i++)
        ret += this.texto[i] + " ";

        return ret;
      // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
    }

    public boolean equals (Object obj)
    {
       if (obj == null)
       return false;

       if (obj.getClass() != this.getClass())
       return false;

       Tracinhos outro = (Tracinhos)obj; // Desvelar o obj como Tracinhos, pois são duas classes diferentes e com isso não se poderia usar o equals.

       for (int i = 0; i < this.texto.length; i++)
          if (this.texto[i] != outro.texto[i])
          return false;

          return true;

        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
		 int ret = 0;

		 for (int i = 0; i < this.texto.length; i++)
		 	ret = 3*ret+(new Character(this.texto[i])).hashCode();

          if (ret < 0)
          ret = -ret; // transforma a variável ret em positiva caso negativa

		return ret;
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
	    {
	        if(t == null)
	            throw new Exception("Parâmetro nulo para construtor de cópia");

	        this.texto = new char[t.texto.length]; // Chamante recebe letra a letra do objeto passado por parâmetro.

	        for(int i=0; i< t.texto.length; i++)
	            this.texto[i] = t.texto[i];

	        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
	        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
	  Tracinhos ret = null; // deve-se declarar fora do try, pois não reconhece algo instanciado dentro do try
       try {
        ret = new Tracinhos(this);

	   } catch(Exception ex)
	   {
		   } // vazio pois nunca dara erro, pois o this sempre sera um parametro valido

       return ret;


       //* return new Tracinhos(this); // Isso daria erro, pois o metodo do construtor de copia tem a marca da morte (throws Exception)

       // retornar uma copia de this
    }
}
