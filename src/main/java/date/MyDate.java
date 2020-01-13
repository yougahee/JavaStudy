package date;

public class MyDate {

    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public MyDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String isValid() {
        if(isValid)
            return "유효한 날짜입니다";
        else
            return "유효하지 않은 날짜에요!!!!";
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >0 && month <=12){
            this.month = month;
        } else{
            isValid = false;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day>0 && day <=31)
                {
                    isValid = true;
                    this.day = day;
                }
                else{
                    isValid = false;
                }
                break;
            case 4: case 6: case 9: case 11:
                if(day>0 && day<=30) {
                    isValid = true;
                    this.day = day;
                }else {
                    isValid = false;
                }
                break;
            case 2:
                if(day>0 && day<=29) {
                    isValid = true;
                    this.day = day;
                }else {
                isValid = false;
            }
                break;

        }
     }
}
