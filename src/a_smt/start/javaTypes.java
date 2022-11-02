package a_smt.start;

public class javaTypes {
    public static void main(String[] args) {
        byte b = 120;
        Byte byte1;
        String str = "100";
        byte1 = Byte.valueOf(str); //valueOF takes value from string and turn into Byte
        System.out.println(byte1); //100 value from str

        byte miniByte = byte1;
        System.out.println(miniByte); //100

        float fl = 12.1111f;
        System.out.println("float fl = " + fl);
        int in = (int)fl;
        System.out.println("int in = " + in);

        System.out.println("======================================");
        int a = 10;
        int c = 15;
        System.out.println("a + c = " + a + c); //1015
        System.out.println("a + c = " + (a + c)); //25

        int d = 5;
        System.out.println("d = " + d);
        d +=5;
        System.out.println("d after +=5 => " + d);
        d /=5;
        System.out.println("d after /=5 => " + d);
        d *=5;
        System.out.println("d after *=5 => " + d);

        System.out.println("d = " + ++d);
        System.out.println("d = " + d++);
        System.out.println("d = " + d);
        System.out.println("=================================== ");


        int k = 10;
        int l = 5;
        int m = ++k - l--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("d = " + m);
        boolean b2 = d == l;
        boolean b3 = d != l;

        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println("=========> ternary operator <=========================");
        int n = l > m ? 100 : 200;
        System.out.println("n = " + n);

        Integer nu = l < m ? null : 300;
        System.out.println("nu = " + nu);

        System.out.println("=========> instanceOF <=========================");
        Integer integ = 1234;
        boolean bull = integ instanceof Integer;
        System.out.println("bull = " + bull);

    }
}
