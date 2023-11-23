public class VistaActualizar extends JFrame implements ActionListener, ItemListener {

    public void Actualizar{
       
        buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a actualizar:");
            Actualizar.setVal4(false);
            if (buscarCedula != null){
                
                ac.actualizar();

                if(Actualizar.getVal4() != false){
                    inscripciones();
                }
                
            }else{return;}
    }
}

//solo actualizar