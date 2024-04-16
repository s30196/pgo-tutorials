public class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonusAmount;

    public Goal(int year, int month, int day, String name, int bonusAmount) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonusAmount = bonusAmount;
    }

    public boolean isAchievedInCurrentMonth() {
        return true;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }
}