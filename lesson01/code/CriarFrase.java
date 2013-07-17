public class CriarFrase
{
    public String criarFrase(String[] palavras)
    {
        return this.criarFrase(palavras, ' ');
    }

    public String criarFrase(String[] palavras, char separador)
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
        CriarFrase frase = new CriarFrase();

        String[] palavras = {"Criando", "uma", "frase"};
        System.out.println(frase.criarFrase(palavras));
        System.out.println(frase.criarFrase(palavras, ' '));
        System.out.println(frase.criarFrase(palavras, '-'));
    }
}