import java.util.*;

public class retas {

    static final int maxn = (int) 1e5 + 10;
    static long[] bit = new long[maxn];
    static int n;
    static long x1, x2;

    // Função para comparar pares de valores
    public static int cmp(Pair a, Pair b) {
        if (a.first != b.first) {
            return Long.compare(a.first, b.first);
        }
        return Long.compare(b.second, a.second);
    }

    // Função para atualizar o BIT (Binary Indexed Tree)
    public static void upd(int pos, int val) {
        for (int i = pos; i <= n; i += i & -i) {
            bit[i] += val;
        }
    }

    // Função para somar os valores até uma posição no BIT
    public static long soma(int pos) {
        long val = 0;
        for (int i = pos; i > 0; i -= i & -i) {
            val += bit[i];
        }
        return val;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura de entrada
        n = sc.nextInt();
        x1 = sc.nextLong();
        x2 = sc.nextLong();

        List<Pair> p = new ArrayList<>();
        List<Long> cc = new ArrayList<>();

        // Processa os valores de cada linha
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            p.add(new Pair(a * x1 + b, a * x2 + b));
            cc.add(a * x2 + b);
        }

        // Ordena a lista cc e remove duplicatas
        Collections.sort(cc);
        cc = new ArrayList<>(new HashSet<>(cc));  // Remove duplicatas
        Collections.sort(cc);

        // Ordena a lista p de acordo com a função de comparação
        p.sort(retas::cmp);

        // Conta as interseções
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int x = upperBound(cc, p.get(i).second);
            ans += i - soma(x - 1);
            upd(x, 1);
        }

        // Saída do resultado
        System.out.println(ans);

        sc.close();
    }

    // Função para simular o upper_bound
    public static int upperBound(List<Long> list, long value) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Classe para armazenar pares de long
    static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
}