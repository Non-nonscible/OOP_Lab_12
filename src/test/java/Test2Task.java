import org.junit.Assert;
import org.junit.Test;
import task_2.*;
import task_2.Gender;

public class Test2Task {
    @Test
    public void Test(){
        Client client = new Client("Andrea", Gender.Male, 19);
        MailCode mailCode = new GiftMail();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        String res = mailInfo.generate();
        Assert.assertEquals(res, "You, Andrea have received a gift!");

        MailCode mailCode1 = new InfoMail();
        MailInfo mailInfo1 = new MailInfo(client, mailCode1);
        String res1 = mailInfo1.generate();
        Assert.assertEquals(res1, "Hello, you, Andrea have received a new letter!");

    }
}
