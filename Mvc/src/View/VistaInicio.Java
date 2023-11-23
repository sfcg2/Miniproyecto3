public class VistaInicio extends JFrame implements ActionListener, ItemListener {   

    public void iniciar{

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
        wnd.setVisible(true);
    }
}
    
