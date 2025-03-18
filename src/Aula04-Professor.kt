class `Aula04-Professor`: `Aula04-Funcionario` {
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
}