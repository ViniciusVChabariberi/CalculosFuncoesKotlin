import kotlin.math.*

fun main() {
    println("Área do Ret: ${areaRet(23.0, 41.0)}")
    println("Área do Tri: ${areaTri(24.0, 10.0)}")
    println("Área do Tri Eq: ${areaTriEq(8.0)}")
    println("Área do Tri Iso: ${areaTriIso(9.0, 13.0)}")
    println("Área do Tri Esc: ${areaTriEsc(5.0, 10.0, 12.0)}")
    println("Área da Circunferência: ${areaCirc(6.0)}")
    println("Área do Los: ${areaLos(22.0, 10.0)}")
    println("Área do Trap: ${areaTrap(12.0, 30.0, 25.0)}")
}

fun areaRet(base: Double, alt: Double): Double {
    return base * alt
}

fun areaTri(base: Double, alt: Double): Double {
    return 0.5 * base * alt
}

fun areaTriEq(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}

fun areaTriIso(base: Double, lado: Double): Double {
    val altura = sqrt(lado * lado - (base * base / 4))
    return 0.5 * base * altura
}

fun areaTriEsc(a: Double, b: Double, c: Double): Double {
    val sp = (a + b + c) / 2
    return sqrt(sp * (sp - a) * (sp - b) * (sp - c))
}

fun areaCirc(raio: Double): Double {
    return PI * raio * raio
}

fun areaLos(diagMaior: Double, diagMenor: Double): Double {
    return (diagMaior * diagMenor) / 2
}

fun areaTrap(baseMaior: Double, baseMenor: Double, alt: Double): Double {
    return ((baseMaior + baseMenor) * alt) / 2
}
