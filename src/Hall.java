import java.util.Date;

public class Hall {
    private String name;
    private int capacity;
    private int hallId;
    private boolean hallStatus;
    private Date bookingStartDate;
    private Date bookingEndDate;


    public Hall(String name, int capacity, int hallId, boolean hallStatus, Date bookingStartDate, Date bookingEndDate) {
        this.name = name;
        this.capacity = capacity;
        this.hallId = hallId;
        this.hallStatus = hallStatus;
        this.bookingStartDate = bookingStartDate;
        this.bookingEndDate = bookingEndDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public boolean isHallStatus() {
        return hallStatus;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(Date bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public void setHallStatus(boolean hallStatus) {
        this.hallStatus = hallStatus;
    }
}
