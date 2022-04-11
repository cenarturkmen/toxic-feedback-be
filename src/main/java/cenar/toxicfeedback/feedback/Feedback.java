package cenar.toxicfeedback.feedback;

import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedback")
public class Feedback {

    @Id
    private String id;

    @NonNull
    private String name;

    @NonNull
    private String email;
    
    @NonNull
    private String message;
    
    @NonNull
    private String date;

    @NonNull
    private String result;

    public Feedback() {
        name = null;
        email = null;
        message = null;
        result = null;
        date = null;
    }

    public Feedback(String name, String email, String message, String result, String date) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.result = result;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }






}
