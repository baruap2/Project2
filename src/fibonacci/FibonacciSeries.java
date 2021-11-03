package fibonacci;

public class FibonacciSeries {
    public static void main(String []args){
        int prev=0;
        int next=1;

        for(int i=0; i<15; i++){
            System.out.println(prev);
            prev = next - prev;
            next = next + prev;
        }

        //f = prev + next
    }

}
