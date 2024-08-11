public class ErrorDebbuging {
            public static void main(String[] args) {
                        int a = 10;
                        int b = 2;
                        int c = a / b;
                        System.out.println(c);
                        errorDebbugingExample();
            }

            public static void errorDebbugingExample() {
                        int a = 10;
                        int b = 0;
                        int c = a / b;
                        System.out.println(c);
            }
}
