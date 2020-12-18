open class Peraturan: InterfacePeraturan {
    override fun opening() {

        println("\n==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")


    }
    override fun startinggame(pemain1:String, pemain2:String){

        lateinit var hasil: String

        if (pemain1 == pemain2) hasil = "DRAW!"
        if ((pemain1 == "batu" && pemain2 == "gunting") || (pemain1 == "kertas" && pemain2 == "batu") || (pemain1 == "gunting" && pemain2 == "kertas"))
        {
            hasil = "Pemain 1 MENANG!"
        }
        if ((pemain2 == "kertas" && pemain1 == "batu")||(pemain2 == "batu" && pemain1 == "gunting")||(pemain2 == "gunting" && pemain1 == "kertas"))
        {
            hasil = "Pemain 2 MENANG!"
        }

        println("\nHasil: ")
        println(hasil)

    }

}