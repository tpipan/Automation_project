package course_06;

public class TestACustomException {

    public static void main(String[] args) throws MyCustomException {
        throw new MyCustomException("Friendly exception message");
    }
}
