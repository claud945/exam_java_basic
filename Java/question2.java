import java.util.*;
class question2{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); // 輸入工具
    int times = input.nextInt(); // 輸入次數
    int total = 0;
    for(int i = 0 ; i < times ; i++){
      total = total + input.nextInt();
    }
    float answer = total/times;
    System.out.printf("%.3f",answer);
  }
}