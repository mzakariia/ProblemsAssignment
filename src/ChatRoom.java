import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ChatRoom {

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String text = br.readLine().toLowerCase(Locale.ENGLISH);
            String filtered ="";
            for(int i=0;i<text.length();i++){
                String currentChar= text.charAt(i)+"";
                switch (currentChar){
                    case "h":{
                        if(filtered.length()==0) filtered+="h";
                        break;
                    }
                    case "e":{
                        if(filtered.length()==1) filtered+="e";
                        break;
                    }
                    case "l":{
                        if(filtered.length()==2 || filtered.length()==3) filtered+="l";
                        break;
                    }
                    case "o":{
                        if(filtered.length()==4) filtered+="o";
                        break;
                    }
                    default: break;
                }
            }
            if(filtered.equals("hello")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
