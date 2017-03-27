package calculatorPackage;


import org.junit.Assert;
import org.junit.Test;


public class calculatorTest {
    
    @Test
    public void testAdd() {
        calculator c = new calculator();
        c.add(5);
        Assert.assertEquals(5, c.getTotal());
    }
    
}
