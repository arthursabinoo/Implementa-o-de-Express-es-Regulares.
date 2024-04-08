# Validador de Números Binários com JFLAP e Java
Este repositório contém um conjunto de ferramentas simples, mas poderoso, para validar números binários que terminam com '0'. Inclui um programa em Java que utiliza expressões regulares para o processo de validação e um arquivo JFLAP descrevendo o autômato finito subjacente.

# Descrição
O programa em Java solicita ao usuário para inserir um número binário e verifica se este termina com '0'. Ele pede entradas repetidamente até que o usuário decida sair digitando 'x'. Este exemplo serve como uma demonstração prática do uso de expressões regulares para validar formatos de entrada e é ideal para fins educacionais, especialmente no contexto de linguagens formais e teoria dos autômatos.

O arquivo JFLAP fornece uma representação visual e interativa do autômato finito não-determinístico com transições epsilon (AFN-ε) que corresponde à expressão regular utilizada no programa em Java. É um recurso valioso para aqueles que estão aprendendo sobre a transição de expressões regulares para seus equivalentes em autômatos.

# Conteúdos
BinaryNumberValidation.java: O programa em Java que realiza a validação de números binários usando expressões regulares.
BinaryNumberValidationAFN.jff: O arquivo JFLAP representando o AFN-ε para a expressão regular.
Uso
Para executar o programa em Java, compile-o com qualquer kit de desenvolvimento Java padrão e execute a classe principal. Você pode inserir quantos números binários desejar para validação e sair do programa digitando 'x'.

O arquivo JFLAP pode ser aberto usando o software JFLAP, permitindo que você simule o comportamento do autômato e entenda melhor como ele aceita ou rejeita um determinado número binário.

