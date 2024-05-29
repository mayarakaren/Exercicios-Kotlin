//Revisão de Orientação a Objetos

//Pilares:
//          Herança
//          Encapsulamento
//          Polimorfismo:
//                  Paramétrico
//                  Subtipos
//                  ad-hoc

//Construtor primário já cria o segundo
//constructor(var nome: String, var peso:Int){
//      this.nome = nome;
//      this.peso = peso;
//Clichê: class Animal(var nome: String, var peso:Int)
//Overload: Sobrcarga de metódo - Polimorfismo que não é polimorfismo
//Sobracarga: Implementa dois metódos com o mesmo nomes, mas a quantida varia.

open abstract class Animal(var nome: String, var peso:Int){
    //Processo filosóficos com texto
    //Entidade

    //Criar um metódo
    //Evitar println dentro do metódo -> apenas pro exemplo da aula

    abstract fun emitirSom();
}

//Essa classe tem duas caractéristicas e uma ação
//Herança: objetivo não repetir o código - agrupar caracteristicas e comportamentos dado contexto, se não houvesse esse
//contexto, criaria-se várias classes. Genrealiza e específica.
//Quando cria-se a classe com herança generaliza e especifica, ex: Animal é uma abstração - agrupando-as

class Gato(nome: String, peso: Int): Animal(nome, peso){
    fun ronronar(){
        println("rrrrrrrrrrrrrrr");
    }
    //sobreescrita
    override fun emitirSom() {
        print("meaw")
    }
}

//pegou no filho e passou pro pai
//Se a abstração não é tangível, é interessante o programa permitir a criação de generalizados
//Abstração trava o compilador - Não se pode criar uma instância em uma classe abstrata
//Não usar herança com mais de dois níveis -> Avô, pai e neto - Pq não utilizar? Acoplamento

class Cachorro(nome: String,peso: Int): Animal(nome, peso){
    override fun emitirSom(){
        println("AuAu");
    }
}

//A classe Abstrata - Generalizou
//A classe filha - Especializou

//Polimorfismo de Subtipos: Poli - Muitos / Fismo - Formas
//Quando uma variavel de um tipo/supertipo pai consegue referenciar qualquer um dos subtipos e executar

//Em Java:
//Sistemas de tipos:
//  Tipagem forte/estática = a variável(Int x = 10)
//Tempo de execução não muda


//Em kotlin:
//Sistemas de tipos:
//  Tipagem forte/estática = a variável(var x: Int = 10)

//Em python:
//Sistemas de tipos:
//  Tipagem dinâmica = a variável (x =10)
//  Tipagem Fraca = Polimorfismo de subtipos: var animal3: Animal = Cachorro("Zeus", 33)
//nome da variavel: animal3
//Tipo: Animal
//Subtipo: Cachorro
//Tipagem dinâmica: o tipo é definido pela tempo de execução

//Abstração: Serve pra agrupar os comportamentos, o que defini a execução e comportamento é o subtipo
//Fazer com que o filho determine a forma com que o metódo vai se comportar sem usar if e else

fun main(){
    val animal = Cachorro("Toddy", 10);
    //animal.emitirSom();
    //animal.latir();

    var animal2: Cachorro = Cachorro("bilu", 33);

    var animal3: Animal = Cachorro("Zeus", 33);
    animal3.emitirSom();
    animal3 = Gato("Ninja", 5);
    animal3.emitirSom()

    //metodo do filho determina

}