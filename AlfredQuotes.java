import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s. Lovely to see you %s.", dayPeriod, name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is " + date;
    }
}