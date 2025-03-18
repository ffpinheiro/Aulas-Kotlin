class `Aula04-Administrativo`: `Aula04-Funcionario` {
    var departamento = ""
        set(value){
            if(value != "")
                field = value
        }
    constructor(matricula:Int,nome:String,salario:Double,departamento: String): super(matricula,nome,salario){
        this.departamento = departamento
    }
}