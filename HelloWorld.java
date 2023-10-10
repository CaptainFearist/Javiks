public class HelloWorld {
    public static void main(String[] args) {
        char[] helloArray = {0x0048, 0x0065, 0x006c, 0x006c, 0x006f, 0x0020, 0x0077, 0x006f, 0x0072, 0x006c, 0x0064, 0x0021};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}