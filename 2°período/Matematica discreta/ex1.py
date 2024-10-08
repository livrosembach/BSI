import matplotlib.pyplot as plt
import numpy as np
import math 

def funcao1oGrau(a,b,x):
    return (a*x + b)

def funcao2oGrau(a,b,c,x):
    return(a*x**2 + b*x + c)

def funcaoExponencial(a,b,x):
    return(a * b**x)

def funcaoModular(x):
    if x >= 0:
        return x
    else:
        return -x

def funcaoSeno(x):
    return math.sin(x)

vetorX = np.arange(-5, 5, 0.1)

a = 2 
b = 5
c = 10

vetorY = []
vetorY2 = []
vetorY3 = []
vetorXM = []
vetorXS = []

for x in vetorX:
    y = int(funcao1oGrau(a, b, x))
    vetorY.append(y)

fig = plt.figure(figsize=(10,10))

plt.scatter(vetorX, vetorY, label = "Função 1° Grau")

plt.title ('f(x) = ax + b')
plt.xlabel('eixo x')
plt.ylabel('eixo y')
plt.legend()
plt.grid(True, which='both')
plt.axhline(y=0, color='k')
plt.axvline(x=0, color='k')

plt.show() 

for x in vetorX:
    y = int(funcao2oGrau(a,b,c,x))
    vetorY2.append(y)

fig = plt.figure(figsize=(10,10))

plt.scatter(vetorX, vetorY2, label = "Função 2° Grau")

plt.title ('f(x) = ax² + bx + c')
plt.xlabel('eixo x')
plt.ylabel('eixo y')
plt.legend()
plt.grid(True, which='both')
plt.axhline(y=0, color='k')
plt.axvline(x=0, color='k')

plt.show()

for x in vetorX:
    y = int(funcaoExponencial(a, b, x)) 
    vetorY3.append(y)

fig = plt.figure(figsize=(10, 10))

plt.scatter(vetorX, vetorY3, label="Função Exponencial")

plt.title('f(x)= a * b^x')
plt.xlabel('eixo x')
plt.ylabel('eixo y')
plt.legend()
plt.grid(True, which='both')
plt.axhline(y=0, color='k')
plt.axvline(x=0, color='k')

plt.show()

for x in vetorX:
    xm = int(funcaoModular(x))
    vetorXM.append(xm)

print(vetorXM)
fig = plt.figure(figsize=(10, 10))

plt.scatter(vetorX, vetorXM, label="Função Modular")

plt.title('f(x)= |x|')
plt.xlabel('eixo x')
plt.ylabel('eixo y')
plt.legend()
plt.grid(True, which='both')
plt.axhline(y=0, color='k')
plt.axvline(x=0, color='k')

plt.show()

for x in vetorX:
    xs = float(funcaoSeno(x))
    vetorXS.append(xs)

fig = plt.figure(figsize=(10, 10))

plt.scatter(vetorX, vetorXS, label="Função Seno")

plt.title('f(x)= sen(x)')
plt.xlabel('eixo x')
plt.ylabel('eixo y')
plt.legend()
plt.grid(True, which='both')
plt.axhline(y=0, color='k')
plt.axvline(x=0, color='k')

plt.show()