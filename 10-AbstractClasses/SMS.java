public class SMS{
    private User sender;
    private User receiver;
    private String number;
    public SMS(User sender, User receiver, String number) {
        this.sender = sender;
        this.receiver = receiver;
        this.number = number;
    }
}
