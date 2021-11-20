public class Kilari extends manga {

    public Kilari() {
        super("E", "G", 765);
      
    }

    @Override
    public void type() {
        
        System.out.println("Ceci est un shojo");
    }

    @Override
    public boolean estAutorise() {
        
        return false;
    }

    


    
}
