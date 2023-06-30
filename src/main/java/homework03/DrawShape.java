package homework03;

public class DrawShape {

        int n;
    public static void main(String[] args){
        System.out.println(Integer.parseInt(args[0]));

        if (args.length == 1) {
            drawShapeCorners(Integer.parseInt(args[0]));
        } else if (args.length == 2) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
            drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            System.out.println("");
        }


    }

    private static void drawShapeCorners(int size) {
        drawShapeCorners(size, size);
    }

    private static void drawShapeCorners(int width, int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                if (i == 1 && j == 1 ||  i == 1 && j == width ||  i == height && j == 1 || i == height && j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
