fun main() {

    println("Favor informar o nome do convidado: ")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome informado não é válido!")
        return
    }

    println("Favor informar a idade do convidado")
    val idade = readLine()?.toIntOrNull()

    if(idade == null || idade <= 0) {
        println("A idade informada não é válida!")
        return
    }

    var estaConvidado = false
    when(nome){
        "Marcus" -> estaConvidado = true
        "Vinicius" -> estaConvidado = true
        "Rocha" -> estaConvidado = true
        else -> estaConvidado = false
    }

    if(estaConvidado && idade >= 18){
        println("Seja bem vinda à festa!")
    } else if(!estaConvidado) {
        println("Você não está na lista!")
    }else{
        println("Você não tem idade suficiente para participar!")
    }

}