/* Create a method with one parameter to display data below

#case 1

1
23
345
4567
56789
6789
789
89
9

#case 2

5
67
789
891011
910111213
10111213
111213
1213
13

*/



public class Solution1 {
  public static void main(String[] args) {
   printer(1);
   printer(5);
  }

  public static void printer(int initValue) {
    int n = 9, mid = initValue + 4, limit = initValue +1;

    for(int i = initValue; i < n+1+initValue; i++) {

      if(i < mid) {
        for(int j = i ; j < limit; j++) {
          System.out.print(j);
        }
        limit+=2;
      }
      else if(i >= mid) {
        int limit2 = limit;
        for(int j = i; j < limit2; j+=1) {
          System.out.print(j);
        }
        limit2-=1;
      }
      System.out.println();
    }
  }
}
