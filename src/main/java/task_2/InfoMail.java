package task_2;

public class InfoMail implements MailCode{
    private static final String TEMPLATE = "Hello, you, %NAME have received a new letter!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
