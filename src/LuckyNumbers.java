import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] luckyNumbers = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        boolean almostLucky =false;
        while(br.ready()){
            int number = Integer.parseInt(br.readLine());
            for(int i=0;i<luckyNumbers.length;i++){
                if(number%luckyNumbers[i]==0){
                    almostLucky=true;
                    break;
                }
            }
            if(almostLucky) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
