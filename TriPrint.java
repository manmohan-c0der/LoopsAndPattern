public class TriPrint {
    static void  Triangle(int n){
        for(int i = 1; i <= n; i++)
        {
          // n-i leading spaces
          for(int j = 0; j < n - i; j++)
              System.out.print(" ");
             
          // i elements
          for(int j = 1; j <= i; j++)
            System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String []args){
        Triangle(7);
    }
    
}
