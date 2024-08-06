import matplotlib.pyplot as plt
import numpy as np

def f(x) :
    return 2*x+3

vetorX = np.arange(-10,10,1)
print(vetorX)

vetorY = []

for x in vetorX:
    vetorY.append(f(x))

print(vetorY)