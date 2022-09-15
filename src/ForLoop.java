public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;
        //hanya mengunakan kondisi
        for (; counter <= 10 ; ) {
            System.out.println("perulangan" + counter);
            counter++;
        }

        //menggunakan init statement dan kondisi
        for (var counter2 = 1; counter2 <= 10 ; ) {
            System.out.println("perulangan" + counter2);
            counter2++;
        }

        //menggunakan ini statement, kondisi dan post statement
        for (var counter3 = 1; counter3 <= 10 ;counter3++ ) {
            System.out.println("perulangan" + counter3);
        }


    }
}
