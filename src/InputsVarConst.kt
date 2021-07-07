fun main(args : Array<String>) {

    if(args.isEmpty()) {
        println("Favor Informar um argumento válido!")
        return
    }

    val numero = args[0].toIntOrNull()

    if(numero == null) {
        println("O valor informado não é um número válido!")
        return
    }

    println("O número digitado é: $numero")

    var soma = 0
    soma = numero + numero
    println("A soma do número + número é: $soma")
}