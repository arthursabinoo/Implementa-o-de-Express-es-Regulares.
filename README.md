# Validador de Números Binários com JFLAP e Java
Este repositório contém um conjunto de ferramentas simples, mas poderoso, para validar números binários que terminam com '0' e incluem uma sequência de três '0's ou três '1's seguidos. Inclui um programa em Java que utiliza expressões regulares para o processo de validação e um arquivo JFLAP descrevendo o autômato finito determinístico (AFD) correspondente.

# Descrição
O programa em Java solicita ao usuário para inserir um número binário e verifica se este termina com '0' e contém a sequência requisitada. Ele pede entradas repetidamente até que o usuário decida sair digitando 'x'. Este exemplo serve como uma demonstração prática do uso de expressões regulares e autômatos para validar formatos de entrada e é ideal para fins educacionais, especialmente no contexto de linguagens formais e teoria dos autômatos.

O arquivo JFLAP fornece uma representação visual e interativa do autômato finito determinístico (AFD) que corresponde à expressão regular utilizada no programa em Java. É um recurso valioso para aqueles que estão aprendendo sobre a transição de expressões regulares para seus equivalentes em autômatos finitos.

# Conteúdos
- `BinaryNumberValidator.java`: O programa em Java que realiza a validação de números binários usando expressões regulares.
- `BinaryNumberValidatorAFD.jff`: O arquivo JFLAP representando o AFD para a expressão regular.

# Uso
Para executar o programa em Java, compile-o com qualquer kit de desenvolvimento Java padrão e execute a classe principal. Você pode inserir quantos números binários desejar para validação e sair do programa digitando 'x'.

Para visualizar o autômato finito determinístico (AFD), abra o arquivo `.jff` com o software JFLAP. Isso permitirá que você simule o comportamento do autômato e entenda melhor como ele aceita ou rejeita números binários baseados na nova regra de validação.


