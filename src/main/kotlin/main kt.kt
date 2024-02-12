fun main(){
    val komission: Double = 0.075
    val minKomission: Int = 35
    val amount: Int = 100
    var totalKomission: Double = amount * komission
    if (totalKomission > minKomission){
        println("Комиссия составит " + totalKomission +" руб")}
    else{
      println("Комиссия составит " + minKomission + " руб")
    }
}


