public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "D";
        switch (nilai){
            case "A":
                System.out.println("Wow, Anda Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda goblok wqwqwq");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow, Anda Lulus dengan baik");
            case "B" , "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("anda tidak lulus");
            default -> {
                System.out.println("mungkin anda goblok wqwqwq");
            }
        }
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda Lulus dengan baik";
            case "B" , "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "anda tidak lulus";
            default -> {
                ucapan = "mungkin anda goblok wqwqwq";
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A" :
                yield "Wow, Anda Lulus dengan baik";
            case "B" , "C" :
                yield "Nilai anda cukup baik";
            case "D" :
                yield "anda tidak lulus";
            default :
                yield "mungkin anda goblok wqwqwq";
        };
        System.out.println(ucapan);


    }
}
