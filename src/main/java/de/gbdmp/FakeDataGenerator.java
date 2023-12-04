package de.gbdmp;

import com.github.javafaker.Faker;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class FakeDataGenerator
{
        final static Logger logger = Logger.getLogger(FakeDataGenerator.class);

    public static void generateFakeData() {
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String department = faker.commerce().department();

        System.out.println(name + " " + department);
        logger.info("test");
    }
    public static void main( String[] args )
    {
        generateFakeData();
        System.out.println( "Hello World!" );
    }
}
