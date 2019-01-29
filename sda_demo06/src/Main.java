public class Main {
    public static void main (String[] args)
    {
        // instance of Integer type
        Test <Integer> obj01 = new Test<Integer>(15);

        // instance of String type
        Test<String> obj02 = new Test<String>("GeeksForGeeks","What");

        // instance of Double type
        Test<Double> obj03 = new Test<Double>(4.6,5.7,9.2,15.5,16.7);
    }
}
