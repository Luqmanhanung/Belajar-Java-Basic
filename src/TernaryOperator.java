public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 70;

        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        }else{
            ucapan = "maaf anda belum lulus";
        }
        System.out.println(ucapan);

        String ucapan1 = nilai>= 75 ? "Selamat Anda lulus" : "maaf anda belum lulus";
        System.out.println(ucapan1);
    }
}
