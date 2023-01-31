#1)Sum each number from input 
#2)Square the sum 
#3)Print the output

num = input()
result = 0
for i in num:
  result += int(i)
print(result**2)
