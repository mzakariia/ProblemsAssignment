import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Twins {

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            int numOfCoins = Integer.parseInt(br.readLine());
            ArrayList<Integer> coins = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int sum =0;
            while(st.hasMoreTokens()){
                int coinVal =Integer.parseInt(st.nextToken());
                sum+=coinVal;
                coins.add(coinVal);
            }
            int midpoint = sum/2;
            int myCoins =0;
            int myCoinsNum = 0;
            while(myCoins<=midpoint){
             int largest =0;
             for(Integer i : coins){
                 if(i>largest) largest = i;
             }
             myCoins+=largest;
             myCoinsNum++;
             coins.remove((Integer) largest);
            }
            System.out.println(myCoinsNum);
        }
    }
}
