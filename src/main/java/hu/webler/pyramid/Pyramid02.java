package hu.webler.pyramid;

public class Pyramid02 {

    public static void main(String[] args) {

        drawPyramid(2, 5);
    }

    private static void drawPyramid(int height, int width) {
        for (int i = 0; i < height; i++) {
            int startRow = (i + 1) * width / height;
            for (int j = 0; j < startRow && j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
