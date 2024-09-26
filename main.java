import java.time.LocalDate;
import java.util.Scanner;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args){

        try (Scanner scan = new Scanner(Paths.get("clientData.txt"))) {
            while(scan.hasNextLine()){
                String currentClient = scan.nextLine();
                String[] clientInfo = currentClient.split(",");

                String name = clientInfo[0];
                String dob = clientInfo[1];
                int CS = Integer.parseInt(clientInfo[2]);
                double incomePastThreeMonths = Double.parseDouble(clientInfo[3]);
                double taxableIncomePreviousYear = Double.parseDouble(clientInfo[4]);
                double requestedLoan = Double.parseDouble(clientInfo[5]);

                generateID id = new generateID(name);
                LocalDate date = LocalDate.parse(dob);
                client customer = new client(name, id.createID(), date, CS,taxableIncomePreviousYear,incomePastThreeMonths,requestedLoan);

                judge c = new judge(customer);


                System.out.println("Customer Info:\n" +
                        "Name: " + customer.getName() + "\n" +
                        "ID: " + id.createID() + "\n" +
                        "Birthdate: " + dob + "\n" +
                        "Credit Score: " + CS + "\n" +
                        "Taxable Income Previous Year: " + taxableIncomePreviousYear + "\n" +
                        "Income Past Three Months: " + incomePastThreeMonths + "\n" +
                        "Requested Loan: " + requestedLoan + "\n" +
                        "Result: " + customer.getName() + " has been " + (c.evaluate() ? "accepted" : "rejected") + ".\n"+
                        "--------------");



            }

        }catch(Exception e){
            System.out.println(e.getCause());
        }






    }
}
