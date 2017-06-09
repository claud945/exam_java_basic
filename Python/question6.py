"""
 6. 測試範例 年齡不是問題
 Notice：本範例使用Python內建的日期工具來計算日子的差距，因此潤年問題都包含在裏面了
"""
import datetime

def calculate_date(a, b):
  """
  計算兩個日子的差距
  a: DateObject ... 開始的日子
  b: DateObject ... 結束的日子
  return int
  """
  start_date = datetime.date(a['year'],a['month'],a['day'])
  end_date = datetime.date(b['year'],b['month'],b['day'])
  return abs((start_date-end_date).days) # 使用絕對值來表示兩者的distance

def parseString2Date(s):
  """
  將字串轉變成爲物件
  s: 字串
  return dict
  """
  dateFormat = s.split('/')
  payload  = {
    "year" : int(dateFormat[0]),
    "month" : int(dateFormat[1]),
    "day" : int(dateFormat[2])
  }
  return payload

def parseString2Object(s):
  """
  講字串轉變成爲Tuple
  s:字串
  return tuple
  """
  dataFormat = s.split(' ')
  return dataFormat[0],dataFormat[1]


times = int(input()) # 執行次數 電腦輸入

for i in range(times): 
  computerInput = input() #輸入字串
  data = parseString2Object(computerInput)
  answer = calculate_date(parseString2Date(data[0]),parseString2Date(data[1]))
  print(answer) # print Answer

