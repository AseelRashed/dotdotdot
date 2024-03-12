package hw;

import org.junit.Assert;
import utilities.TestBase;
import java.nio.file.Files;
import java.nio.file.Path;
public class H1102 extends TestBase {


    public static void main(String[] args) {


        String userHome = System.getProperty("user.home");
        String sep = System.getProperty("file.separator");
        String fileName = "Aseel";
        String pathOfTheFile = userHome + sep + "Desktop" + sep + fileName;
        System.out.println("pathOfTheFile = " + pathOfTheFile);


        boolean isExist = Files.exists(Path.of(pathOfTheFile));
        Assert.assertTrue(isExist);
        System.out.println("isExist = " + isExist);


    }


}

