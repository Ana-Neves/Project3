import java.time.LocalDateTime

fun main(args:Array<String>) {

    val vendedor = Vendedor(
        nome = "Brenda",
        idade = "18",
        email = "costabrenda428@gmail.com",
        dataNascimento = LocalDateTime.of(2003, 9, 16, 10, 44),
        cpf = "03967181082",

        )

    val cliente = Cliente(
        nome = "Ana",
        email = "ana.caroline22@gmail.com",
        cpf = "03967181083",
        dataNascimento = LocalDateTime.of(2005, 8, 19, 6, 12),

        )

    val produto = Produto(
        nome = "Carne",
        vencimento = LocalDateTime.of(2022, 12, 11, 5, 6),
        dataDeLancamento = LocalDateTime.of(2022, 3, 7, 4, 20),
        preco = "50,00",

        )

    val venda = Venda(
        estoque = "100",
        tempoDaEntrega = LocalDateTime.of(2012, 5, 3, 14, 40),
        produto = "Carne",
    )


    val fornecedor = Fornecedor(
        nome= "Karen",
        idade= 18,
        cpf= "039672281081",
        produto= "carne"

    )

    val transportadora = Transportadora(
        nome = "FabricioTransportes",
        dataDeEntrega = LocalDateTime.of(2022, 8, 5, 9, 11),
        telefoneComercial = "51 3443-5190",
        tempoEntrega = "Duas horas",
        cnpj = "213-5",

        )


}















