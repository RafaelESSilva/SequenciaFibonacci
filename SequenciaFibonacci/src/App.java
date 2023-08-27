import java.util.Scanner;
public class App {
        public static void main(String[] args) throws Exception {
             Scanner scan = new Scanner(System.in);
                int x = 0 ;
                int y = 1 ;
                int limit = scan.nextInt();

                    while(y < limit){
                        int fn = x + y;
                            if(fn > limit){
                                break;
                                
                            }

                            System.out.println(fn);
                            x =y;
                            y = fn;
                    }      
                            
    }
}
