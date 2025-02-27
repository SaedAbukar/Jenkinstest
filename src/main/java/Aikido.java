import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Aikido {

    private final List<TrainingSession> trainingSessions;
    private int totalTrainingSessions;
    private int totalTrainingTime;
    private Boolean eligibleForGraduation;

    public Aikido() {
        this.trainingSessions = new ArrayList<>();
        this.eligibleForGraduation = false;
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void addTrainingSession(TrainingSession trainingSession) {
        this.trainingSessions.add(trainingSession);
        totalTrainingSessions++;
        totalTrainingTime += trainingSession.getDuration();
    }

    public int getTotalTrainingSessions() {
        return totalTrainingSessions;
    }
    public int getTotalTrainingTime() {
        return totalTrainingTime;
    }
    public Boolean getEligibleForGraduation() {
        return eligibleForGraduation;
    }

    public void setEligibleForGraduation(Boolean eligibleForGraduation) {
        this.eligibleForGraduation = eligibleForGraduation;
    }

    public void checkEligibility() {
        LocalDate startDate = trainingSessions.get(0).getDate();
        LocalDate endDate = trainingSessions.get(trainingSessions.size() - 1).getDate();
        long difference = ChronoUnit.MONTHS.between(startDate, endDate);
        if (totalTrainingSessions >= 100 || difference >= 6) {
            eligibleForGraduation = true;
        }
    }
}
