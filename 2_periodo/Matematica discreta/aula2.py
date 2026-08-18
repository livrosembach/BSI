def verificarPrimo(x):
    if x < 2:
        return False
    for i in range(2,x):
        if x % i == 0 :
            return False   
    return True

def complemento(u, c) :
    u = set(u)
    c = set(c)
    return u.difference(c)


#Coleção em python

s = {2,3,4,5,6}
a = set()
b = set()
c = set()

for i in s:
    if i % 2 == 1:
        a.add(i)
    if 2 <= i < 4 :
        b.add(i)
    if verificarPrimo(i):
        c.add(i)


print(a)
print(b)
print(c)

print(complemento(s,a))


