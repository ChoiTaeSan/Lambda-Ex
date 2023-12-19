import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args) {

        FunctionalInterface fi;

// 기본 람다식 사용
//        fi = new FunctionalInterface() {
//            @Override
//            public int method(int x, int y) {
//                return x+y;
//            }
//        };
//        System.out.println(fi.method(2, 3));
//
//        fi = (x, y) -> {return x+y;};
//        System.out.println(fi.method(3, 4));
//
//        fi = (x, y) -> x+y;
//        System.out.println(fi.method(4, 5));

        //메소드 참조 1
//        fi = new FunctionalInterface() {
//            @Override
//            public int method(int x, int y) {
//                return Math.max(x, y);
//            }
//        };
//        System.out.println(fi.method(1,10));
//
//        fi = (x, y) -> Math.max(x, y);
//        System.out.println(fi.method(1,2));
//
//        // 익명구현객체를 Math 클래스가 가지고 있는 max메소드를 참조하여 만드세요.
//        fi = Math :: max;
//        System.out.println(fi.method(2,1));

        // 메소드 참조 2
//        IntBinaryOperator operator;
//
//        operator = (x, y) -> TestClass.staticMethod(x, y);
//        System.out.println(operator.applyAsInt(1,2));
//
//        operator = TestClass :: staticMethod;
//        System.out.println(operator.applyAsInt(1,2));
//
//        TestClass testClass = new TestClass();
//        operator = testClass :: instanceMethod;
//        System.out.println(operator.applyAsInt(1,2));

        //메소드 참조 3
//        ToIntBiFunction<String, String> function;
//
//        function = (a, b) -> a.compareToIgnoreCase(b);
//        strPrint(function.applyAsInt("abc","abc"));
//
//        function = String :: compareToIgnoreCase;
//        strPrint(function.applyAsInt("abc","abc"));


        //생성자 참조
        fi = new FunctionalInterface() {
            @Override
            public TestClass method(String x, int y) {
                return new TestClass(x, y);
            }
        };

        fi = (x, y) -> new TestClass(x, y);

        fi = TestClass :: new;
    }

    public static void strPrint(int num){
        if(num < 0)
            System.out.println("사전순.");
        else if (num == 0)
            System.out.println("동일한 문자열");
        else
            System.out.println("역순");
    }
}