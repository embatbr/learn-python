public class Exemplos
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
        Exemplos exemplos = new Exemplos();

        String[] palavras = {"Criando", "uma", "frase"};
        System.out.println(exemplos.criarFrase(palavras));
        System.out.println(exemplos.criarFrase(palavras, ' '));
        System.out.println(exemplos.criarFrase(palavras, '-'));
    }
}