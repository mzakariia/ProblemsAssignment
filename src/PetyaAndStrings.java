import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class PetyaAndStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String word1 = br.readLine().toLowerCase(Locale.ENGLISH);
            String word2 = br.readLine().toLowerCase(Locale.ENGLISH);
            int score = word1.compareTo(word2);
            int result = 0;
            if(score>0) result = 1;
            if(score<0) result=-1;
            System.out.println(result);
        }
    }
}
