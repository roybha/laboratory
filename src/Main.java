 import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean flag=false;
        int H,W;
        do {
            H=0;
            W=0;
            do {
                System.out.println("Input height");
                Scanner in = new Scanner(System.in);
                String height = in.next();
                try {
                    H=Integer.parseInt(height);
                    flag=true;
                }catch (Exception e) {
                    System.out.println("You inputted not a number");
                }
            }while(!flag);
            flag=false;
            do {
                System.out.println("Input width");
                Scanner in = new Scanner(System.in);
                String width = in.next();
                try {
                    W=Integer.parseInt(width);
                    flag=true;
                }catch (Exception e) {
                    System.out.println("You inputted not a number");
                }
            }while(!flag);
            flag=H==W;
            if(flag)
                System.out.println("All is ok");
            else
                System.out.println("You have entered the wrong sizes");
        }while (!flag);

        for(int i=0;i<H;i++) {
            for(int j=0;j<W;j++) {
                char c=i==0||j==0||i==H-1||j==W-1||i==j||i+j==H-1?'*':' ';
                System.out.print(c);
            }
            System.out.println();
        }



    }
}