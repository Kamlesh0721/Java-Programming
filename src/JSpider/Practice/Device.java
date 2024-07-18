package JSpider.Practice;

public class Device {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        try {
            c.calculate();
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
