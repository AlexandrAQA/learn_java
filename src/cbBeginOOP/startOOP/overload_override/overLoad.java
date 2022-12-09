package cbBeginOOP.startOOP.overload_override;

public class overLoad {
    public static void main(String[] args) {

        print();
        print("Simple Magic");
        print(3);
        print("Simple Magic", 4);
        print(5, "Another Magic");
    }
    public static void print(){
        System.out.println("hey, I'm Just a simple print method");
    }
    public static void print(String str){
        System.out.println("I'm overloaded method print with 1 param: " + str);
    }
    public static void print(Integer integer){
        System.out.println("I'm overloaded method print with 1 param but another type: " + integer);
    }
    public static void print(String str, Integer in){
        System.out.println("I'm overloaded method print with 2 params: "
                + str + "\n" + in);
    }
    public static void print(Integer in, String string){
        System.out.println("I'm overloaded method print with 2 params but swapped: "
                + string + "\n" + in);
    }
}
