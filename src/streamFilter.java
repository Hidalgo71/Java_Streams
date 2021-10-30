import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamFilter
{
    //@Test
    /*public void regular()       //Non-optimized method
    {
        //Test case
        //Count the number of names starting with alphabet A in list

        int count = 0;
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Neslihan");
        names.add("Adnan");
        names.add("Yekta");
        names.add("Adam");
        names.add("Ozlem");

        for (int i = 0; i < names.size(); i++)
        {
            String actualName = names.get(i);
            if (actualName.startsWith("A"))                                         //Count the names but starts with 'A'
            {
                count++;
            }
        }
        System.out.println(count);
    }*/

    @Test
    public void streamFilter()              //optimized method
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Neslihan");
        names.add("Adnan");
        names.add("Yekta");
        names.add("Adam");
        names.add("Ozlem");

        Long j = Stream.of("Ahmet", "Mehmet", "Neslihan", "Adnan", "Yekta", "Adam", "Ozlem").filter(s ->        //Creating Stream and applying filter
                {
                    return s.startsWith("A");                                                                          //Stream() scan all the List and filter starts with 'A'
                                                                                                    //Operation will execute only if operation (filter) returns true
                }).count();
        System.out.println(j);

        //Print all the names of Arraylist but only word length > 4
        names.stream().filter(s -> s.length() > 5).forEach(System.out::println);
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(System.out::println);           //Only 1 output returns
    }
}
