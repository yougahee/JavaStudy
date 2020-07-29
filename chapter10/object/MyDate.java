package chapter10.object;

class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return month + day + year;
    }

    @Override
    public boolean equals(Object obj) {
        Date date = (Date)obj;
        if(date.year == this.year && date.month == this.month && date.day == this.day) {
            return true;
        }else {
            return false;
        }
    }
}

public class MyDate {
    public static void main(String[] args) {
        Date date1 = new Date(10, 12, 2020);
        Date date2 = new Date(10, 12, 2020);

        System.out.println(date1.equals(date2));
    }
}
