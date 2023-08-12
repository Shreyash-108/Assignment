public class evenodd {
    public static void main(String[] args) {
        System.out.println("Even numbers are:");
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            }
        System.out.println();
        System.out.println("Odd numbers are: ");
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        }
    }