https://github.com/cami-la/collections-java-api-2023/blob/master/src/main/java/comparableXcomparator/README.md

Comparable X Comparator
Comparable

    Comparable fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
    Comparable afeta a classe original, ou seja, a classe atual é modificada.
    Comparable fornece o método compareTo() para ordenar elementos.
    Comparable está presente no pacote java.lang.
    Podemos ordenar os elementos da lista do tipo Comparable usando o método Collections.sort(List).

Comparator

    O Comparator fornece o método compare() para ordenar elementos.
    O Comparator fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.
    O Comparator não afeta a classe original, ou seja, a classe atual não é modificada.
    Um Comparator está presente no pacote java.util.
    Podemos ordenar os elementos da lista do tipo Comparator usando o método Collections.sort(List, Comparator).

Collections

    A classe Collections é uma classe utilitária do Java para operações comuns em coleções.
    Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.
    O método sort() é usado para ordenar uma lista em ordem ascendente.
    O método sort() em conjunto com Collections.reverseOrder() permite ordenar em ordem descendente.

Livros citados:

    ✨ Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos - https://amzn.to/3IVsZRM
    ✨ Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software - https://amzn.to/3oOUkyb
    ✨ Java - Guia do Programador: Atualizado Para Java 16 - https://amzn.to/3oJPanf
    ✨ Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software - https://amzn.to/3MOMVHf
    ✨ Kotlin em ação - https://amzn.to/3MFyncM

Referências:

[1] "Comparable vs Comparator in Java." GeeksforGeeks. Disponível em: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/.

[2] "Difference between Comparable and Comparator in Java." JavaTpoint. Disponível em: https://www.javatpoint.com/difference-between-comparable-and-comparator.

[3] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.