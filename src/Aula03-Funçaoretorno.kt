fun calcular(v1:Float,v2:Float):Float{
    var soma: Float
    soma = v1 + v2
    return soma
}
fun main(){
    var valor1: Float
    var valor2: Float
    var soma: Float
    print("Entre com o valor1:")
    valor1 = readln().toFloat()
    print("Entre com o valor2:")
    valor2 = readln().toFloat()
    soma = calcular(valor1,valor2)
    println("O valor da soma é $soma")
}