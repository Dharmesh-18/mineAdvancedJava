package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Example1 {

  public static void main(String[] args) {
    // defining comparator
    Comparator<String> lengthComparator=
            (s1, s2) -> {
                return Integer.compare(s1.length(), s2.length());
            };

    Comparator<String> alphaComparator=
            (s1, s2) -> {
              return s1.compareTo(s2);
            };

    String[] cityNames = new String[] {"New Delhi", "Berlin", "Amsterdam"};

    Arrays.sort(cityNames, lengthComparator.thenComparing(alphaComparator));

    for(String city : cityNames) {
      System.out.println(city);
    }
  }
}
