package beforeOOP.start.cycles;

public class for_etc {
    public static void main(String[] args) {

        int i = 0; // we can initiate indicator before a cycle
        for ( ; i < 5; i ++){
            System.out.println("i = " + i);
        }

        //also we can do increment after condition
        int i2 = 5; //if we initiate here we can use this variable after the cycle
        for ( ; i2 < 10; ){
            System.out.println("i2 = " + i2);
            i2 ++;
        }

        System.out.println("Final i = " + i + " final i2 = " + i2);

//        for ( ; ; ){
//            System.out.println("I'm the ENDLESS cycle");
//        }

        for(int in = 0, j = 1; in < 2 && j < 3; in++,j++){
            System.out.println("Strange cycle");
        }

        //we can break cycle in the middle if we need
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Breaking cycle in the middle");
        int y = 10;
        int w = 20;
        while (y < w){
            y++;
            System.out.println("y = "+ y);
            if (y == 15)
                break;
        }
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Continue in the middle");

        int r = 1;
        int u = 10;
        while (r < u){

            System.out.println("y = "+ r);

            r++;
            if (r == 5)
                System.out.println("Continue is working");
            continue;
        }
    }
}
