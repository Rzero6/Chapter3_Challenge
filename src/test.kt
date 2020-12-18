fun main(){
    var pemain1:String
    print("1. Masukkan pemain 1: ")
    var input1: String = readLine()!!.toLowerCase()
    var result=""
    for (index1: Int in (0..(input1.length - 1))) {
        if (input1[index1] == ' ') {
            result = input1.removeRange(index1, index1 + 1)

            println("REMOVING")
        }

    }
    pemain1=result
    println(pemain1)

}