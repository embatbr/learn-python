#Por que aprender Python?

    1. Introdução
        1. Python é amiga do programador
        2. Abstrai o desnecessário
        3. É modular
    2. Show me the money
    3. História e fatos


##Introdução

Se você é um programador recente, talvez conheça apenas sua primeira linguagem (provavelmente Java) e nunca viu um `goto`, então a resposta é fácil: **para ter mais opções**. Mas você também pode ser jurássico, dos tempos do COBOL e do BASIC. Neste caso minha melhor resposta é: **para ter mais opções**.

Não importa quantos anos de experiência você tenha, ou qual foi sua primeira linguagem, Python lhe mostrará uma nova maneira de programar. A maneira divertida!

Aqui vão alguns motivos para aprender Python:


###Python é amiga do programador

Com uma sintaxe simples e intuitiva, Python tem um foco na legibilidade do código. Além disso, não é preciso criar classes com um método estático nem importar bibliotecas apenas para escrever um simples *Hello World*. Abaixo uma breve comparação entre Java, C e Python:

Java:
```
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
```
```
$ javac HelloWorld.java
$ java HelloWorld
Hello World!
$
```

C:
```
#include <stdio.h>

int main(void)
{
    printf("Hello World!\n");
    return 0;
}
```
```
$ gcc helloworld.c -o hello.exe
$ ./hello.exe
Hello World!
$
```

Python:
```
print("Hello World!")
```
```
$ python3.2 helloWorld.py
Hello World!
$
```

Viu como é fácil? Se eu quero apenas escrever "Hello World!" na tela, eu só deveria precisar enviar ao computador o comando `escreva "Hello World!"`, não ter que criar uma estrutura de objeto, nem chamar uma biblioteca padrão como `stdio` (**St**andar**d** **IO** - Entrada e Saída Padrão). O resto o sistema operacional deve abstrair. Isto leva a...


###Abstrai o desnecessário

Python possui algumas característica que muitos programadores Java esperavam ansiosamente: herança múltipla, valor default num parâmetro de função, dicionários e etc. Em java, se você quer que seu método possua um valor default em alguns parametros, é necessário duplicar o método, chamando o original. Ex:

```
...
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
...
```
As chamadas dos métodos com e sem o separador:
```
String[] palavras = {"Criando", "uma", "frase"};
System.out.println(exemplos.criarFrase(palavras));
System.out.println(exemplos.criarFrase(palavras, ' '));
System.out.println(exemplos.criarFrase(palavras, '-'));
```
Possuem saídas:
```
Criando uma frase
Criando uma frase
Criando-uma-frase
```

Já em Python basta fazer:
```
def criarFrase(palavras, separador=' '):
    frase = palavras[0]
    for i in range(1, len(palavras)):
        frase = frase + separador + palavras[i]

    return frase
```
Com chamadas:
```
palavras = ['Criando', 'uma', 'frase']
print(criarFrase(palavras))
print(criarFrase(palavras, ' '))
print(criarFrase(palavras, '-'))
```
E saídas:
```
Criando uma frase
Criando uma frase
Criando-uma-frase
```

No código Java, para ter mais de um valor default é necessário criar todas as combinações desejadas. Isto leva a um mal aproveitamento do esforço do programador.


###É modular


##Show me the money


##História e fatos
