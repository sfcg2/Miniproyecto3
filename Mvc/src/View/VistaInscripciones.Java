public class VistaInscripciones extends JFrame implements ActionListener, ItemListener {

    public void inscripciones(){

        wnd = new JFrame("Datos Candidato");
        wnd.setLayout(new BorderLayout(15,15));

        etq = new JLabel("D A T O S");
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(etq);
        wnd.add(panel, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,2,20,40));

        etq = new JLabel("Nombre: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        nom = new JTextField(15);
        p.add(etq);
        p.add(nom);

        etq = new JLabel("Cédula: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        cc = new JTextField(15);
        p.add(etq);
        p.add(cc);

        etq = new JLabel("Ciudad: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        cdad = new JTextField(15);
        p.add(etq);
        p.add(cdad);

        etq = new JLabel("Ideología: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        idel = new JTextField(15);
        p.add(etq);
        p.add(idel);

        etq = new JLabel("Partido: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        part = new JTextField(15);
        p.add(etq);
        p.add(part);

        etq = new JLabel("Promesas: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        prom = new JTextField(15);
        p.add(etq);
        p.add(prom);

        wnd.add(p, BorderLayout.CENTER);

        p = new JPanel();
        ingresar = new JButton("Inscribir");
        ingresar.setFont(new Font("Arial", Font.ITALIC, 20));
        ingresar.addActionListener(this);
        p.add(ingresar);
        salir1 = new JButton("Salir");
        salir1.setFont(new Font("Arial", Font.ITALIC, 20));
        salir1.addActionListener(this);
        p.add(salir1);
        wnd.add(p, BorderLayout.SOUTH);

        p = new JPanel();
        p.add(new JLabel("                "));
        wnd.add(p, BorderLayout.WEST);

        p = new JPanel();
        p.add(new JLabel("                "));
        wnd.add(p, BorderLayout.EAST);

        wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        wnd.setSize(500, 570); 
        wnd.setVisible(true);
    }

}