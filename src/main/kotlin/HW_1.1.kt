private fun main() {
    val amount = 200 // стоимость текущей продажи
    val total = 11_000 // сумма предыдущих продаж
    val exclusiveFalse : Boolean = false
    val exclusiveTrue : Boolean = true
    val feeFalse = calculateFee(amount, total, exclusiveFalse )  // exclusive по умолчанию = false
    println("Обычный автор заплатит $feeFalse") // 40val fee = calculateFee(amount, total, exclusive )  // exclusive по умолчанию = false
    val feeTrue = calculateFee(amount, total, exclusiveTrue )  // exclusive по умолчанию = false
    println("Эксклюзивный автор заплатит $feeTrue")
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean ): Any {
    val percent =   when (total) {
        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        in 50001..Int.MAX_VALUE -> 15
        else -> 30
    }
    val excPercent = when (exclusive){
        true->5
        false->0
    }
    return amount*(percent-excPercent)/100
}
