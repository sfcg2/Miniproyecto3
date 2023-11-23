public class VistaAcciones extends JFrame implements ActionListener, ItemListener {

    @Override
    public void actionPerformed(ActionEvent e) {

       /*  if(e.getSource() == iniciar){

            dispose();
            wnd = new JFrame("Elecciones");
            wnd.setLayout(new BorderLayout(15,15));

            menuB = new JMenuBar();
            menuB.setBounds(10, 5, 230, 12);
            wnd.add(menuB, BorderLayout.NORTH);

            indica = new JMenu("Indicaciones");
            indica.addItemListener(this);
            menuB.add(indica);

            
            opciones = new JMenu("Opciones");
            opciones.addItemListener(this);
            menuB.add(opciones);

            insertar = new JMenuItem("Insertar Candidato");
            insertar.addActionListener(this);
            opciones.add(insertar);
            
            actualizar = new JMenuItem("Actualizar Candidato");
            actualizar.addActionListener(this);
            opciones.add(actualizar);
            
            eliminar = new JMenuItem("Eliminar Candidato");
            eliminar.addActionListener(this);
            opciones.add(eliminar);

            buscar = new JMenuItem("Buscar Candidato");
            buscar.addActionListener(this);
            opciones.add(buscar);

            listar = new JMenuItem("Lista Candidatos");
            listar.addActionListener(this);
            opciones.add(listar);

            votar = new JMenuItem("Votar");
            votar.addActionListener(this);
            opciones.add(votar);

            info = new JMenuItem("Información");
            info.addActionListener(this);
            opciones.add(info);

            panel = new JPanel();
            etq.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Miniproyecto2-main\\Proyecto\\img\\colV.jpg"));
            etq.setPreferredSize(new Dimension(800,600));
            panel.add(etq);
            wnd.add(panel, BorderLayout.CENTER);
 
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);*/

        }else if(e.getSource() == insertar){

            inscripciones();
                
        }else if(e.getSource() == ingresar){ //NO SE DONDE METER ESAS TRES 

            in.insertar();
            
        }else if(e.getSource() == salir1){
            wnd.dispose();
        }/*else if(e.getSource() == actualizar){

            buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a actualizar:");
            Actualizar.setVal4(false);
            if (buscarCedula != null){
                
                ac.actualizar();

                if(Actualizar.getVal4() != false){
                    inscripciones();
                }
                
            }else{return;}*/

        /* }else if(e.getSource() == eliminar){

            buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a eliminar:");

            if (buscarCedula != null){
                
                el.eliminar();
                
            }else{return;}*/

       /*  }else if(e.getSource() == buscar){

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
               
            }else{return;}*/
            
        }/*else if(e.getSource() == listar){

            wnd2 = new JFrame("Lista Candidatos");
            wnd2.setLayout(new BorderLayout());

            area = new JTextArea(250,10);
            lc.listaCandidatos();
            area.setEditable(false);
            scroll = new JScrollPane(area);
            wnd2.add(scroll, BorderLayout.CENTER);
            
            panel = new JPanel();
            salir2 = new JButton("Salir");
            salir2.setFont(new Font("Arial", Font.ITALIC, 20));
            salir2.addActionListener(this);
            panel.add(salir2);
            etq = new JLabel("   ");
            etq.setFont(new Font("Arial", Font.BOLD, 40));
            panel.add(etq);
            wnd2.add(panel,BorderLayout.SOUTH);

            wnd2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd2.setSize(500, 570); 
            wnd2.setVisible(true);

        }else if(e.getSource() == salir2){wnd2.dispose();}*/
        
       /*  else if (e.getSource() == votar){

            wnd = new JFrame("Votación");
            wnd.setLayout(new BorderLayout());
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            
            area = new JTextArea(100,10);
            lc.listaCandidatos();

            area.setEditable(false);
            scroll = new JScrollPane(area);
            panel.add(scroll, BorderLayout.CENTER);
            wnd.add(panel, BorderLayout.CENTER);

            panel = new JPanel();
            panel.setLayout(new GridLayout(3,1, 15,15));

            etq = new JLabel("Posición: ");
            etq.setFont(new Font("Arial", Font.BOLD, 20));
            posic = new JTextField(15);
            etq2 = new JLabel("                            ");
            etq2.setFont(new Font("Arial", Font.BOLD, 15));
            panel.add(etq);
            panel.add(posic);
            panel.add(etq2);

            vtar = new JButton("Votar");
            vtar.addActionListener(this);
            panel.add(vtar);
            wnd.add(panel, BorderLayout.SOUTH);
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

        }else if(e.getSource() == vtar){
            
            vt.votar();
            wnd.dispose();

        }/*else if(e.getSource() == info){

            wnd = new JFrame("Información");
            wnd.setLayout(new BorderLayout());
            area = new JTextArea(100,10);

            vt.VotosTotales();
            pc.pMasC();
            tp.ciudadestop3();

            area.setEditable(false);
            scroll = new JScrollPane(area);
            wnd.add(scroll, BorderLayout.CENTER);
            
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);
        }*/
    }
}