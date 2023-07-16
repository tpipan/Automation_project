package course_06;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTestClass {

    static double totalSum = 0;
    double result = 1;
    Calculator calculator = new Calculator();

    public void resetResult() {
        result = 0;
    }

    @After
    public void calculateTotalSum() {
        totalSum += result;
    }

    @AfterClass()
    public static void printTotalSum() {
        System.out.println("Total sum is: " + totalSum);
    }

    @Test()
    public void testMultiplyForZero() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, 1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testAddition() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, 25, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(125, result, 0);
    }
// I added the testAdditionOfNegativeNumbers,testAdditionOfNegativeAndPositiveNumbers, testAdditionOfRationalNumbers and testAdditionOfRationalNumbers to the "+" operator
    @Test()
    public void testAdditionOfNegativeNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-3, -24, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(-27, result, 0);
    }

    @Test()
    public void testAdditionOfNegativeAndPositiveNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-3, 6, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(3, result, 0);
    }

    @Test()
    public void testAdditionOfRationalNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(7.2, 10.6, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(17.8, result, 0);
    }

    @Test()
    public void testSubtraction() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(20, 1, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(19, result, 0);
    }
//     I added the testSubtractionOfNegativeAndPositiveNumbers, estSubtractionOfTwoNegativeNumber to the "-" operator

    @Test()
    public void testSubtractionOfNegativeAndPositiveNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-3, 20, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(-23, result, 0);
    }

    @Test()
    public void testSubtractionOfTwoNegativeNumber() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-5, -10, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(5, result, 0);
    }

    @Test()
    public void testMultiply() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(11, 12, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(132, result, 0);
    }
// I added the testMultiplyNegativeNumbers, testMultiplyRationalNumbers to the "*" operator

    @Test()
    public void testMultiplyNegativeNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-10, -12, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(120, result, 0);
    }

    @Test()
    public void testMultiplyRationalNumbers() {
        System.out.println("Initial result:" + result);
        result = calculator.compute(5.6, 12.3, "*");
        System.out.println("Result after compute:" + result);
        Assert.assertEquals(68.88,result,0);
    }


    @Test()
    public void testDivide() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(33, 3, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(11, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testDivideByZeroWithFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

//   I added the testDivideByNegativeNumbers and the testDivideNumberByItself to the  "/" operator

    @Test()
    public void testDivideByNegativeNumbers() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-10, -2, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(5, result, 0);
    }

    @Test()
    public void testDivideNumberByItself() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(9, 9, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(1, result, 0);
    }

//Unsupported Operator

    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedOperatorWithoutFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because the calculator cannot handle this operator");
        result = calculator.compute(30, 0, "~");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(1, result, 0);
    }

    @Test()
    public void testUnsupportedOperatorWithFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because the calculator cannot handle this operator");
        result = calculator.compute(30, 0, "~");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(1, result, 0);
    }
}
