package hu.webler.pyramid;

public class Pyramid {

    public static void main(String[] args) {
        drawPyramid(5, 9);
    }

    public static void drawPyramid(int height, int width) {
        for (int i = 0; i < height; i++) {
            if (i == 0) {
                System.out.println("* ");
                continue;
            }

            int currentWidth = i * width / height;
            for (int j = 0; j < currentWidth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
