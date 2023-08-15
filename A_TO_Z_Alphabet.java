
public class A_TO_Z_Alphabet {
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

    static void printB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j == 0 || (i == 0 || i == n / 2 || i == n - 1) && (j <= n / 2)
                        || (j == n / 2 + 1 && i != 0 && i != n / 2 && i != n - 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printC(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if ((j==0 && i!=0 && i!=n-1)||((i==0 || i==n-1)&& (j>0 && j<=n/2))||(j==n/2+1 && (i==1 ||i==n-2))) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
      static void printD(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if ((j==0)||((i==0 || i==n-1)&& ( j<=n/2))||(j==n/2+1 && i!=0 && i!=n-1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printE(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0 || (i==0 ||i==n-1||i==n/2)&&(j<=n/2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
       static void printF(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j==0 || (i==0 ||i==n/2)&&(j<=n/2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    static void printG(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if ((j==2 || j==n/2)&&(i==0 ||i==n/2+1 || i==n-1)||(j==0)&&(i==2 ||i==n/2 ||i==n/2+1)||(j==1)&&(i==1 || i==n-2)||(j==n/2+1)&&(i==1 ||i==n/2+1 ||i==n/2+2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
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
    public static void main(String[] args) {
        // printA(7);
        printR(7);
    }

}