"""
 4. 測試範例 平均(2)
"""
times = int(input()) # 輸入次數

for i in range(times):
  myInput = input().split(' ') # 切割字串
  answer = 0
  for j in myInput:
    answer = answer + int(j)
  print("{:.3f}".format(answer/len(myInput))) # ”{:.3f}“ --> 小數點第三位 len()用來計算陣列大小