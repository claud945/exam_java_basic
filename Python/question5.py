"""
 5. 測試範例 年齡不是問題
"""

times = int(input())
for i in range(times):
  myInput = input().split(' ') # 將輸入的數值分開
  answer = 0 
  heigh_1 = int(myInput[0]) # 身高1
  heigh_2 = int(myInput[1]) # 身高2
  answer = abs(heigh_1-heigh_2) # 取距離（絕對值）
  print(answer) #結果
  