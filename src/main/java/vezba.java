

public class vezba {
    public static void main(String[] args) {

    }
    static int solution2 ( int[] A){
                int maxcount = 0;
                int element_having_max_freq = 0;
                for (int i = 0; i < A.length; i++) {
                    int count = 0;
                    for (int j = 0; j < A.length; j++) {
                        if (A[i] == A[j]) {
                            count++;
                        }
                    }
                    if (count > maxcount) {
                        maxcount = count;
                        element_having_max_freq = A[i];
                    }
                }
                return element_having_max_freq;
            }

     static int[] solution3(String[] S) {
        int [] answer = {};
        int n = S[0].length();
        for (int i = 0; i < S.length; i++){
            for (int j = i + 1; j < (S.length); j++){
                for (int t = 0; t < n; t++){
                    if (S[i].charAt(t)==S[j].charAt(t)){
                        int [] answer2 = new int[3];
                        answer2[0] = i;
                        answer2[1] = j;
                        answer2[2] = t;
                        return answer2;
                    }
                }
            }
        }
        return answer;
    }

        }



