public class TestClass {

    private String name;
    private int num;

    public TestClass(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public static int staticMethod(int x, int y){
        return x+y;
    }

    public int instanceMethod(int x, int y){
        return x+y;
    }
}
