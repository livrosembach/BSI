import time

def calculate_pi_leibniz(n_terms):
    pi_approx = 0
    sign = 1
    for i in range(n_terms):
        pi_approx += sign / (2 * i + 1)
        sign = -sign
    return 4 * pi_approx

def main():
    n_terms = 100_000_000
    print(f"Calculating π approximation with {n_terms} terms...")
    
    start_time = time.time()
    pi_approx = calculate_pi_leibniz(n_terms)
    end_time = time.time()
    
    print(f"π ≈ {pi_approx}")
    print(f"Calculation took {end_time - start_time:.2f} seconds")

if __name__ == "__main__":
    main()