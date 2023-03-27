public class Holiday {
    private String date;
    private String holiday;

    public Holiday(String date, String holiday) {
        this.date = date;
        this.holiday = holiday;
    }

    public boolean checkDate(String date) {
        return this.date.equals(date);
    }

    public String getDate() {
        return date;
    }

    public String getHoliday() {
        return holiday;
    }
}
