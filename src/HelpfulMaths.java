import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpfulMaths {

    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String input =  br.readLine();
            String ones="";
            String twos="";
            String threes="";
            for(int i=0;i<input.length();i++){
                String currentChar = input.charAt(i)+"";
                if(currentChar.equals("1")){
                    if(ones.equals("")) ones+=1;
                    else ones+="+"+1;
                }
                if(currentChar.equals("2")){
                    if(twos.equals("")) twos+=2;
                    else twos+="+"+2;
                }
                if(currentChar.equals("3")){
                    if(threes.equals("")) threes+=3;
                    else threes+="+"+3;
                }
            }
            String result="";
            if(!ones.equals("")) result+=ones;
            if(!twos.equals("")){
                if(result.equals("")) result+=twos;
                else result+="+"+twos;
            }
            if(!threes.equals("")){
                if(result.equals("")) result+=threes;
                else result+="+"+threes;
            }
            System.out.println(result);
        }
    }
}
