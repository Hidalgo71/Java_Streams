import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMapCollect
{
    /*@Test
    public void streamMap()
    {
        Stream.of("Ahmet", "Mehmet", "Neslihan", "Adnan", "Yekta", "Adam", "Ozlem").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())              //Help us to modify our stream filter result
                                                                                                    .forEach(System.out::println);                      //Map method takes a text but last letter is "a" and printing the word uppercase

        List<String> names = Arrays.asList("Ahmet", "Mehmet", "Neslihan", "Adnan", "Yekta", "Adam", "Ozlem");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(String::toUpperCase).forEach(System.out::println);                      //Sorting the words but only 1st letter is 'A'
    }*/

    /*@Test
    public void concatArrList()
    {
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Murat");
        names1.add("Kemal");
        names1.add("Kobe");
        names1.add("Hacer");

        List<String> names2 = Arrays.asList("Kate", "Locke", "Jack", "Hurley");

        Stream<String> combinedStream = Stream.concat(names1.stream(), names2.stream());                                    //Combining 2 streams into 1
        //combinedStream.forEach(System.out::println);

        //Testing searched word in the stream
        boolean found = combinedStream.anyMatch(s -> s.equalsIgnoreCase("Kobe"));
        System.out.println(found);
        Assert.assertTrue(found);
    }*/

    @Test
    public void streamCollect()
    {
        List<String> strmL = Stream.of("Kobe", "Magic", "Nesyek", "Lakers", "Lost").collect(Collectors.toList());           //Creating list and we can use it for any subsequent validation
        System.out.println(strmL.get(0));                                                                                   //Print 1st index of list

        //Test case: Printing unique numbers of array
        List<Integer> nums = Arrays.asList(3, 4, 7, 7, 1, 1, 1, 5, 9, 8, 0, 0);
        //nums.stream().distinct().forEach(System.out::println);                                                              //Distinct() is Prints only unique items.
        List<Integer> listNums = nums.stream().distinct().sorted().collect(Collectors.toList());                            //Make list unique items, sort and assign to them a new list
        System.out.println(listNums.get(2));                                                                                //Printing 3rd index of list


    }
}
