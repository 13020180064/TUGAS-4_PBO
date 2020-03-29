public class ControlStatement{
  public static void main (String[] args){
    int nilai_MTK = 80;
      
    if(nilai_MTK < 70){
      /*
       * Jika nilai/value pada variable nilai_MTK lebih dari 70
       * Maka program akan menjalankan statement ini
       */   
      System.out.println("Selamat kamu lulus ujian Matematika");
    }else {
      /*
       * Dan Jika nilai/value pada variable nilai_MTK kurang dari 70
       * Maka program akan menjalankan statement ini
       */  
      System.out.println("Mohon maaf kamu tidak lulus");
    }
  }
}