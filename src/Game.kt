open class Game {

    fun gameon(){
        val peraturan = Peraturan()
        val pilihan = "batukertasgunting"
        var pemain1: String
        var pemain2: String

        println("")

        //INPUT Pemain
        while (true) {
            print("1. Masukkan pemain 1: ")
            var input1: String = readLine()!!.toLowerCase()

            pemain1 = input1
            if (input1 in pilihan) break

            input1 = input1.dropWhile { !it.isLetter() }
            input1 = input1.dropLastWhile { !it.isLetter() }
            pemain1 = input1
            if (pemain1 in pilihan) break
            println("Error; Pilih antara Batu/Kertas/Gunting !!!")
        }
        while (true) {
            print("2. Masukkan pemain 2: ")
            var input2: String = readLine()!!.toLowerCase()

            pemain2 = input2
            if (input2 in pilihan) break

            input2 = input2.dropWhile { !it.isLetter() }
            input2 = input2.dropLastWhile { !it.isLetter() }


            pemain2 = input2
            if (pemain2 in pilihan) break
            println("Error; Pilih antara Batu/Kertas/Gunting !!!")
        }


        //starting game

        peraturan.startinggame(pemain1, pemain2)
        print("\nMain lagi? ")
        var restart: String = readLine()!!.toLowerCase()
        restart.dropWhile { !it.isLetter() }
        restart.dropLastWhile { !it.isLetter() }
        val respond = "yesiyaa"
        var round:Int=1
        if (restart in respond) {
            round++
            println("\n=========")
            println("GAME KE $round")
            println("=========")
            return gameon()
        } else {
            println("\n==========================")
            println("Terimakasih telah bermain.")
            println("==========================")
        }

    }
}