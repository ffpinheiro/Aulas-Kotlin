// Aula sobre classes abstratas
abstract class `Aula05-Funcionario` {
    var matricula: Int = 0
        set(value){
            if(value>0)
                field = value
        }
    var nome: String = ""
        set(value){
            if(value != "")
                field = value
        }
    var salario: Double = 0.0
        set(value){
            if(value>0)
                field = value
        }
    constructor(matricula:Int,nome:String,salario:Double){
        this.matricula = matricula
        this.nome = nome
        this.salario = salario
    }

    abstract fun bonus(): Double

    fun aumentoSalario(porcentagem: Double){
        if(porcentagem>0){
            var valor = salario * porcentagem/100
            salario += valor
        }
    }
}

class `Aula05-Administrativo`: `Aula05-Funcionario` {
    var departamento = ""
        set(value){
            if(value != "")
                field = value
        }
    constructor(matricula:Int,nome:String,salario:Double,departamento: String): super(matricula,nome,salario){
        this.departamento = departamento
    }
    override fun bonus(): Double{
        return this.salario * 0.12
    }
}

class `Aula05-Professor`: `Aula05-Funcionario` {
    var curso: String = ""
        set(value){
            if(value != "")
                field = value
        }
        get(){
            return if(field != "")
                field
            else
                "Curso não cadastrado"
        }
    constructor(matricula:Int,nome:String,salario:Double, curso: String): super(matricula,nome,salario){
        this.curso = curso;
    }
    override fun bonus(): Double{
        return this.salario * 0.10
    }
}
