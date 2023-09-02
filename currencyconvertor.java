import java.util.*;
import java.text.DecimalFormat;

public class currencyconvertor{
    public static void main(String args[]){
        double rupee,dollar,pound,code,euro,kwd;
        DecimalFormat format = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to the Currency Convertor ***\nEnter the Currency Code\n1.Rupee\n2.Dollar\n3.Dinar\n4.Euro\n5.Pound\n6.Exit");
        code =sc.nextDouble();
        if(code==1){
            System.out.println("Enter the Amount in Rupee");
            rupee=sc.nextDouble();
            dollar=rupee/82.55;
            System.out.println("In Dollar : "+format.format(dollar));
            pound = rupee/103.85;
            System.out.println("In Pound : "+format.format(pound));
            euro =rupee/89.11;
            System.out.println("In Euro : "+format.format(euro));
            kwd=rupee/267.77;
            System.out.println("In Dinar : "+format.format(kwd));
        } else if(code==2){
            System.out.println("Enter the Amount in Dollar : ");
            dollar=sc.nextDouble();
            rupee=dollar*82.55;
            System.out.println("In Rupee : "+format.format(rupee));
            pound = dollar*0.79;
            System.out.println("In Pound : "+format.format(pound));
            euro =dollar*0.93;
            System.out.println("In Euro : "+format.format(euro));
            kwd=dollar*0.31;
            System.out.println("In Dinar : "+format.format(kwd));
        } else if(code==3){
            System.out.println("Enter the Amount in Dinar : ");
            kwd=sc.nextDouble();
            dollar=kwd*3.24;
            System.out.println("In Dollar : "+format.format(dollar));
            pound = kwd*2.58;
            System.out.println("In Pound : "+format.format(pound));
            euro = kwd*3.01;
            System.out.println("In Euro : "+format.format(euro));
            rupee= kwd*267.77;
            System.out.println("In Rupee : "+format.format(rupee));
        } else if(code==4){
            System.out.println("Enter the Amount in Euro : ");
            euro=sc.nextDouble();
            dollar=euro*1.08;
            System.out.println("In Dollar : "+format.format(dollar));
            pound = euro*0.86;
            System.out.println("In Pound : "+format.format(pound));
            kwd = euro*0.33;
            System.out.println("In Euro : "+format.format(kwd));
            rupee= kwd*89.11;
            System.out.println("In Rupee : "+format.format(rupee));
        } else if(code==5){
            System.out.println("Enter the Amount in Pound : ");
            pound=sc.nextDouble();
            dollar=pound*1.26;
            System.out.println("In Dollar : "+format.format(dollar));
            euro = pound*1.17;
            System.out.println("In Pound : "+format.format(euro));
            kwd = pound*0.39;
            System.out.println("In Euro : "+format.format(kwd));
            rupee= pound*103.85;
            System.out.println("In Rupee : "+format.format(rupee));
        } else if(code==6){
            return;
        }else{
            System.out.println("Invalid Code");
        }
               

    }

    

}