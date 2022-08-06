import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {


    public static void main(String[] args) throws IOException{

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            int weight = Integer.parseInt(br.readLine());
            if(weight%2==0 && weight>2)System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
    }
}
