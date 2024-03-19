public class FibonacciSeries {
    public static void main(String[] args) {
        int initialValue = 0;
        int finalValue = 1;
        int series;
        System.out.print(initialValue + " "+finalValue+" ");
        for(int i = 0 ; i<10 ; i++ ){

            series = initialValue + finalValue;

            initialValue = finalValue;
            finalValue = series;
            System.out.print(series+" ");



        }

    }
}
// fibonacci => 0,1,1,2,3,5