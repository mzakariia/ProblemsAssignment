import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (br.ready()){
            int lines =  Integer.parseInt(br.readLine());
            for(int i=0;i<lines;i++){
                String word = br.readLine();
                if(word.length()>10){
                    String result= word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1);
                    System.out.println(result);
                }
                else System.out.println(word);
            }
        }
    }
}
