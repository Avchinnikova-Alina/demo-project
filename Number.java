public class Number {
        public static void main(String[] args) {
            for (int i = 1; i <100; i++) {
                if((i % 5)==0) System.out.println("git " + i);
                if((i % 7)==0) System.out.println("bush " + i);
                if((i % 5)==0 && (i % 7)==0) System.out.println("gitbush " + i);
            }
        }
    }
