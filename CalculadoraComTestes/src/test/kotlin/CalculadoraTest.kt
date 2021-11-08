import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    val calculadora = Calculadora()

    @Test
    fun soma(){
        assertEquals(6, calculadora.soma(3,3) )
    }

    @Test
    fun subtracao(){
        assertEquals(0, calculadora.subtracao(3, 3))
    }

    @Test
    fun multi(){
        assertEquals(12, calculadora.multi(3, 4))
    }

    @Test
    fun divi(){
        assertEquals(4, calculadora.divisao(8, 2))
    }

    @Test
    fun pot() {
        assertEquals(36.0, calculadora.potencia(6, 2))
    }

    @Test
    fun raiz(){
        assertEquals(5.0, calculadora.raiz(25, 2))
    }
}