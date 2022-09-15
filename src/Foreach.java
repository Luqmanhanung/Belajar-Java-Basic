public class Foreach {
    public static void main(String[] args) {
        String[] names = {
                "luqman" ,  "hanung" , "asidiq",
                "arsya" , "rizqi" , "suwarno"
        };

        //tanpa foreach
        for (var i = 0; i <names.length; i++){
            System.out.println(names[i]);
        }

        //foreach
        for(var name: names){
            System.out.println(name);
        }
    }
}
