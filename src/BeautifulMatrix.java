import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulMatrix {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            String[] row1 = br.readLine().split(" ");
            String[] row2 = br.readLine().split(" ");
            String[] row3 = br.readLine().split(" ");
            String[] row4 = br.readLine().split(" ");
            String[] row5 = br.readLine().split(" ");
            int oneI=0;
            int oneJ=0;
            boolean found=false;
            for(int i=0;i<row1.length;i++){
                if(row1[i].equals("1")){
                    oneI=1;
                    oneJ=i+1;
                    found=true;
                }
            }
            if(!found){
                for(int i=0;i<row2.length;i++){
                    if(row2[i].equals("1")){
                        oneI=2;
                        oneJ=i+1;
                        found=true;
                    }
                }
            }
            if(!found){
                for(int i=0;i<row3.length;i++){
                    if(row3[i].equals("1")){
                        oneI=3;
                        oneJ=i+1;
                        found=true;
                    }
                }
            }
            if(!found){
                for(int i=0;i<row4.length;i++){
                    if(row4[i].equals("1")){
                        oneI=4;
                        oneJ=i+1;
                        found=true;
                    }
                }
            }
            if(!found){
                for(int i=0;i<row5.length;i++){
                    if(row5[i].equals("1")){
                        oneI=5;
                        oneJ=i+1;
                        found=true;
                    }
                }
            }
            int iDiff = 3 - oneI;
            int jDiff = 3 - oneJ;
            if(iDiff<0) iDiff= iDiff*(-1);
            if(jDiff<0) jDiff = jDiff*(-1);
            System.out.println(iDiff+jDiff);
        }
    }
}
