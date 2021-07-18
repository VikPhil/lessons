package viktor.com.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRealization {
    public static void realization() {
        List<Person> person = new ArrayList<>(10);
        String [] name = { "VLADISLAV", "NIKOLAY", "ALEXANDR", "DMITRIY", "VIKTOR" };
        String [] surname = { "KOZLOV", "MOROZOV", "MENDELEEV", "TOLSTOV", "CHERNOV" };

        for (int i = 0; i < 100; i++) {
            person.add(new Person(name[ThreadLocalRandom.current().nextInt(0, 4)],
                                  surname[ThreadLocalRandom.current().nextInt(0,4)],
                                  ThreadLocalRandom.current().nextInt(15, 30)));
        }
        Stream<Person> streamPersons = person.stream();
        streamPersons.filter(Person -> Person.getAge() < 21)
                     .peek( x -> System.out.println(x + "\n"))
                     .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                     .limit(4)
                     .collect(Collectors.toList())
                     .forEach(System.out::println);
    }
}
