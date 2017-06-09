import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class question6{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int times = Integer.parseInt(input.nextLine()); // 次數檢定
    
    
    for(int i = 0 ; i < times ; i++){ // LOOP 4 Excuting
        String queryString = input.nextLine(); // 輸入資料如：”1987/06/02 1987/07/06“
        String[] parseOfQuery = queryString.split(" "); // 資料變成 ["1987/06/02","1987/07/06"]
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //建立模板來萃取資料 yyyy 公元年 MM 月份 dd 日期
        String firstInput = parseOfQuery[0]; // "1987/06/02"
        String secondInput = parseOfQuery[1]; // "1987/07/06"
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter); // 讓模板跟 開始日 匹配  並且轉換成 LocalDate的物件
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter); // 讓模板跟 結束日 匹配  並且轉換成 LocalDate的物件
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate); // ChronoUnit物件底下有一個方法 可以計算DAYS
        long answer = java.lang.Math.abs(days); // 記得要用絕對值,避免產生minus
        System.out.println(answer); // 印出你的答案
    }
      
  }

}