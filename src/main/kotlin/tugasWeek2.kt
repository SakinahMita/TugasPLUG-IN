fun main(){
    val Arraynum : Array<Int> =
        arrayOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    println(Arraynum.toList())
    val array1 = Array<Int>(10){it*2+6}
    println(array1.toList())
    println(array1.sum())
}