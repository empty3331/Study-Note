/*** 백준 10819번 : 차이를 최대로  ***/
/* - 문제 : 
  N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
  |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
   - 입력 : 
  첫째 줄에 N (3 ≤ N ≤ 8)이 주어진다. 둘째 줄에는 배열 A에 들어있는 정수가 주어진다. 배열에 들어있는 정수는 -100보다 크거나 같고, 100보다 작거나 같다.
  - 출력 : 
  첫째 줄에 배열에 들어있는 수의 순서를 적절히 바꿔서 얻을 수 있는 식의 최댓값을 출력한다. */

  import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.util.Arrays;
   
  public class Baekjoon10819 {
    public static void main(String[] args) throws Exception{

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      String[] data = br.readLine().split(" ");
      int[] arr = new int[N];
      for(int i=0; i<N; i++)
        arr[i] = Integer.parseInt(data[i]);
      Arrays.sort(arr);
      int ans = 0;
      int NN = N;
      if(N%2 == 1){
        NN--;
        ans = arr[N/2] - arr[N/2-1] > arr[N/2+1] - arr[N/2]? arr[N/2] - arr[N/2-1] : arr[N/2+1] - arr[N/2];
      }
      for(int i=0; i<NN-1; i++){
        if(i%2 == 0)
          ans += (arr[N-(i/2)-1] - arr[N/2-(i/2)-1]);
        else
          ans += (arr[N-(i/2)-1] - arr[N/2-(i/2)-2]);
      }
      System.out.println(ans);
    }
}