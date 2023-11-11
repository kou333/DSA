import java.util.*;


//  RECURSIVE ONE 
public class  linearsearch{

  public static void main(String args[]) {
    // taking user input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements:");
    int N = sc.nextInt();
      
    System.out.println("Enter elements:");

    // storing elements in an array
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    // asking user for target element
    System.out.println("Enter target element:");
    int target = sc.nextInt();

    // using linear search to find element
    int index = Search(N, arr, target);

    // printing result
    System.out.println("The array is as follows:\n" + Arrays.toString(arr));

    if (index == -1) System.out.println(
      "Sorry, element not found"
    ); 
    else System.out.println("The element is present at the index " + index);
  }

  public static int Search(int N, int[] arr, int target) {
    // if the target is not present return
    if (N == 0) return -1;

    // if target is found return
    if (arr[N - 1] == target) return N; 
    else return Search(N - 1, arr, target);
  }
}
