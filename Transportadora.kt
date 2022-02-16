import java.time.LocalDateTime
import java.util.*

    class Transportadora {
        var nome: String? = null
            get() = if(field.isNullOrEmpty()) "Nome não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var dataDeEntrega: LocalDateTime? = null
            set(value) {
                if (value == null){
                    field= LocalDateTime.now()
                }else{
                    field = value
                }
            }

        var telefoneComercial: String? = null
            get() = if(field.isNullOrEmpty()) "Telefone Comercial não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var tempoEntrega: String? = null
            get() = if(field.isNullOrEmpty()) "Tempo De Entrega não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var cnpj: String?= null
            get() = if(field.isNullOrEmpty()) "CNPJ não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }
        constructor(
            nome:String,
            dataDeEntrega: LocalDateTime,
            telefoneComercial:String,
            tempoEntrega:String,
            cnpj:String,

        )
        {
            this.nome=nome
            this.dataDeEntrega=dataDeEntrega
            this.telefoneComercial=telefoneComercial
            this.tempoEntrega=tempoEntrega
            this.cnpj=cnpj

        }

        override fun toString(): String {
            return "O nome $nome na data de entrega $dataDeEntrega com o telefone comercial $telefoneComercial no tempo de entrega $tempoEntrega que tem no cnpj $cnpj"
        }
}