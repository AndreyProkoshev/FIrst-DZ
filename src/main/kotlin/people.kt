fun main (){
    var endName = ""
    val countLikes: Int = 11
    if ((countLikes - 1) % 10 == 0) endName = "людям" //исключение на 11, 111, 211 и т.д
    else if (countLikes % 10 == 1) endName = "человеку"
    else if (countLikes % 10 == 2 || countLikes % 10 == 3 || countLikes % 10 == 4) endName = "людям"
    else endName = "человекам"
    println("Понравилось " + countLikes + " " + endName)
}