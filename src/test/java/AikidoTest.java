import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AikidoTest {

    @Test
    void getTrainingSessions() {
    }

    @Test
    void addTrainingSession() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        aikido.addTrainingSession(trainingSession);
        assertEquals(1, aikido.getTrainingSessions().size());
    }

    @Test
    void getTotalTrainingSessions() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        TrainingSession trainingSession1 = new TrainingSession(LocalDate.of(2025, 2, 27), 120);
        aikido.addTrainingSession(trainingSession);
        aikido.addTrainingSession(trainingSession1);
        assertEquals(2, aikido.getTrainingSessions().size());
        assertEquals(aikido.getTotalTrainingSessions(), aikido.getTotalTrainingSessions());
    }

    @Test
    void getTotalTrainingTime() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        TrainingSession trainingSession1 = new TrainingSession(LocalDate.of(2025, 2, 27), 120);
        aikido.addTrainingSession(trainingSession);
        aikido.addTrainingSession(trainingSession1);
        int totalTrainingTime = 220;
        assertEquals(totalTrainingTime, aikido.getTotalTrainingTime());
    }

    @Test
    void getEligibleForGraduation() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        TrainingSession trainingSession1 = new TrainingSession(LocalDate.of(2025, 2, 27), 120);
        aikido.addTrainingSession(trainingSession);
        aikido.addTrainingSession(trainingSession1);
        assertEquals(false, aikido.getEligibleForGraduation());
    }

    @Test
    void checkEligibility() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        TrainingSession trainingSession1 = new TrainingSession(LocalDate.of(2025, 9, 27), 120);
        aikido.addTrainingSession(trainingSession);
        aikido.addTrainingSession(trainingSession1);
        aikido.checkEligibility();
        assertEquals(true, aikido.getEligibleForGraduation());
    }

    @Test
    void checkEligibilityMonths() {
        Aikido aikido = new Aikido();
        TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
        TrainingSession trainingSession1 = new TrainingSession(LocalDate.of(2025, 3, 27), 120);
        aikido.addTrainingSession(trainingSession);
        aikido.addTrainingSession(trainingSession1);
        aikido.checkEligibility();
        assertEquals(false, aikido.getEligibleForGraduation());
    }

    @Test
    void checkEligibilityDuration() {
        Aikido aikido = new Aikido();
        for (int i = 0; i < 101; i++) {
            TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
            aikido.addTrainingSession(trainingSession);
        }
        aikido.checkEligibility();
        assertEquals(true, aikido.getEligibleForGraduation());
    }

    @Test
    void checkNotEligibilityDuration() {
        Aikido aikido = new Aikido();
        for (int i = 0; i < 99; i++) {
            TrainingSession trainingSession = new TrainingSession(LocalDate.now(), 100);
            aikido.addTrainingSession(trainingSession);
        }
        aikido.checkEligibility();
        assertEquals(false, aikido.getEligibleForGraduation());
    }
}