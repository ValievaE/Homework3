fun main() {
    val amount = 78000
    val type = "maestro"
    val prevAmount = 0
    
    val resultComission = (typeComission(type, amount, prevAmount)).toInt()
    println("Total result: $resultComission kop.")

}


fun typeComission(type: String, amount: Int, prevAmount: Int): Double {

    return when (type) {
        "masterCard", "maestro" -> if ((amount + prevAmount) > 75000) {
            (0.006 * amount + 20) * 100
        } else 0.0
        "visa", "mir" -> if (0.0075 * amount <= 35) {
            0.0075 * amount * 100
        } else 3500.0
        else -> 0.0
    }
}