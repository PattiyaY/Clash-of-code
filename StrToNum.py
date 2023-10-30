store = {}
n = int(input())
for i in range(n):
    key, value = input().split()
    store[key] = value

s = 'Hello World'
output = ''
for i in s:
    if i.upper() in store.keys():
        output += store[i.upper()]
    else:
        output += i
print(output)