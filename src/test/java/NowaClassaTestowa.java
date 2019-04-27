


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class NowaClassaTestowa {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Stworzony nowy object");
    }

    @Test
    public void addNumbers() {

        int result = calculator.add(4, 6);
        assertEquals(10, result);
    }

    @Test
    public void odejmowanie() {

        int result = calculator.add(5, 6);

        assertEquals(11, result);
    }

    @Test
    public void mnozenieTestowanieOperacji() {
        int result = calculator.mnozenie(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void dzielenieTestowanieOperacji() {
        //Whene
        Double result = calculator.dzielenie(2.0, 3.0);
        //Then
        Double expectetResult = 2.0 / 3.0;
        assertEquals(expectetResult, result, 0);
    }

    @Test
    public void dzielenieTestowanieOperacjiNiepowinaBycNullem() {
        //Whene
        Double result = calculator.dzielenie(2.0, 0.0);
        //Then
        assertNull(result);
    }

    @Test
    public void dzielenieTestowanieOperacjiNiejestNull() {
        //Whene
        Double result = calculator.dzielenie(2.0, 3.0);
        //Then
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)// drugi sposob na przetestowania
    public void divideByZeroExeption() {
        calculator.divedeFinal(3.0,0);

//        pierwszy sposob na przetestowania
//        try {
//            calculator.divedeFinal(3.0, 0);
//        } catch (IllegalArgumentException ex) {
//            assertEquals("Mianownik nie moze byc zerem",ex.getMessage());
//        } catch (Exception ex) { fail("Jest inny wyjatek niz  oczekujemy :"+ex.getClass().getName());
//        }
    }

    @Test
    //When
    @Parameters({"2", "4", "6"
    })
    public void czyLiczbaJestParzysta(int a) {
        //Then
        assertTrue(calculator.liczba(a));
    }

    @Test
    //When
    @Parameters({"1", "3", "5"})
    public void czyLiczbaJestNieParzysta(int a) {
        //Then
        assertFalse(calculator.liczba(a));
    }
}

//    @Test - testowania z logicznym operatorem
//    public void basicLogicShouldBeValid(){
//        int moneyToDeposit = 100;
//        if ( moneyToDeposit> 0){
//
//        }


