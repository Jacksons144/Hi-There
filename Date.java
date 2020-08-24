public class Date{

int month;
int day;
int year;
   
   public Date(int month, int day, int year){
      if(12 >= month >= 1){
         this.month = month;
      }//end of if 
      else{
         System.out.println("Invalid month were input");
      }//end of else
      
      if(31 >= day >= 1){
         this.day = day;
      }//end of if
      else{
         System.out.println("invalid day was input");
      }//end of else
      
      if(year >= 2019){
         this.year = year;
      }//end if
      else{
         System.out.println("Invalid year was input");
      }//end else
   }//end constructor
   
   public void setMonth(int month){
      dateMonth = month;
   }//end setMonth
   
   public void setDay(int day){
      dateDay = day;
   }//end setDay
   
   public void setYear(int year){
      dateYear = year;
   }//end year
   
   public int getMonth(){
      return dateMonth;
   }//end getMonth
   
   public int getDay(){
      return dateDay;
   }//end getDay
   
   public int getYear(){
      return dateYear;
   }//end getYear
   
  public String toString(){
      return "The date is " + dateMonth + "/" + dateDay + "/" + dateYear;
  }//end toString 
}