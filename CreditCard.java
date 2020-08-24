public class CreditCard{
   private long cardNumber;
   private int expirationDate;
   
   public void setCardNumber(long number){
      cardNumber = number;
   }
   public void setExpirationDate(int date){
      expirationDate = date;
   }
   
   public long getCardNumber(){
      return cardNumber; 
   }
   
   public int getExpirationDate(){
      return expirationDate;
   }
   
   public String toString(){
      return "Card Number is " + cardNumber + " and Expiration Date is " + expirationDate;
   }
}