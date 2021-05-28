interface Accounts{
    String IFSC = "CBI3547";
    String branch_name="Hadapsar";
    void KYC(); //abstract


    interface Cards{
        String Authority="VISA";
        void setLimit();
    }
}
class Account1 implements Accounts{
    long number;
    String acc_holder_name;

    public Account1(long number, String acc_holder_name) {
        this.number = number;
        this.acc_holder_name = acc_holder_name;
    }
    public  void KYC(){
        System.out.println("Provide Addhar Card num and pan number");
    }
    class DebitCard implements Accounts.Cards{
        String card_num;
        String card_type;

        public DebitCard(String card_num, String card_type) {
            this.card_num = card_num;
            this.card_type = card_type;

        }
        public void setLimit()
        {
            System.out.println("50000");
        }
    }
}

public class Accounts1 {
    public static void main(String[] args) {
        Account1 a2 = new Account1(1253384390,"sushila Hajare");
        Account1.DebitCard dc1 = a2.new DebitCard("2353-234-1231","Platinum");
        System.out.println("Account Details \n IFSC Code:- "+Accounts.IFSC+"\n Branch Name:- "+Accounts.branch_name+
                "\n Card Authority:-"+Accounts.Cards.Authority+"\n Acc_Number:- "+a2.number+"\n Acc_Holder Name:- "
                +a2.acc_holder_name +"\n Card number:- "+dc1.card_num+"\n Card Type:- "+dc1.card_type);
    }
}

