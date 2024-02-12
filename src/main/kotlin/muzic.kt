fun main() {
    val promotion1: Int = 100
    val promotion2: Double = 0.95
    val promotion3: Double = 0.99
    var totalBuy: Int = 5000
    var buyer: Int = 1
    if (totalBuy <= 1000) {
        println("Стоимость покупки " + totalBuy + " руб")
    } else if (totalBuy > 1000 && totalBuy <= 10000 && buyer != 1) {
        totalBuy = totalBuy - promotion1
        println("Стоимость покупки " + totalBuy + " руб")
    } else if (totalBuy > 10001 && buyer != 1) {
        totalBuy = (totalBuy * promotion2).toInt()
        println("Стоиость покупки " + totalBuy + " руб")
    }
    else {
        if (totalBuy > 1000 && totalBuy <= 10000) {
            totalBuy = ((totalBuy - promotion1) * promotion3).toInt()
            println("Стоимость покупки " + totalBuy + " руб")
        } else {
            totalBuy = ((totalBuy * promotion2) * promotion3).toInt()
            println("Стоиость покупки " + totalBuy + " руб")
        }
    }
}