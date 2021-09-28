package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {

        PaymentCalculator test = new PaymentCalculator();

            double b, i, p;
            b = 5000.0;
            i = 12.0/(100.0);
            p = 100.0;

            int n = test.calculateMonthsUntilPaidOff(b,i,p);

            assertEquals(70, n);
        }
    @Test
    void main() {
    }
    }