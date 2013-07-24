public class CriarFrase
{
    public static String criarFrase(String[] palavras)
    {
        return CriarFrase.criarFrase(palavras, ' ');
    }

    public static String criarFrase(String[] palavras, char separador)
    {
        String frase = palavras[0];
        for(int i = 1; i < palavras.length; i++)
        {
            frase = frase + separador + palavras[i];
        }

        return frase;
    }

    public static void main(String[] args)
    {
        String[] palavras = {"Criando", "uma", "frase"};
        System.out.println(CriarFrase.criarFrase(palavras));
        System.out.println(CriarFrase.criarFrase(palavras, ' '));
        System.out.println(CriarFrase.criarFrase(palavras, '-'));
    }
}