/*** ���� 10819�� : ���̸� �ִ��  ***/
/* - ���� : 
  N���� ������ �̷���� �迭 A�� �־�����. �̶�, �迭�� ����ִ� ������ ������ ������ �ٲ㼭 ���� ���� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
  |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
   - �Է� : 
  ù° �ٿ� N (3 �� N �� 8)�� �־�����. ��° �ٿ��� �迭 A�� ����ִ� ������ �־�����. �迭�� ����ִ� ������ -100���� ũ�ų� ����, 100���� �۰ų� ����.
  - ��� : 
  ù° �ٿ� �迭�� ����ִ� ���� ������ ������ �ٲ㼭 ���� �� �ִ� ���� �ִ��� ����Ѵ�. */

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