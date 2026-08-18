# import time
# import numpy as np

# buffer = np.zeros((4096, 4096), dtype=np.uint8)

# def preencher_buffer_linha_coluna():
#     for i in range(4096):
#         for j in range(4096):
#             buffer[i][j]= (i+j) % 256

# inicio = time.time()

# for _ in range(50):
#     preencher_buffer_linha_coluna()

# fim = time.time()

# print(f"Tempo final {fim - inicio}")

import time

SIZE = 4096

buffer = [[0 for _ in range(SIZE)] for _ in range(SIZE)]

def line_Column_50x():
    for _ in range(50):
        for i in range(SIZE):
            for j in range(SIZE):
                buffer[i][j] = (i + j) % 256

def column_line_50x():
    for _ in range(50):
        for j in range(SIZE):
            for i in range(SIZE):
                buffer[i][j] = (i + j) % 256

print("Starting row first")
start_time = time.time()
line_Column_50x()
end_time = time.time()
print(f"Ending row first: {end_time - start_time:.2f} seconds")

print("\nStarting column first")
start_time = time.time()
column_line_50x()
end_time = time.time()
print(f"Ending Column first: {end_time - start_time:.2f} seconds")