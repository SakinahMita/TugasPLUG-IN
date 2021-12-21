fun main(){
    val newArray = arrayOf(1,2,3,4,5)
    for(i in newArray){
        for(j in newArray){
            if(i == j){
                break
            }
            println(j)
        }
        println()

    }
    var angka = 2
    var pangkat = 3
    var angka1 = 1
    for (i in 1..pangkat){
        angka1 *= angka
    }
    println(angka1)
}