package cleancode.naming;

class Event {
  public static final int SATURDAY = 6;
  public static final int SUNDAY = 0;
  public static final int START_OF_DAY = 8;
  public static final int END_OF_DAY = 18;

  private final int weekDay;
  private final Time eventTime;

  public Event(int weekDay, Time time) {
    this.weekDay = weekDay;
    this.eventTime = time;
  }
  public int getWeekDay() {
    return weekDay;
  }

  public Time getTime() {
    return eventTime;
  }

  public boolean isDuringWorkingHours() {
    if (this.getWeekDay() == SATURDAY || this.getWeekDay() == SUNDAY) {
      return false;
    } else {
      return (this.getTime().getHour() >= START_OF_DAY && this.getTime().getHour() < END_OF_DAY);
    }
  }
}
