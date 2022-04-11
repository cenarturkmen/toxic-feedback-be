package cenar.toxicfeedback.feedback;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository  extends MongoRepository<Feedback, String> {
}
