package hu.webler.pyramid;

public class Pyramid03 {

    public static void main(String[] args) {

        drawPyramid(5, 12);
    }

    private static void drawPyramid(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i * width / height + 1 && j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
