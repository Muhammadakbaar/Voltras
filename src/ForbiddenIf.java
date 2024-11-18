public class ForbiddenIf {
    public static void main(String[] args) {
        System.out.println(ifForbidden(5, 4));
        System.out.println(ifForbidden(-4, -7));
        System.out.println(ifForbidden(2, 2));
    }

    public static String ifForbidden(int a, int b) {
        switch (Integer.compare(a, b)) {
            case -1:
                return a + " is less than " + b;
            case 1:
                return a + " is greater than " + b;
            default:
                return a + " is equal to " + b;
        }
    }
}
