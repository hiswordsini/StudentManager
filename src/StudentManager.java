import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
/*
📌 요구사항
학생 정보를 HashMap에 저장 (<학생 이름, 점수> 형태)
점수 입력 시 0~100 사이 값만 허용 (잘못된 값 입력 시 예외 발생)
특정 학생의 점수를 조회하고, 전체 학생의 평균 점수를 출력
*/
        HashMap<String, Integer> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(("1. 학생 추가  2. 점수 조회  3. 평균 점수 출력  4. 종료"));
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("학생의 이름 입력:");
                String name = scanner.next();
                System.out.println("학생의 점수 입력:");
                int score = scanner.nextInt();

                try {
                    if (score < 0 || score > 100) {
                        throw new IllegalArgumentException("점수는 0~100 사이여야 합니다.");
                    }
                    students.put(name, score);
                } catch (Exception e) {
                    System.out.println("입력 오류: " + e.getMessage());
                }

            } else if (choice == 2) {
                System.out.println("학생 이름 입력: ");
                String name = scanner.next();
                if (students.containsKey(name)) {
                    System.out.println(name + "의 점수: " + students.get(name));
                } else {
                    System.out.println("해당 학생이 없습니다.");
                }
            } else if (choice == 3) {
                int sum = 0;
                for (int score : students.values()) {
                    sum += score;
                }
                double avg = students.size() > 0 ? (double) sum / students.size() : 0;
                System.out.println("전체 학생 평균 점수: " + avg);
            } else if (choice == 4) {
                System.out.println("프로그램 종료");
                break;
            }
        }
        scanner.close();
    }
    /*Testing Git Hub*/

    /*Testing in Local Repository*/
}

    /*Testing in Remote Repository */

