package com.cydeo.test.day10_javafacer_driver_util;
import com.github.javafaker.Faker;
import com.github.javafaker.HarryPotter;
import org.testng.annotations.Test;
public class JavaFaker_Practice {
    @Test
    public void javaFaker() {
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().city() = " + faker.address().city());

        HarryPotter harryPotter = faker.harryPotter();
        String name = harryPotter.character();
        System.out.println("character from Harry Potter: " + name);

        System.out.println("random phone number: " + faker.numerify("+7(###) ###-##-##"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));
        System.out.println("bothify: " + faker.bothify("???###"));
        System.out.println("finance.creditCard: " + faker.finance().creditCard());
        System.out.println("finance.creditCard.replace : " + faker.finance().creditCard().replace("-", ""));

        System.out.println(faker.chuckNorris().fact().replace("Chuck Norris", "Abu"));
    }
}
