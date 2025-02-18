import java.util.Scanner;

class Country {
    int id;
    int gold;
    int silver;
    int bronze;

    public Country(int id, int gold, int silver, int bronze) {
        this.id = id;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int n = sc.nextInt();  // 국가의 수
        int k = sc.nextInt();  // 등수를 알고 싶은 국가

        Country[] countries = new Country[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();
            countries[i] = new Country(id, gold, silver, bronze);
        }

        // 선택 정렬
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (isBetter(countries[j], countries[maxIdx])) {
                    maxIdx = j;
                }
            }
            // Swap
            Country temp = countries[i];
            countries[i] = countries[maxIdx];
            countries[maxIdx] = temp;
        }

        // 등수 계산
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && !isSameRank(countries[i], countries[i - 1])) {
                rank = i + 1;
            }
            if (countries[i].id == k) {
                System.out.println(rank);
                break;
            }
        }
        sc.close();
    }

    // 첫 번째 국가가 두 번째 국가보다 더 높은 순위인지 판별
    private static boolean isBetter(Country c1, Country c2) {
        if (c1.gold != c2.gold) return c1.gold > c2.gold;
        if (c1.silver != c2.silver) return c1.silver > c2.silver;
        return c1.bronze > c2.bronze;
    }

    // 두 국가가 같은 순위인지 판별
    private static boolean isSameRank(Country c1, Country c2) {
        return c1.gold == c2.gold && c1.silver == c2.silver && c1.bronze == c2.bronze;
    }
}

