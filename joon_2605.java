import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class joon_2605 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        List<Integer> final_line = new ArrayList<>(); // ArrayList는 List인터페이스를 구현한 클래스임

        for(int studentNum = 1; studentNum <= n; studentNum++){
            int movecount = scn.nextInt();
            int insertIndex = final_line.size() - movecount;

            final_line.add(insertIndex, studentNum);
        }

        for (int student : final_line){
            System.out.print(student + " ");
        }
    }
}
