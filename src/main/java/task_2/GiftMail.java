package task_2;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "You, %NAME have received a gift!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
