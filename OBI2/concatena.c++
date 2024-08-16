#include <iostream>
#include <vector>
#include <string>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);

    int n, q;
    std::cin >> n >> q;
    std::vector<int> vetor(n);

    for (int i = 0; i < n; i++) {
        std::cin >> vetor[i];
    }

    for (int i = 0; i < q; i++) {
        int l, r;
        std::cin >> l >> r;

        if (l != r) {
            l--;
        }

        int soma = 0;
        for (int j = l; j < r; j++) {
            for (int k = j; k < r; k++) {
                if (k != l) {
                    soma += std::stoi(std::to_string(vetor[j]) + std::to_string(vetor[k]));
                }
            }
        }
        std::cout << soma << "\n";
    }

    return 0;
}