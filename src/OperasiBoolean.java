public class OperasiBoolean {
  public static void main(String[] args) {


    int absen = 75;
    int nilaiAkhir = 80;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilai = nilaiAkhir >= 75;

    int lulus = lulusAbsen && lulusNilai;
    System.out.println(lulus);

  }
}
