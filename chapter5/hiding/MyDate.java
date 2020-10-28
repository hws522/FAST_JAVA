package chapter5.hiding;

public class MyDate {
    
   private int day;
   private int month;
   private int year;

   private boolean isValid = true; //멤버변수일때 초기값은 false.

    public void setDay(int day)
    {
        this.day = day;   //this를 뺼 경우, setDay안에 들어가는 모든 day들은 같은 값을 가리킨다.
                         //값이 전달 되지 않음.
    }

    public int getDay()
    {
        return day;
    }

    public void setMonth(int month)
    {
        if(month < 1 || month > 12)
        {
            isValid = false;
        }

        else
        {
            this.month = month;
        }
    }

    public int getMonth()
    {
        return month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }


   public void showDate()
   {
       if(isValid)
       {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
       }

       else
       {
           System.out.println("유효하지 않은 날짜입니다.");
       }
       
   }
}
