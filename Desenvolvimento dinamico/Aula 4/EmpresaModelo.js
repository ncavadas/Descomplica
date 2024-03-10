class Funcionario{

    constructor(nome,idade,cargo){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }
    seApresentar(){
        console.log(`${this.nome} está presente.`);
    }
    trabalhar(){
        console.log(`${this.nome} está trabalhando.`);
    }
}

class Gerente extends Funcionario{

    constructor(nome,idade,cargo,departamento){
        super(nome,idade,cargo);
        this.departamento = departamento;
    }
    gerenciar(){
        console.log(`${this.nome} está gerenciando o departamento de ${this.departamento}.`);
    }
}

class Desenvolvedor extends Funcionario{

    constructor(nome,idade,cargo,linguagem){
        super(nome,idade,cargo);
        this.linguagem = linguagem;
    }
    programar(){
        console.log(`${this.nome} está programando em ${this.linguagem}.`);
    }
}


//Gerente
const gerente1 = new Gerente ('Nina',31,'Gerente','Dados');
gerente1.seApresentar();
gerente1.trabalhar();
gerente1.gerenciar();


//Desenvolvedor
const desenvolvedor1 = new Desenvolvedor ('Fernando',34,'Desenvolvedor','Java');
desenvolvedor1.seApresentar();
desenvolvedor1.trabalhar();
desenvolvedor1.programar();

