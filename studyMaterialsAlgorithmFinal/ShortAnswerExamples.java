public class ShortAnswerExamples {
   public static void main (String[] args){
      
   }
   public static void voteYes(int evetOyu){
         evetOyu++;
   }
   public static int getWinner(int evetOyu, int hayirOyu){
      int durum = 3;
      if(evetOyu > hayirOyu){
         durum = 1;
      }
      else if(evetOyu < hayirOyu){
         durum = 2;
      }
      return durum;
   }
}
