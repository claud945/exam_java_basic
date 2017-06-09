"""
 3. 測試範例 總和(2)
"""
times = int(input())
for i in range(times):
  myInput = input().split(' ')
  answer = 0
  for j in myInput:
    answer = answer + int(j)
  print(answer)