public class AlredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Mike", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);

    }
}
