
class MethotsExamples{
   public static void main(){
      smallest(1, 2, 3);
      smallest(2.1, 3.2, 1.3, 2.3);
      smallest();
   }

   public static int smallest(int x, int y, int z){
      return 0;
   }

   public static int smallest(double dx, double dy, double dz, double dw){
      return 0;
   }

   public static void smallest(){
      System.out.println("aa");
   }
}

class MyClass {
   public void m1() {
       m2();
   }

   public void m2() {
       m3(); 
   }

   public void m3() {}
}
