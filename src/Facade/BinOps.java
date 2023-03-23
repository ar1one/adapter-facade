package Facade;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 + b1);
    }

    public String mult(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a1 * b1);
    }
}
