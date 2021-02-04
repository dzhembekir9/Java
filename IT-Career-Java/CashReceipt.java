public class CashReceipt{

    public static void PrintHeader(){
        System.out.println("CASH RECEIPT");
        System.out.println("-------------------------------");
    }
    public static void PrintBody(){
        System.out.println("Charged to ____________________");
        System.out.println("Received by ___________________");
    }
    public static void PrintFooter(){
        System.out.println("-------------------------------");
        System.out.println("SoftUni");
    }
    public static void main(String[] args){
        PrintHeader();
        PrintBody();
        PrintFooter();

    }
}