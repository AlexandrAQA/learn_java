package exceptions.errors;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        try {
            main.process();
            Thread.sleep(2000);
        }catch (StackOverflowError stackOverflowError){
            System.out.println("Error is caught: " + stackOverflowError);

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread.sleep() is crashed");
        }
        System.out.println("Finish");
    }
    public void process(){
        //System.out.println("---process---");
        process();
    }
}
