package selday14;

import org.testng.annotations.Test;

public class C02TestNG {


    @Test(priority = 3)
    public void test01(){
        System.out.println("1 passed");
    }

    @Test
    public void test02(){
        System.out.println("2 passed");
    }

    @Test
    public void test03(){
        System.out.println("3 passed");
    }
}
