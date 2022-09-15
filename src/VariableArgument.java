public class VariableArgument {
    public static void main(String[] args) {
        int[] values = {60, 41, 52, 99, 100};
        sayCongrats("tono", values);

        sayCongrats("deny", 90,90,90,90,90);

    }

    static  void sayCongrats(String name, int... values){
        var total =0;
        for (var value : values){
            total +=value;
        }
        var finalvalue = total / values.length;

        if (finalvalue >=75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }
}
