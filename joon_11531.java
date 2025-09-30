import java.io.*;
import java.util.*;

public class joon_11531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner를 쓰는 것 보다 버퍼 처리 시간이 빨라 버퍼스트림을 사용하는것이 빠름
        String Line; // 읽은 라인

        Map<String, int[]> map = new HashMap<>(); // 해시맵 생성

        int cnt = 0; // 맞은 문제 수
        int total = 0; // 패널티 총 합

        while(!(Line = br.readLine()).equals("-1")){
            String []parts = Line.split(" ");
            int time = Integer.parseInt(parts[0]);
            String team = parts[1];
            String result = parts[2];

            map.putIfAbsent(team,new int[3]); // 해당하는 키가 있으면 기존값 반환 없으면 값 넣고 널 번환
            int [] info = map.get(team); // [맞춘 시간, 틀린 횟수, 맞춤상태(1:right, 2:wrong)]
            // map.get(team)을 통해 반환된 int[] info 배열은 실제로 맵에 저장된 배열의 참조임 따라서 다시 map.put(team, info) 안해줘도 된다.
            if (result.equals("right") && info[2] == 0){ // 맞았을 경우
                info[0] = time;
                info[2] = 1; // 맞춤상태 1로 표시
                cnt++;
                total += info[1] * 20; // 틀린 횟수만큼 *20해서 더함
                total += info[0];
            }
            else if (result.equals("wrong") && info[2] == 0){ // 틀렸을 경우
                info[1] += 1; // 단순히 틀린 횟수를 더해줌
            }
        }

        System.out.println(cnt + " " + total);
    }
}