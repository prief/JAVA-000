
public class Hello {
    public static void main(String[] args) {
        int total = 10;
        float result;
        for (int i = 0; i < total; i++) {
            result =  (i + 1 ) * total - 1 / total;
            if(result > 60){
                System.out.println(i);
            }
        }
    }
}