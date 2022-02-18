package cleancode.functions;

import org.apache.commons.lang3.StringUtils;

public class Rating {

  private final String rating;

  public Rating(String rating) {
    this.rating = rating;
  }



  public boolean isValidRating() {
    if (this.getRating() == null) {
      return false;}

      if (isValidBRating()) {
          return true;
        }
      return isValidARating();


  }

  private boolean isValidARating(){
    return this.getRating().substring(0, 1).equalsIgnoreCase("A")
            && this.getRating().length() == 3
            && StringUtils.isNumeric(this.getRating().substring(1, 3));
  }

  private boolean isValidBRating(){
    return this.getRating().substring(0, 1).equalsIgnoreCase("B")
            && (this.getRating().length() == 2)
            &&StringUtils.isNumeric(this.getRating().substring(1, 2))
            && Integer.parseInt(this.getRating().substring(1, 2)) > 0
            && Integer.parseInt(this.getRating().substring(1, 2)) < 5;
    }



  private String getRating() {
    return rating;
  }

}
