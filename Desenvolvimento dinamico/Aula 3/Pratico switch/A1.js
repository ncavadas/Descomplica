/*Título da Prática: Estrutura de decisão
Objetivos: Compreender a implementação de estrutura de decisão.
Materiais, Métodos e Ferramentas: Para realizar esta prática vamos utilizar o Visual Studio Code

Prática

Escreva um código em que, após o cliente solicitar a escolha da bebida, a opção ‘switch’ deve avaliar a opção selecionada e atribuir o valor correspondente à variável ‘valor’. Caso o cliente escolha uma opção inválida,
 uma mensagem informativa é exibida, indicando que a escolha deve ser feita entre café, leite ou chá. Por fim, se uma opção válida for selecionada, exibimos uma mensagem personalizada informando o nome da bebida escolhida 
 e o valor a ser pago, formatado com duas casas decimais.*/

 var valor = "café"

 switch(valor){
    case "café":
        console.log("O café custa R$7,00")
        break;
    case "leite":
        console.log("O leite custa R$5,00")
        break;
    case "chá":
        console.log("O chá custa R$5,50")
        break;
    default:
        console.log("Opções disponíveis: café, leite e chá.")
 }

