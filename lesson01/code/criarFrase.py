def criarFrase(palavras, separador=' '):
    frase = palavras[0]
    for i in range(1, len(palavras)):
        frase = frase + separador + palavras[i]

    return frase

palavras = ['Criando', 'uma', 'frase']
print(criarFrase(palavras))
print(criarFrase(palavras, ' '))
print(criarFrase(palavras, '-'))