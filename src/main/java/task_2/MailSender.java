package task_2;


import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("965b9e1612771f55fabcd51922cadb4e", "6e3cca422afc4b1e6d35809b1b8a0f8b", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "andrea.kozlovskyi@ucu.edu.ua")
                                        .put("Name", "Andrea"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "andrea.kozlovskyi@ucu.edu.ua")
                                                .put("Name", "Andrea")))
                                .put(Emailv31.Message.SUBJECT, "Lab email")
                                .put(Emailv31.Message.TEXTPART, mailInfo.generate())));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
