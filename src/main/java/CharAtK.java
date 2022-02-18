/*
import java.util.*;

public class CharAtK {
 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] str = new String[3];
        for(int i = 0; str.length>1;){

        }
        Scanner scan = new Scanner(System.in);
        //First N line:   (number of strings in the list)
        int n = Integer.valueOf(scan.nextLine());
        //Next  N lines: Si
        ArrayList nLines = new ArrayList();
        for(int i=0; i<n;i++){
            String si = scan.nextLine();
            nLines.add(si);
        }
        //Next line:  Q (number of questions)
        int q = Integer.valueOf(scan.nextLine());
        //Next Q lines: Three space-separated integers,  L, R, and K
        ArrayList qLines = new ArrayList();
        for(int j=0;j<q;j++){
            qLines.add( scan.nextLine());
        }
 
        for(String ss:qLines){
            if (!ss.equals("")) {
                String[] lrk = ss.split(" ");
                int l = Integer.valueOf(lrk[0]);
                int r = Integer.valueOf(lrk[1]);
                int k = Integer.valueOf(lrk[2]);
 
                String substring = concatAlphs(l, r, nLines);
                System.out.println(substring.toCharArray()[k]);
            }
        }
 
    }
 
    private static String concatAlphs(int x, int y, ArrayList alph) {
        List alphfiltered = alph.subList(x, y + 1);
        alphfiltered.stream().sorted().forEach();
        alphfiltered.sort((o1, o2) -> o1.c);//sort by alphabeth
        StringBuffer sb = new StringBuffer();
        alphfiltered.forEach(s -> sb.append(s));
        char tempArray[] = sb.toString().toCharArray();
        Arrays.sort(tempArray);//sort letter by letter
        return new String(tempArray);
    }
 
}*/
