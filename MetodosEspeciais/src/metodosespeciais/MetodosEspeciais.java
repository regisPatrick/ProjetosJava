package metodosespeciais;

public class MetodosEspeciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
        //c1.setModelo("Bic Cristal");
        //c1.setPonta(0.5f);
        c1.status();
        
        Caneta c2 = new Caneta("kkk", "laranja", 1.5f);
        c2.status();
        
        //System.out.println("Tenho uma caneta: " + c1.getModelo() + " de ponta: " + c1.getPonta());
    
    }
    
}
