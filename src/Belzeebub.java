public class Belzeebub extends manga {

    public Belzeebub() {
        super("J", "F", 190);
        
    }

    @Override
    public void type() {
        
        System.out.println("Ceci est un shonen"); 
    }

    @Override
    public boolean estAutorise() {
        
        return false;
    }

   
}
