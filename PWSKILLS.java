public class PWSKILLS {
    static void printP(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0||(j==1||j==2)&&(i==0||i==n/2)||(j==n/2) && (i==1 ||i==2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printW(int n) {
        for (int i = n-1; i>=0; i--) {
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
    static void printK(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0|| i+j==4 ||i-j==2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if ((i==0 || i==n-1)&&(j<=n/2+1)||j==(n/2+1)/2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printL(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0||i==n-1 && j<=n/2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String []args){
      printP(7);
     System.out.println();
      printW(7);
     System.out.println();
      printS(7);
     System.out.println();
      printK(7);
     System.out.println();
      printI(7);
     System.out.println();
      printL(7);
     System.out.println();
      printL(7);
     System.out.println();
      printS(7);
    }
    
}
