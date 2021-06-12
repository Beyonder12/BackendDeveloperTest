import java.util.Arrays;

/*
Create a method to find the lowest cost from edge to center
move vertically and horizonatally

case #1

7 3 4
8 6 9
1 2 5

#Answer 1
2 + 6 = 8 thats the minimum.


case #2

9 3 5 4 8
5 1 4 2 7
6 5 7 9 1

#Answer 2
???

 */

// Assuming its accumulation vertically and horizontally every number
// along the path from edge to center
public class Solution2 {
  public static void main(String[] args) {
    int [][] arr = new int[][] {{7, 3, 4}, {8, 6, 9},{1, 2, 5}};
    int [][] arr1 = {{9, 3, 5, 4, 8}, {5, 1, 4, 2, 7},{6, 5, 7, 9, 1}};
    System.out.println("The case#1 return is " + lowestCost(arr) + "\n");
    System.out.println("The case#2 return is " + lowestCost(arr1) + "\n");
  }

  public static int lowestCost(int[][] arr) {

    int pi = (arr.length -1) / 2,//1
    pj = (arr[0].length -1) / 2,//1
    sumLeft = 0,
    sumUp = 0,
    sumRight = 0,
    sumDown = 0;

    while(pj >= 0) {
      sumLeft += arr[pi][pj];
      sumRight += arr[pi][arr[0].length - 1 - pj];
      pj--;
    }
    int min1 = Math.min(sumLeft, sumRight);
    // System.out.println("pj is "+ pj);
    pj = (arr[0].length -1) / 2;//1
    while(pi >= 0) {
      sumUp += arr[pi][pj];
      sumDown += arr[arr.length - 1 - pi][pj];
      pi--;
    }
    int min2 = Math.min(sumUp, sumDown);



    System.out.println("\n" + "sumLeft is " + sumLeft);
    System.out.println("sumUp is " + sumUp);
    System.out.println("sumRight is " + sumRight);
    System.out.println("sumDown is " + sumDown);
    System.out.println("min1 is " + min1 + " min2 is " + min2);

    return Math.min(min1, min2);
  }

}
