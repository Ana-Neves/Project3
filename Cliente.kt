import java.time.LocalDateTime

class Cliente {

        var nome:String?= null
            get() = if(field.isNullOrEmpty()) "Nome não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var email:String?= null
            get() = if(field.isNullOrEmpty()) "Email não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

    var cpf:String?= null
        get() = if(field.isNullOrEmpty()) "Cpf não informado" else
            field
        set(value) {
            field = if(value.isNullOrEmpty()) null else value
        }

    var dataNascimento: LocalDateTime?= null
    set(value) {
        if(value == null) {
            field = LocalDateTime.now()
        }else{
            field = value
        }
    }
    constructor(
        nome: String,
        email:String,
        cpf:String,
        dataNascimento: LocalDateTime,

    )
    {
        this.nome=nome
        this.email=email
        this.cpf=cpf
        this.dataNascimento=dataNascimento
    }

    override fun toString(): String {
        return "O nome $nome que contem o email $email e o cpf $cpf e a data de nascimento $dataNascimento"
    }
}
