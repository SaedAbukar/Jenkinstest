import java.time.LocalDate;

public class TrainingSession {

    private LocalDate date;
    private int duration;

    public TrainingSession() {}

    public TrainingSession(LocalDate date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "TrainingSession: date: " + this.date.toString() + ", duration: " + this.duration;
    }
}
