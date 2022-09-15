public class Scope {
    public static void main(String[] args) {
        sayHello("tono");
        sayHello("");

    }

    static void sayHello(String name){
        String Hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "Hi " + name;
        }

        System.out.println(Hello);
        System.out.println();
    }
}
