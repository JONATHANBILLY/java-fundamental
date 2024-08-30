public class ProgrammingLanguage {
    public static void main(String[] args)
    {
        int a = 5;
        printPyramid(a);
    }

    public static void printPyramid(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
