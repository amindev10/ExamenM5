import org.example.contarNumerosRepetidos
import org.example.ordenarArray
import org.example.qVegadesNumero
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
class TestsUnitaris {
    @Test
    fun testQVegadesNumero() {
        val arrayOriginal = arrayOf(3, 7, 2, 9, 3, 4, 7, 6)
        val numABuscar = 3

        val result = qVegadesNumero(arrayOriginal, numABuscar)

        assertEquals(2, result)
        assertTrue(result == 2)
        assertNotEquals(1, result)
    }



    @Test
    fun testContarNumerosRepetidos() {

        val arrayOriginal = arrayOf(3, 7, 2, 9, 3, 4, 7, 6)
        val result = contarNumerosRepetidos(arrayOriginal)
        assertEquals(3, result)
        assertTrue(result > 0)
        assertNotEquals(0, result)
    }

    @Test
    fun testOrdenarArray() {
        val arrayOriginal = arrayOf(3, 7, 2, 9, 3, 4, 7, 6)

        val result = ordenarArray(arrayOriginal)

        val expected = arrayOf(2, 3, 3, 4, 6, 7, 7, 9)
        assertEquals(expected, result)
        assertTrue(result contentEquals expected)
        assertNotEquals(arrayOriginal, result)
    }

}