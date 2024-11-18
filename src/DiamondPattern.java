public class DiamondPattern {
    private int diagonal;

    public DiamondPattern(int diagonal) {
        this.diagonal = diagonal;
    }
    public void drawDiamond() {
        int n = diagonal;
        for (int i = n / 2; i >= -n / 2; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i * 2) && i >= 0; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= -i && i < 0; k++) {
                System.out.print(" ");
            }
            for (int j = (n / 2) * 2 + 2 * i; j >= -(n % 2 - 1) && i < 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondPattern a = new DiamondPattern(6);
        a.drawDiamond();
    }
}