package course03_04;

public class Shapes {
    public static void main(String[] args) {
        Square square = new Square(Double.parseDouble(args[0]));
        square.setSquareSide(Double.parseDouble(args[0]));
        System.out.println(square.getArea());

        for (String argument:args){
            Square currentSquare = new Square();
            currentSquare.setSquareSide(Double.parseDouble(argument));
            System.out.println(currentSquare.getArea());



        }

    }


}


