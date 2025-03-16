public class Basic {

    public static void getNumber() {
        for(int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getNumberReverse() {
        for(int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void oddNumbers() {
        for(int i = 0; i <= 20; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void revNum(int num) {
        int res = (num / 2) + 1;
    
        for(int i = res; i > 0; i--) {
            System.out.print(i);
            System.out.print(" ");
        }
        for(int i = num; i > res; i--){
            System.out.print(i);
            System.out.print(" ");
        }
    }
	
	public static void main(String[] args) {

        System.out.println("Q1 ...");
        System.out.println("Hello World");

        System.out.println("Q2 ...");
        getNumber();

        System.out.println("Q3 ...");
        getNumberReverse();

        System.out.println("Q4 ...");
        oddNumbers();

        System.out.println("Q5 ...");
        revNum(9);
	}
		
}