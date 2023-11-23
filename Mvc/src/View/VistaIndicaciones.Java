public class VistaIndicaciones extends JFrame implements ActionListener, ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getStateChange() == 1){
            if(e.getItemSelectable() == indica){
                System.out.println("gkg");
                JOptionPane.showMessageDialog(wnd, "Ingresar:\n *Promesas juntas, separadas por comas (,)\n  *Cedula sin puntos", 
                "Indicaciones", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
}

//bien