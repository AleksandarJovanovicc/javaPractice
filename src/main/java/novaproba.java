
import java.util.LinkedHashMap;
import java.util.Map;

public class novaproba {
    public static void main(String[] args) {

        int[] niz = {-1, 7, 2, 4, 5};
        int a = solution2(niz);
        System.out.println(a);
    }
    public static int solution(int[] A) {
        int solutionNumber = A.length + 1;

        for (int i = 1; i <= A.length; i ++){
            boolean notPresent = true;
            for (int j = 0; j < A.length; j++){
                if (i == A[j]){
                    notPresent = false;
                    break;
                }
            }
            if (notPresent) {
                solutionNumber = i;
                break;
            }
        }
        return solutionNumber;
    }

    public static int solution2(int[] A){
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        int n = A.length;

        for (int i = 0; i < n; i++)
        {
            if (A[i] > 0)
            {
                mp.put(A[i], mp.get(A[i]) == null ? 1 : mp.get(A[i]) + 1);
            }
        }
        int index = 1;

        while (true)
        {
            if (!mp.containsKey(index))
            {
                return index;
            }
            index++;
        }
    }
    }
