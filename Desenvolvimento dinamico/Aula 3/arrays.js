var valores = [8,1,7,2,9];
console.log(valores[0]);

//posição pos
for ( var pos = 0 ; pos < valores.length; pos++){
    console.log("Posição: "+pos +" Valor: "+valores[pos]);
}

//Calcular a média de todos os números de um array
var soma = 0;
for (var pos = 0; pos< valores.length; pos++){
    
    console.log(soma);
    soma += valores [pos];   
    console.log(soma);
}
var media = soma/valores.length;
console.log(media)

