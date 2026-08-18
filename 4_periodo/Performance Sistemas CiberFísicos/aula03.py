def f (n,L):
    print(n, len(L))
    
    if n > 0:
        L2 = []
        for i in range(2*len(L)):
            L2.append(i)
        f(n - 1, L2)

a = [1,2,3,4,5,6,7,8,9,10]
b = a
b[2] = 0

del(a)

def g(x):
    a = x

g(11)

# da erro no print a pq ele nn existe
print(a)
print(b)

i = 0

while i <= 10:
    # da um erro de out of range 
    print(b[i])
    i += 1

f(100, b)