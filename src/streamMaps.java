import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamMaps
{
    @Test
    public void streamMap()
    {
        Stream.of("Ahmet", "Mehmet", "Neslihan", "Adnan", "Yekta", "Adam", "Ozlem").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())              //Help us to modify our stream filter result
                                                                                                    .forEach(System.out::println);                      //Map method takes a text but last letter is "a" and printing the word uppercase

        List<String> names = Arrays.asList("Ahmet", "Mehmet", "Neslihan", "Adnan", "Yekta", "Adam", "Ozlem");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(String::toUpperCase).forEach(System.out::println);                      //Sorting the words but only 1st letter is 'A'
    }
}
