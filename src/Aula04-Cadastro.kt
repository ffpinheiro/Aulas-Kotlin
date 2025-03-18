fun main(){
    var matricula: Int = 0
    var nome: String = ""
    var salario: Double = 0.0
    var curso: String = ""
    var departamento: String = ""
    print("Cadastro de Professor")
    print("Digite a matrícula: ")
    matricula = readln().toInt()
    print("Digite o nome: ")
    nome = readln()
    print("Digite o salário: ")
    salario = readln().toDouble()
    print("Digite o curso: ")
    curso = readln()
    var prof1: `Aula04-Professor` = `Aula04-Professor`(matricula,nome,salario,curso)
    println("Matrícula do Professor: ${prof1.matricula}")
    println("Nome do Professor: ${prof1.nome}")
    println("Salário do Professor: ${prof1.salario}")
    println("Curso: ${prof1.curso}")
}