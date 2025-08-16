import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);
    
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime current = LocalDateTime.now();
        return appointmentDate.isBefore(current);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18);
    }

    public String getDescription(LocalDateTime appointmentDate){ 
        // Pattern for an output like this : "You have an appointment on Friday, March 29, 2019, at 3:0 PM."
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h':'mm a'.'");
        return "You have an appointment on " + printer.format(appointmentDate);
        
    }


    public LocalDate getAnniversaryDate() {
        LocalDate anniversaryYear = LocalDate.of(2023, 9 ,15);
        return anniversaryYear.plusYears(1);
    }
}
