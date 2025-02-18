fun main() {
//    val valor1:Float
//    val valor2:Float
//    val resultado:Float
//    println("Digite o primeiro")
//    valor1 = readln().toFloat()
//    println("Digite o segundo valor")
//    valor2 = readln().toFloat()
//    resultado = valor1+valor2
//    println("A soma de "+valor1+" com "+valor2+" é "+resultado)
//    println("A soma de $valor1 com $valor2 é $resultado")

//    // Crie um programa que receba dois números inteiros e exiba o resultada da sua subtração;
//    val ex01Valor1:Int
//    val ex01Valor2:Int
//    val ex01Resultado:Int
//    println("Digite o primeiro")
//    ex01Valor1 = readln().toInt()
//    println("Digite o segundo valor")
//    ex01Valor2 = readln().toInt()
//    ex01Resultado = ex01Valor1-ex01Valor2
//    println("A subtração de "+ex01Valor1+" com "+ex01Valor2+" é "+ex01Resultado)

    /** Crie um programa que receba dois números inteiros e mostre a soma, a subtração, a multiplicação e a divisão dos dois, lembrando que a divisão pode
     * dar um resultado com casas decimais.
     */
//    val ex02Valor1:Int
//    val ex02Valor2:Int
//    println("Digite o primeiro")
//    ex02Valor1 = readln().toInt()
//    println("Digite o segundo valor")
//    ex02Valor2 = readln().toInt()
//    println("A soma de "+ex02Valor1+" com "+ex02Valor2+" é "+(ex02Valor1 + ex02Valor2)+"\n"
//            +"A subtração de "+ex02Valor1+" com "+ex02Valor2+" é "+(ex02Valor1 - ex02Valor2)+"\n"
//            +"A multiplicação de "+ex02Valor1+" com "+ex02Valor2+" é "+(ex02Valor1 * ex02Valor2)+"\n"
//            +"A divisão de "+ex02Valor1+" com "+ex02Valor2+" é "+(ex02Valor1 / ex02Valor2)+"\n"
//    )

//    // Escreva um programa que converta um valor de reais (R$) em dólar (US$). Ele deve solicitar o valor em reais e a cotação do dólar
//    val ex03Real:Float
//    val ex03Dolar:Float
//    val ex03Resultado:Float
//    println("Digite o valor em reais")
//    ex03Real = readln().toFloat()
//    println("Digite a cotação do dólar")
//    ex03Dolar = readln().toFloat()
//    ex03Resultado = ex03Real/ex03Dolar
//    println("O valor em reais convertido para dólar vale: $ex03Resultado")

    // Faça um programa que receba as notas de P1, P2, AI1 e AI2 e calcule a media final do aluno. Lembrando que as notas de P1 e de P2 devem ser digitadas com valores entre 0 e 9, as notas de AI1 e AI2 com valores entre 0 e 1 todas com apenas uma casa decimal. Ao final ele deve exibir a média e escrever se o aluno foi aprovado ou reprovado, para aprovação precisa de média maior ou igual a 6,0
    var aux:Float
    var ex04P1 = 0f
    var ex04P2 = 0f
    var ex04AI1 = 0f
    var ex04AI2 = 0f
    val ex04Media:Float
    println("Digite os valores respectivamente (P1, P2, AI1 e AI2)")

    println("Digite o valor da P1")
    aux = readln().toFloat()
    if (aux >= 0 && aux <= 9){
        ex04P1 = aux
    }
    while(aux < 0 || aux > 9){
        println("Digite um valor válido para P1")
        aux = readln().toFloat()
        if (aux >= 0 && aux <= 9){
            ex04P1 = aux
            break
        }
    }

    println("Digite o valor da P2")
    aux = readln().toFloat()
    if (aux >= 0 && aux <= 9){
        ex04P2 = aux
    }
    while (aux < 0 || aux > 9){
        println("Digite um valor válido para P2")
        aux = readln().toFloat()
        if (aux >= 0 && aux <= 9){
            ex04P2 = aux
            break
        }
    }

    println("Digite o valor da AI1")
    aux = readln().toFloat()
    if (aux >= 0 && aux <= 1){
        ex04AI1 = aux
    }
    while (aux < 0 || aux > 1){
        println("Digite um valor válido para AI1")
        aux = readln().toFloat()
        if (aux >= 0 && aux <= 1){
            ex04AI1 = aux
            break
        }
    }

    println("Digite o valor da AI2")
    aux = readln().toFloat()
    if (aux >= 0 && aux <= 1){
        ex04AI2 = aux
    }
    while (aux < 0 || aux > 1){
        println("Digite um valor válido para AI2")
        aux = readln().toFloat()
        if (aux >= 0 && aux <= 1){
            ex04AI2 = aux
            break
        }
    }
    ex04Media = ((ex04P1+ex04AI1)+(ex04P2+ex04AI2))/2
    if (ex04Media>=6){
        println("Aprovado")
    }else if(ex04Media>=4){
        println("Exame")
    }else{
        println("Reprovado")
    }
}