package selday3;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class C01AssertionMethods {


    @Test
    public void assertEqualsTest() {
        // If the method takes two parameters, they are compared, and if they are equal, the test is PASSED,
        // otherwise, it throws an AssertionError.
        Assert.assertEquals(5,5);
        // Assert.assertEquals("The values are not equal...",6,5);// message appears if test fails
    }

    @Test
    public void assertTrueTest() {
        // If the method takes one parameter and the parameter is true, the test is PASSED,
        // if it is false, the test is FAILED.
        Assert.assertTrue(5==5);
        //Assert.assertTrue("The command is not true...",3==5);
    }

    @Test
    public void assertFalseTest() {
        // If the method takes one parameter and the parameter is false, the test is PASSED,
        // if it is true, the test is FAILED.
        Assert.assertFalse(4>8);

    }

    @Test
    public void assertNullTest() {
        // If the method takes one parameter, the test is PASSED if the parameter is null,
        // otherwise, the test is FAILED.
        Integer a = null;
        // int d =null; int does not accept null values
        String b = "";
        Assert.assertNull("Fail", a);
        // Assert.assertNull("Fail", b);
    }

    @Test
    public void assertNotNullTest() {
        // If the method takes one parameter, the test is PASSED if the parameter is not null,
        // otherwise, the test is FAILED.
        Integer a = null;
        String b = "";
        Assert.assertNotNull(b);
        //Assert.assertNotNull(a);

    }

    @Test
    public void assertSameTest() {
        // This method uses the == operator internally to verify if two objects are equal.
        // assertSame also compares reference values.
        // In object comparison, both values and references must be the same.
        String a ="SDA";
        String b ="SDA";
        String c =new String("SDA");
        String d =new String("SDA");
        assertEquals(a,b);
        assertEquals(a,c);
        assertSame(a,b);
        //assertSame(a,c);

        // Assert.assertSame(new String("Hi"), new String("Hi")); // failed
    }

    @Test
    public void assertNotSameTest() {
        // It is valid for objects where both values and references are not the same.
        String a ="SDA";
        String b ="SDA";
        String c =new String("SDA");
        String d =new String("SDA");
        assertNotSame(a,c);
    }

    @Test
    public void assertArrayEquals() {
        // Takes two parameters and the lengths and elements at the same index of the given arrays must be the same.
        String [] arr = {"J","a","v","a"};
        String [] brr = {"J","a","v","a"};
        String [] crr = {"J","A","v","a"};
        Assert.assertArrayEquals(arr,brr);
        //Assert.assertArrayEquals(arr,crr);
    }
}

 /*
    import static org. junit. Assert. *;
    assertSame

     import org. junit. Assert;
     Assert.assertSame

    "The advantage of static import for the Assert class is as follows:

    To eliminate the unnecessary use of the Assert class name with Assert methods.
    It saves time.
    Improves readability and makes writing better code."
     */
