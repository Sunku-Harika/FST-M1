a=[2,5,7,8,3,9,10]
b=[2,5,7,8,3,9,10]

print("First list",a)
print("Secound list",b)

c=[]

for i in a:
    if i%2 != 0:
        c.append(i)


for i in b:
    if i%2==0:
        c.append(i)

print("third list ", end=" ")
print(c)