public class array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Luqman";
        arrayString[1] = "Hanung";
        arrayString[2] = "Asidiq";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "justin";
        System.out.println(arrayString[0]);


        int[] arrayInt = new int[]{
                1,2,3,4,5
        };
        System.out.println(arrayInt[3]);
        System.out.println(arrayInt.length);

        String[][] members = {
                {"luqman" , "hanung" , "asidiq"},
                {"deni" ,  "sumargo"},
                {"justin" , "Bieber"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[2][1]);

    }
}
