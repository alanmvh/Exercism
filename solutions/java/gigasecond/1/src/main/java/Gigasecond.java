import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDate date;
    private LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.date = moment;
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return (date != null)
                ? addGigaSecond(date.atStartOfDay())
                : addGigaSecond(dateTime);
    }

    public LocalDateTime addGigaSecond(LocalDateTime dateTimeToAdd) {
        return dateTimeToAdd.plusSeconds(1_000_000_000);
    }
}
