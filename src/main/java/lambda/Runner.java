package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {

  public static void main(String[] args) {
    Person fred = new Person("Fred", "Smith", 56);
    Person maria = new Person("Maria", "Gracia", 43);
    Person rob = new Person("Rocker", "Hartgirl", 36);
    Person robber = new Person("Robber", "Hartman", 36);

    // TODO: Write comparators (firstname and age) for Person using lambda expressions.

    Comparator<Person> ageComparator= Comparator.comparingInt(Person::getAge);

    Comparator<Person> nameComparator= Comparator.comparing(Person::getFirstName);


    //  Apply comparators for sorting person list

    Person[] persons = {fred, maria, rob, robber};

    Arrays.sort(persons, ageComparator.thenComparing(nameComparator));
    //  When the age is same, it should compare the firstname

    for(Person person: persons){
      System.out.println(person.getFirstName() +" : "+ person.getAge());
    }
  }
}
