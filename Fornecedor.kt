import java.util.*

class Fornecedor {

        var nome: String? = null
            get() = if(field.isNullOrEmpty()) "Nome não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var idade: Byte? = null
            get() = if(field == null) null else
                field
            set(value) {
                field = if(value == null) null else value
            }

        var cpf: String? = null
            get() = if(field.isNullOrEmpty()) "Cpf não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }

        var produto: String? = null
            get() = if(field.isNullOrEmpty()) "Produto não informado" else
                field
            set(value) {
                field = if(value.isNullOrEmpty()) null else value
            }
        constructor(
            nome:String,
            idade:Byte,
            cpf:String,
            produto:String,
        ) {
            this.nome=nome
            this.idade=idade
            this.cpf=cpf
            this.produto=produto

        }

    override fun toString(): String {
        return "O nome $nome com a idade $idade do cpf $cpf que tem o produto $produto"
    }


    }

