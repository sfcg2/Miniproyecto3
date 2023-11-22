public class VistaGets extends JFrame implements ActionListener, ItemListener {
 
    public static String getNom() {
        return nom.getText();
    }public static String getCC() {
        return cc.getText();
    }public static String getCdad() {
        return cdad.getText();
    }public static String getIdel() {
        return idel.getText();
    }public static String getPart() {
        return part.getText();
    }public static String getProm() {
        return prom.getText();
    }public static String getPosic(){
        return posic.getText();
    }public static String getBuscarCedula(){
        return buscarCedula;
    }public static ArrayList <Candidato> getLsiatElim(){
        return lsiatElim;
    }public static JTextArea getArea(){
        return area;
    }public static JFrame getwidth(){
        return wnd;
    }

}