import java.util.Random;
import java.lang.StringBuilder;
public class generateID {
    String customerName;
    public generateID(String customerName){
        this.customerName = customerName;
    }
    public String createID(){
        Random rand = new Random();
        int p1 = rand.nextInt(10,100);
        char p2 = (char)(rand.nextInt(26)+ 'A');

        char p3 = customerName.charAt(0);
        char p4 = customerName.substring(customerName.indexOf(" ")+1).charAt(0);
        int p5 = rand.nextInt(100,1000);

        StringBuilder result = new StringBuilder();
        result.append(p1)
                .append(p2)
                .append(p3)
                .append(p4)
                .append(p5);

        String id = result.toString();
        return id;
    }
}
