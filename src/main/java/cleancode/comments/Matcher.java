package cleancode.comments;

public class Matcher {
  public Matcher() {}

  public boolean match(int[] expected, int[] group,
                       int maxAllowedValues, int permittedError) {
// Clip "too-large" values

    clipTooLargeValues(group, maxAllowedValues);

// Check for length differences
    if (group.length != expected.length)
      return false;

// Check that each entry is within expected error range
    for (int i = 0; i < group.length; i++)
      if (Math.abs(expected[i] - group[i]) > permittedError)
        return false;
    return true;
  }

  private void clipTooLargeValues(int[] group, int maxAllowedValues) {
    for (int item = 0; item < group.length; item++)
      if (group[item] > maxAllowedValues)
        group[item] = maxAllowedValues;
  }

}
