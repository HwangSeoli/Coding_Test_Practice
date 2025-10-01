import java.util.Scanner;
import java.util.ArrayList;

public class joon_12605 {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        scn.nextLine();

        ArrayList<String> sen = new ArrayList<>();

        for(int x = 0; x < n; x++){
            String line = scn.nextLine();
            sen.add(line);
        }

        for (int i = 0; i < n; i++){
            String []word = sen.get(i).split(" ");
            System.out.print("Case #" + (i+1) + ": ");
            // 배열의 마지막 인덱스부터 0까지 역순으로 출력합니다.
            for(int x = word.length - 1; x >= 0; x--){
                System.out.print(word[x]);
                if (x > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scn.close();
    }
}