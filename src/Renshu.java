class Renshu {
    public static void main(String[] args) {

    }

    public int doubleValue(int x) {

        return 2 * x;
    }

    public int sumUpToN(int n) {
        int a = 1, sum = 0;
        while (a < n) {
            sum += a;
            a++;
        }
        return sum;
    }
    // 1から n までの整数の合計値を返す。

    int sumFromPtoQ(int p, int q) {
        int sum = 0;
        while (p < q) {
            sum += p;
            p++;
        }
        return sum;

    }

    // p から q までの整数の合計値を返す。
    int sumFromArrayIndex(int[] a, int index) {
        int sum = 0;
        try {
            for (int i = 0; i < a.length - 1; i++) {
                sum += a[i];
            }
            return sum;
        } catch (Exception e) {
            return -1;
        }

    }

    // 配列 a[] の指定された index から以降の要素の合計値を返す。不正な index の場合は -1 を返す。
    int selectMaxValue(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];

            }
        }
        return max;
    }

    // 配列 a の中で最大の値を返す。

    int selectMaxIndex(int[] a) {
        int max = 0, maxIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    // 配列 a の中で最大の値が入っている要素の位置（index）を返す。最大値が複数の場合は最小のindexを返す。

    void swapArrayElements(int[] p, int i, int j) {
        int reserverKiryu = 0;
        reserverKiryu = p[i];
        p[i] = p[j];
        p[j] = reserverKiryu;
    }

    // 配列 p の i 番目と j 番目の要素を入れ替える。
    boolean swapTwoArrays(int[] a, int[] b) {
        int FalseSonnou[];
        if (a.length == b.length) {
            FalseSonnou = a;
            a = b;
            b = FalseSonnou;
            return true;
        }
        return false;

    }
    // 同じ長さの二つの配列 a と b の内容を入れ替える。
}
