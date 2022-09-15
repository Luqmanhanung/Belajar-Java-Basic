public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("toni");
        sayHello("budi", "raharho");

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String Name){
        System.out.println("Hello " + Name);
    }

    static Void sayHello(String firstname, String Lastname){
        System.out.println("Hello " + firstname + " " + Lastname);
        return null;
    }
}
