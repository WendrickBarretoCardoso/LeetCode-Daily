package ano2024.mesApril;

public class test {
    public static void main(String[] args) {
        day03 teste = new day03();
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        teste.exist(board, "ABCCED");
    }
}
