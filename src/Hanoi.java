public class Hanoi {
    //вносим локальные переменные
    // n - номер дисков
    // from_rod, to_rod, aux_rod - столбы
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        // base case, который выходит из метода если нет дисков
        if (n == 0) {
            return;
        }
        //применение рекурсии
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n -1, aux_rod, to_rod, from_rod);
    }

    //driver code
    public static void main(String[] args) {
        int N = 3;

        towerOfHanoi(N, 'A', 'B', 'C');
    }
}
