fun main(){
    val amount: Double = 942_585.00
    var commission: Double = if (amount/100.00*0.75 < 35.00) 35.00 else amount/100.00*0.75
    println(commission)
}