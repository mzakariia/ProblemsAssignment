import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class StringTask {

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String word = br.readLine().toLowerCase(Locale.ENGLISH);
            String result="";
            for(int i=0;i<word.length();i++){
                String currentLetter = word.charAt(i)+"";
                switch (currentLetter){
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "y":
                    case "u": break;
                    default: result+="."+currentLetter;break;
                }
            }
            System.out.println(result);
        }
    }
}
