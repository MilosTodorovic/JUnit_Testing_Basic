package JUnitNum1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrintHelloTest {
    
    public PrintHelloTest() {
    }

    @Test(timeout = 2000)
    public void testPrintMessage() {
        PrintHello service = new PrintHello();
        service.printMessage();
    }
    
}
