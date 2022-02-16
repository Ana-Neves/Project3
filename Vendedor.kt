import java.time.LocalDateTime
import java.util.*

    class Vendedor {

        var nome: String? = null
            get() = if (field.isNullOrEmpty()) "Vendedor não informado" else
                field
            set(value) {
                field = if (value.isNullOrEmpty()) null else value

            }

        var idade:  String? = null
            get() = if (field.isNullOrEmpty()) "Idade não informado" else
                field
            set(value) {
                field = if (value?.length == 2) value else null
            }


        var email: String? = null
            get() = if (field.isNullOrEmpty()) "Email não informado" else
                field
            set(value) {
                field = if (value.isNullOrEmpty()) null else value
            }


        var dataNascimento: LocalDateTime? = null
            set(value) {
                if (value == null) {
                    field = LocalDateTime.now()
                } else {
                    field = value
                }
            }

                var cpf: String? = null
                get() = if (field.isNullOrEmpty()) "Cpf não informado" else
                    field
                set(value) {
                    field = if (value?.length == 10) value else null


                }

               constructor(
                   nome: String,
                   idade: String,
                   email:String,
                   dataNascimento: LocalDateTime,
                   cpf:String,
               )
               {
                   this.nome=nome
                   this.idade=idade
                   this.email=email
                   this.dataNascimento=dataNascimento
                   this.cpf=cpf

               }

        override fun toString(): String {
            return "O nome $nome que tem a idade $idade que o email $email na data de nascimento $dataNascimento que tem o cpf $cpf"
        }
    }
