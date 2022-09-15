public class Break {
    public static void main(String[] args) {
        var counter = 10;
        while (true){
            System.out.println("perulangan ke-" + counter);
            counter++;

            if (counter > 10){
                break;
            }
        }
        System.out.println(counter);
    }
}
