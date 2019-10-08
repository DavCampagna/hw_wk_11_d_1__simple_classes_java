import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    @Test

    public void print(){
        Printer printer = new Printer(100, 500);
        assertEquals(20, printer.print(40, 2));
    }
}
