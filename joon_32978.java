import java.util.Scanner;
import java.util.HashMap;

public class joon_32978 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>(); // 해시 맵 자료구조 생성

        int n = scn.nextInt();
        scn.nextLine();

        String[] all_material = scn.nextLine().split(" ");

        for (String Material : all_material){ // 전체재료 목록을 해시맵에 입력
            map.put(Material, 1);
        }

        String[] used_material = scn.nextLine().split(" "); // 사용한 재료 목록을 배열로 받음

        for (String material : used_material){ // 사용한 재료의 개수를 0 으로 변경
            map.put(material, 0);
        }

        for (String material : map.keySet()){ // 재료의 개수가 1 인곳을 찾아 키 출력
            if (map.get(material) == 1){
                System.out.println(material);
                break;
            }
        }
    }
}