import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBookTest;

    @BeforeAll
    public static void started(){
            System.out.println("All test starts!");
            phoneBookTest = new PhoneBook();
        }

        @ParameterizedTest
        @MethodSource("sourceAdd")
        public void testAdd(String inputName, String inputNumber, int expected){
        int result = phoneBookTest.add(inputName,inputNumber);
        assertEquals(expected, result);
    }

    public static Stream <Arguments> sourceAdd(){
        return Stream.of(
                Arguments.of("Andrey", "44444", 4),
                Arguments.of("Kolya", "4521477", 2),
                Arguments.of("Sergey", "1247856", 15)
        );
    }




}
