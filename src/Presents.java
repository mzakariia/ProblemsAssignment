import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Presents {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            int numOfFriends = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] gaveTo = new int[numOfFriends];
            for(int i=0;i<numOfFriends;i++){
                gaveTo[i]=Integer.parseInt(st.nextToken());
            }
            int[] givenBy = new int[numOfFriends];
            for(int i=0;i<gaveTo.length;i++){
                givenBy[gaveTo[i]-1]=i+1;
            }
            String result="";
            for(int i=0;i<givenBy.length-1;i++){
                result+=givenBy[i]+" ";
            }
            result+=givenBy[givenBy.length-1];
            System.out.println(result);
        }
    }
}
