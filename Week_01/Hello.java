public class Hello {
    private Integer field1 = 0;
    private String field2 = "2";


    public static void main(String[] args) {
        Hello hello = new Hello();
        int first = 0;
        int second = 2;
        int third = first + second;
        int fourth = third + hello.field1;
        System.out.println(hello.field2 + "_" + third + "_" + fourth);
    }
}
