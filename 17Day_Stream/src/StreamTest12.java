import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest12 {
	
    static int num =0;
	public static void main(String[] args) {
		
        IntStream st = Arrays.stream(new int[] {10,9,8,4,2,36,14,4,64,5,6,7,100});
        
        //System.out.println(st.count());
        //System.out.println(st.max());
        //System.out.println(st.min());
        //System.out.println(st.average());
        
       // System.out.println(st.min().getAsInt());
        //Long c = st.count();
        //OptionalInt c2=st.max();
       // System.out.println(c2.getAsInt());
        
        //System.out.println(st.average().getAsDouble());
        //System.out.println(st.sum());
        //System.out.println(st.findFirst().getAsInt());
        
        //1.짝수번째의 합 출력
        
         long sum = st.filter(n->{
        	 num++;
        	 boolean result = false;
        	 if(num%2==0) {
                   result =true;
        	 }
        	 return result;
          })
          .sum();
         System.out.println("총합:"+sum);
    

        //2. 2의 배수의 합 출력
        
	    IntStream st2 = Arrays.stream(new int[] {10,9,8,4,2,36,14,4,64,5,6,7,100});
	    long sum2 = st2.filter(n->n%2==0).sum();
	    System.out.println("2의배수의총합:"+sum2);
}
}
