public class VistaLista extends JFrame implements ActionListener, ItemListener {

    public void Lista{

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

        }else if(e.getSource() == salir2){wnd2.dispose();}
    }
}

//solo listaaaaaaa