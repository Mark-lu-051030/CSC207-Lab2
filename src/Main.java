import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        largeSumTest();
    }

    public static void largeSumTest() {

        // You put an L at the end to indicate it is a long.
        // try removing the L and you'll see that you get an error
        // saying "Integer number too large".
        // Note: You can use _ to help make it easier to
        //       read large numbers, as is done below.
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
        }
        long ExpectingSum = 500_000_500_000L;
        long ActualSum = DataTypes.sum(lst);
        System.out.println("Expecting sum = " + ExpectingSum);
        System.out.println("Actual sum = " + ActualSum);
        System.out.println(ActualSum == ExpectingSum);
        System.out.println("finished");
    }
}