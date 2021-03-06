package cenar.toxicfeedback.feedback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("/health")
    public String health() {
        return "Service is up and running";
    }

    @PostMapping(path = "/addFeedback")
    public void addFeedback(@RequestBody Feedback feedback){
        feedbackService.addFeedback(feedback);
    }

    @GetMapping(path = "/feedbacks")
    public List<Feedback> getFeedbacks(){
        return feedbackService.getAllFeedbacks();
    }


}
