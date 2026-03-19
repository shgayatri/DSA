package Sliding_Window;

public class negative {
    public static void main(String[] args) {

        int arr[] = {-3,-4,3,2,1,-5,7,-1,3,2};
        int k = 4;
        int n = arr.length;

        int ans[] = new int[n - k + 1];
        int p = -1;   // index of first negative

        // 1️⃣ First window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                p = i;
                break;
            }
        }

        ans[0] = (p != -1) ? arr[p] : 0;

        // 2️⃣ Remaining windows
        int i = 1, j = k;
        while (j < n) {

            // agar purana negative window ke andar hai
            if (p >= i) {
                ans[i] = arr[p];
            }
            // nahi hai to new window me dhundo
            else {
                p = -1;
                for (int x = i; x <= j; x++) {
                    if (arr[x] < 0) {
                        p = x;
                        break;
                    }
                }
                ans[i] = (p != -1) ? arr[p] : 0;
            }

            i++;
            j++;
        }

        // print answer
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
