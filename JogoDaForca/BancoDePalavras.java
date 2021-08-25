public class BancoDePalavras
{
    private static String[] palavras =
    {
		"FE",
		"AMOR",
		"NATAL",
		"ESPERANCA",
		"PRESENTES",
		"DECORACAO",
		"RENA",
		"TRENO",
		"CARVAO",
		"EDUCACAO",
		"PINHEIRO",
		"ENFEITE",
		"CONFRATERNIZACAO",
		"LUZ",
		"ESTRELA",
		"CEIA",
		"LAREIRA",
		"ESPIRITO",
		"NEVE",
		"UNIAO",
		"FAMILIA",
    };

    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra =
            new Palavra (BancoDePalavras.palavras[
            (int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }
}
