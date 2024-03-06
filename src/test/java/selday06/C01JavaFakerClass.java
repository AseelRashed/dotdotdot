package selday06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01JavaFakerClass {


    @Test
    public void testFaker() {

        Faker faker = new Faker();
        String fullname1 = faker.name().fullName();
        String fullname2 = faker.name().fullName();

        System.out.println("fulname1 = " + fullname1);
        System.out.println("fulname2 = " + fullname2);

        System.out.println("  ");

        System.out.println("faker.number() = " + faker.number().numberBetween(100,999));

        System.out.println("  ");

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        System.out.println("  ");

        System.out.println("faker.idNumber() = " + faker.idNumber());

        System.out.println("  ");

        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
        System.out.println("faker.internet().password() = " + faker.internet().password());

    }

}
