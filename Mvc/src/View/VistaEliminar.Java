public class VistaEliminar extends JFrame implements ActionListener, ItemListener {

    public void Eliminar{

        buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a eliminar:");

            if (buscarCedula != null){
                
                el.eliminar();
                
            }else{return;}

    }
}

//solo eliminaaaaar