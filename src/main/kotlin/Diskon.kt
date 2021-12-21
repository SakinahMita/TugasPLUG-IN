fun main(){
    val Statuspembeli : String = "member"
    val pembelian : Int = 500000
    val hargapembelian : Double = 625000.0
    val diskon5persen : Double = hargapembelian - (hargapembelian * 0.05)
    val diskon10persen : Double = hargapembelian - (hargapembelian * 0.1)
    val diskon15persen : Double = hargapembelian - (hargapembelian * 0.15)

    if (Statuspembeli == "member" && hargapembelian <= pembelian){
        println("pembeli 1 mendapatkan diskon 5% dari 625000"+",jadi totalnya : "+diskon5persen)
    }else if (Statuspembeli != "member"&& hargapembelian >= pembelian){
        println("pembeli 1 mendapatkan diskon 10% dari 625000"+",jadi totalnya : " +diskon10persen)
    }else {
        if (Statuspembeli == "member" && hargapembelian >= pembelian){
            println("pembeli 1 mendapatkan diskon 15% dari 625000"+",jadi totalnya adalah : 625000 - 93750 = "+ diskon5persen)
        }else{
        }
    }}