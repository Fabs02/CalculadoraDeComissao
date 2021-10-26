fun main(args: Array<String>) {
    var valorCom = 0.0

    print("Digite o valor da sua faixa de vendas: ")
    valorCom = readLine()!!.toDouble()

    if(valorCom <= 1000) {
       println("Você não terá comissão")
    }else if(valorCom > 1000 && valorCom <= 4999){
        valorCom = valorCom * 0.1
        println("Você recebeu uma comissão de: $valorCom")
    }else if(valorCom > 5001 && valorCom <= 9999 ) {
        valorCom = valorCom * 0.2
        println("Você recebeu uma comissão de: $valorCom")
    }else if(valorCom > 10000) {
        valorCom = valorCom * 0.3
        println("Você recebeu uma comissão de: $valorCom")
    }else{
        println("Inválido")
    }
}