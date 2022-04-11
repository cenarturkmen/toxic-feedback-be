package cenar.toxicfeedback.feedback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {
    private FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public void addFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Feedback feedback) {
        feedbackRepository.deleteById(feedback.getId());
    }

    public List<Feedback> getAllFeedbacks(){
        return feedbackRepository.findAll();
    }
}
