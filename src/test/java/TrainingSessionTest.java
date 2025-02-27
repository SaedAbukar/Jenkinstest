import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TrainingSessionTest {

    @Test
    void getDate() {
        TrainingSession session = new TrainingSession();
        session.setDate(LocalDate.now());
        assertEquals(LocalDate.now(), session.getDate());
    }

    @Test
    void setDate() {
        TrainingSession session = new TrainingSession();
        session.setDate(LocalDate.now());
        LocalDate date = LocalDate.of(2025, 2, 10);
        assertNotEquals(date, session.getDate());
    }

    @Test
    void getDuration() {
        TrainingSession session = new TrainingSession();
        session.setDuration(90);
        assertEquals(90, session.getDuration());
    }

    @Test
    void setDuration() {
        TrainingSession session = new TrainingSession();
        session.setDuration(90);
        assertNotEquals(100, session.getDuration());
    }

    @Test
    void testToString() {
        TrainingSession session = new TrainingSession();
        session.setDate(LocalDate.now());
        session.setDuration(90);
        String test = "TrainingSession: date: " + session.getDate().toString() + ", duration: " + session.getDuration();
        assertEquals(test, session.toString());
    }
}