public class MyName {
    static void printM(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0 || j==n/2+1||i==1&&(j==1 ||j==n/2)|| j==(n/2)/2+1 && i==2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2 + 1; j++) {
                if ((i != 0 && (j == 0 || j == n / 2)) || (i == 0 && j != 0 && j != n / 2) || i == n / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0 || j==n-1||i==j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printO(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -1; j++) {
                if ((j==0 ||j==n-2)&&(i==2||i==n/2||i==n/2+1)||(j==1||j==n-3)&&(i==1||i==n-2)||(j==2||j==n/2)&&(i==0||i==n-1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printH(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0 ||j==n/2+1|| i==n/2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printS(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if ((i==0 || i==n/2 ||i==n-1)&&(j>0 && j<n/2)||j==0 &&(i==1 ||i==2 ||i==n-2)||j==n/2 &&(i==1 ||i==n-2 ||i==n-3)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printR(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0||(j==1||j==2)&&(i==0||i==n/2)||(j==n/2) && (i==1 ||i==2)||i-j==2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String []args){
     printM(7);
     System.out.println();
     printA(7);
     System.out.println();
     printN(7);
     System.out.println();
     printM(7);
     System.out.println();
     printO(7);
     System.out.println();
     printH(7);
     System.out.println();
     printA(7);
     System.out.println();
     printN(7);
     System.out.println();
     System.out.println();
     printS(7);
     System.out.println();
     printH(7);
     System.out.println();
     printA(7);
     System.out.println();
     printR(7);
     System.out.println();
     printM(7);
     System.out.println();
     printA(7);
     System.out.println();
    }
    
}
