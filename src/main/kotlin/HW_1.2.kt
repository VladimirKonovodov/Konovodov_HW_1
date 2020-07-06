fun main() {
    val personHeight = 1.85F
    val personMass = 79.0F
    val index:Int = bodyMassIndex (personHeight, personMass)
    val verdict = when(index) {
        in 0..1600 ->"Выраженный дефицит массы тела"
        in 1601..1850->"Недостаточная (дефицит) масса тела"
        in 1851..2500->"Норма"
        in 2501..3000->"Избыточная масса тела (предожирение)"
        in 3001..3500->"Ожирение"
        in 3501..4000->"Ожирение резкое"
        in 4001..Int.MAX_VALUE->"Очень резкое ожирение"
        else -> "Выраженный дефицит массы тела"

    }
    println(verdict)
}

fun bodyMassIndex(height: Float, mass: Float): Int {
    val presentationMultiplier = 100
return ((mass/(height*height))*presentationMultiplier).toInt()
}
