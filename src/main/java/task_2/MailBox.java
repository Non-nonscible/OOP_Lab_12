package task_2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo){
        this.infos.add(mailInfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        MailSender mailSender = new MailSender();
        for (MailInfo info: infos){
            MailSender.sendMail(info);
        }
    }

}
