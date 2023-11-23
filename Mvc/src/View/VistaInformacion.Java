public class VistaInformacion extends JFrame implements ActionListener, ItemListener {
    public void Informacion{

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
    }
    
}

//esta bien, solo esta la info