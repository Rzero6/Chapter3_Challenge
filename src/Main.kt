


fun main() {

    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")

    val pilihan = "batukertasgunting"
    var pemain1: String
    var pemain2: String
    var inputr1=""
    var inputr2=""

    println("")

    //INPUT Pemain
    while (true) {
        print("1. Masukkan pemain 1: ")
        var input1: String = readLine()!!.toLowerCase()
        for (index1: Int in (0..(input1.length - 1))) {
            if (input1[index1] == ' ') {
                inputr1 = input1.removeRange(index1, index1 + 1)
            }

        }
        pemain1=inputr1
        if (pemain1 in pilihan) break
        println("Error; Pilih antara Batu/Kertas/Gunting !!!")
    }
    while (true) {
        print("2. Masukkan pemain 2: ")
        var input2: String = readLine()!!.toLowerCase()
        for (index1: Int in (0..(input2.length - 1))) {
            if (input2[index1] == ' ') {
                inputr2 = input2.removeRange(index1, index1 + 1)
            }

        }
        pemain2=inputr2
        if (pemain2 in pilihan) break
        println("Error; Pilih antara Batu/Kertas/Gunting !!!")
    }



    //starting game
    val peraturan = Peraturan()
    peraturan.startinggame(pemain1, pemain2)

}






