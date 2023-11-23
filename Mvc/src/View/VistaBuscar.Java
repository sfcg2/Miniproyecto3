public class VistaBuscar extends JFrame implements ActionListener, ItemListener {

        public void Buscar{

            buscarCedula = JOptionPane.showInputDialog(wnd,"Ingrese la cédula del candidato a buscar:");
            
            Buscar.setVal(false);
            
            if (buscarCedula != null){

                area = new JTextArea(100,10);
                
                bc.buscar();

                if(Buscar.getVal() != false){

                    wnd2 = new JFrame("Candidato");
                    wnd2.setLayout(new BorderLayout());
                    area.setEditable(false);
                    scroll = new JScrollPane(area);
                    wnd2.add(scroll, BorderLayout.CENTER);
                    wnd2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    wnd2.setSize(500, 570); 
                    wnd2.setVisible(true);
                    System.out.println(lsiat.toString()); 
                }
               
            }else{return;}
        }
}

//solo buscaaar