fun main(){
    val valor1:Float
    val valor2:Float
    println("Digite o primeiro")
    valor1 = readln().toFloat()
    println("Digite o segundo valor")
    valor2 = readln().toFloat()
    soma(valor1,valor2)
}
fun soma(valor1: Float, valor2: Float){
    val resultado:Float
    resultado = valor1 + valor2
    println("A soma de $valor1 com $valor2 é $resultado")
}