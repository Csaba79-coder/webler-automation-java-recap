package hu.webler;

import hu.webler.practice.MathExample00;
import hu.webler.pyramid.Pyramid;

public class WeblerApp {

    public static void main(String[] args) {

        Pyramid.drawPyramid(6, 10);

        System.out.println("\n------------\n");

        MathExample00 mathExample = new MathExample00();
        int sum = mathExample.sum();
        System.out.println(sum);
    }
}
