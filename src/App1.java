import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        StockageGenerique<Integer> stockageGenerique=new StockageGenerique<>(new ArrayList<>());
        stockageGenerique.addElement(12);
        stockageGenerique.addElement(10);
        System.out.println(stockageGenerique.getSize());
        try {
            //System.out.println(stockageGenerique.getElement(5));
            stockageGenerique.removeElement(3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
