package cenar.toxicfeedback.feedback;

import javax.persistence.*;

@Entity
@Table
public class Feedback {

    @Id
    @SequenceGenerator(
            name = "feedback_seq",
            sequenceName = "feedback_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "feedback_seq")
    private Long id;
    private String name;
    private String email;
    private String message;
    private String toxicResult;
    public Feedback(Long id, String name, String email, String message, String toxicResult) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.toxicResult = toxicResult;
    }
    public Feedback(String name, String email, String message, String toxicResult) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.toxicResult = toxicResult;
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


}
