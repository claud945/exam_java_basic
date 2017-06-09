import java.util.*;
class question4{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); // 輸入工具
    int times = Integer.parseInt(input.nextLine());
    for(int i = 0 ; i < times ; i++){
    String data = input.nextLine();
    String[] numbers = data.split(" ");
    int total = 0;
    for(String x : numbers){
      total = total + Integer.parseInt(x);
    }
    float answer = total/(float)numbers.length;
    System.out.printf("%.3f\n",answer);
  }
  }
}