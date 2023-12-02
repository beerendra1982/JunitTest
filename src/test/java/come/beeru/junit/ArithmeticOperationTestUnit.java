package come.beeru.junit;
import com.beeru.junit.ArithmeticOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTestUnit {
    @Test
    public void testConcatWithInput() {
        float flt1 = 10.5F;
        float flt2 = 10.5F;
        float flt3 = 10.5F;
        double expect = flt1+ flt2+ flt3 ;
        float actual = ArithmeticOperation.Addition(flt1,flt2,flt3);
        assertEquals(expect, actual);
    }
    @Test
    public void testConcatWithNullInput() {
        float flt1 = 10.5F;
        float flt2 = 10.5F;
        float flt3 = Float.parseFloat(null);

        double expect = flt1+ flt2 ;
        float actual = ArithmeticOperation.Addition(flt1,flt2,flt3);
        assertEquals(expect, actual);
    }

}
