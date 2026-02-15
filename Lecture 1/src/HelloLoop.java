public class HelloLoop {
    static void main(String[] args) {
        for (int i=0; i < 6; i++) {
            for (int j=0; j<5; j++) {
                System.out.print("Hello! ");
            }
            System.out.println(" ");
        }
    }
}

/*
Could also do:

public class HelloLoop {
    static void main(String[] args) {
        for (int i=0; i < 6; i++) {
            for (int j=0; j<4; j++) {
                System.out.print("Hello! ");
            }
            System.out.println("Hello!");
        }
    }
}

OR

public class HelloLoop {
    static void main(String[] args) {
        for (int i=0; i < 6; i++) {
            for (int j=0; j<5; j++) {
                System.out.print("Hello! ");
            }
            System.out.println();
        }
    }
}

OR (wrapped in the class ofc)

static void main(String[] args) {
    helloGrid(rows: 6, cols:5);
}

private static void helloGrid(int rows, int cols) {
    for(int i = 1; i<= rows; i++){
        helloRow(cols);
     }
}

private static void helloRow(int cols) {
    for(int i = 1; i <= cols; i++) {
        System.out.print("Hello! ");
     )
    System.out.println();
}


 OR (wrapped in the class ofc)



private static String repeat(int times, String message) {
    String accumulator = "";
    for(int i = 1; i <= times; i++){
       accumulator = accumulator + message;
    }
    return accumulator;
}

private static void helloGridV2(){
    String grid = repeat(times: 6, message: repeat(times:5, message: "Hello")+"\n";
    System.out.print(grid);
}
    Can also be written as:
        private static void helloGridV2(){
            String row = repeat(times:5, message: "Hello! ")+"\n";
            String grid = repeat(times: 6, row);
            System.out.print(grid);
        }

 */
