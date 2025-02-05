public class MathUtils {
    static public int add(int a, int b) {
        return a + b;
    }

    static public  void main(String[] args) {


	    int sum = MathUtils.add(5, 3); // No object needed!
        System.out.println(sum); // Output: 8
    }
}
