import java.lang.Math;
import java.util.*;

class question5 {
  public static void main(String args[]){

    Scanner input = new Scanner(System.in); // 輸入工具
    int times = Integer.parseInt(input.nextLine()); // 輸入原始字串 轉成整數

    for(int i = 0 ; i < times ; i++ ){ // Loop 4 executing..
      String[] myString = input.nextLine().split(" "); // 分裂資料

      int height_1  = Integer.parseInt(myString[0]); // 第一個身高
      int height_2  = Integer.parseInt(myString[1]); // 第二個身高

      System.out.println(Math.abs(height_1 - height_2)); // 結果（記得使用絕對值
    }

  }
}