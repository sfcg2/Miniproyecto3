public class VistaVotar extends JFrame implements ActionListener, ItemListener {

    public void Votar{

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
     }
    
}

//solo votar, bien
