package cenar.toxicfeedback.feedback;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("feedbacks")
public class Feedback {

    @Id
    private Long id;
    private String name;
    private String email;
    private String message;
    private String toxicResult;
    private String date;
    public Feedback(Long id, String name, String email, String message, String toxicResult, String date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.toxicResult = toxicResult;
        this.date = date;
    }
    public Feedback(String name, String email, String message, String toxicResult, String date) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.toxicResult = toxicResult;
        this.date = date;
    }

    public Feedback() {
    }

    public String getToxicResult() {
        return toxicResult;
    }

    public void setToxicResult(String toxicResult) {
        this.toxicResult = toxicResult;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
