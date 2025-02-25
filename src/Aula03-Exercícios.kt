class Pessoas{
    private var nome:String = ""
    private var idade:Int = 0
    private var peso:Float = 0f
    private var altura:Float = 0f

    constructor(nome: String, idade: Int, peso: Float, altura: Float) {
        this.nome = nome
        this.idade = idade
        this.peso = peso
        this.altura = altura
    }

    fun setNome(nome:String){
        this.nome = nome
    }
    fun getNome():String{
        return this.nome
    }
    fun setIdade(idade:Int){
        this.idade = idade
    }
    fun getIdade():Int{
        return this.idade
    }
    fun setPeso(peso:Float){
        this.peso = peso
    }
    fun getPeso():Float{
        return this.peso
    }
    fun setAltura(altura:Float){
        this.altura = altura
    }
    fun getAltura():Float{
        return this.altura
    }

    fun calcularIMC():Float{
        return (this.peso/(this.altura*this.altura))
    }
}

fun main(){
    var pessoa1 = Pessoas("Nome1", 20, 60f, 1.70f)
    var pessoa2 = Pessoas("Nome2", 21, 85f, 1.80f)
    println(pessoa1.getNome()+
            "\n Idade: "+pessoa1.getIdade()+
            "\n Peso: "+pessoa1.getPeso()+
            "\n Altura: "+pessoa1.getAltura()+
            "\n IMC: "+pessoa1.calcularIMC()
    )
    println(pessoa2.getNome()+
            "\n Idade: "+pessoa2.getIdade()+
            "\n Peso: "+pessoa2.getPeso()+
            "\n Altura: "+pessoa2.getAltura()+
            "\n IMC: "+pessoa2.calcularIMC()
    )

    println("Situação de "+pessoa1.getNome()+": "+apresentarSituacao(pessoa1.calcularIMC()))
    println("Situação de "+pessoa2.getNome()+": "+apresentarSituacao(pessoa2.calcularIMC()))
}
fun apresentarSituacao(imc:Float):String {
    if (imc < 18.5f) {
        return "Abaixo do peso ideal"
    }
    if (imc in 18.5..24.9) {
        return "Peso normal"
    }
    if (imc in 25.0f..29.9f) {
        return "Acima do peso"
    }
    if (imc in 30.0f..34.9f) {
        return "Obesidade grau I"
    }
    if (imc in 35.0f..39.9f) {
        return "Obesidade grau II"
    }
    if (imc > 40) {
        return "Obesidade grau III"
    }
    return ""
}