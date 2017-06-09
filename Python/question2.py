"""
 2. 測試範例 平均
"""

times = int(input()) ## 輸入次數
total = 0
for i in range(times):
  total = total + int(input())

print("{:.3f}".format(total/times)) ## .3f是用來顯示小數點到第三位的