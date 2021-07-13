import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    private int zas1 = 0;
    private int zas2 = 0;
    private int zas3 = 0;
    private int zas4 = 0;
    private int zas5 = 0;
    private int zas6 = 0;
    private int zas7 = 0;
    private int zas8 = 0;
    private int x = 20;
    private int y = 190;
    private int[][] tablica = new int[48][95];

    public Main(){

        JFrame frame = new JFrame("Automaty Komórkowe");
        Grafika panel = new Grafika("grafika/tlo.png");
        panel.setLayout(null);

        for(int i=0 ; i<48; i++){

            for(int j = 0; j<93; j++){
                JLabel pole = new JLabel();
                pole.setIcon(new ImageIcon("grafika/biale10.png"));
                pole.setBounds(x, y,10,10);
                x +=10;
                panel.add(pole);
            }
            x =20;
            y +=10;
        }

       //zasady
        JLabel start = new JLabel();
        start.setIcon(new ImageIcon("grafika/start.png"));
        start.setBounds(410,115,150,60);
        panel.add(start);

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                start.setIcon(new ImageIcon("grafika/startNajazd.png"));
            }
        });

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                start.setIcon(new ImageIcon("grafika/start.png"));
            }
        });

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                start.setIcon(new ImageIcon("grafika/startKlik.png"));
            }
        });

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                start.setIcon(new ImageIcon("grafika/start.png"));
            }
        });


        JLabel zasady = new JLabel();
        zasady.setIcon(new ImageIcon("grafika/zasady.png"));
        zasady.setBounds(20,20,130,60);
        panel.add(zasady);

        JLabel z1 = new JLabel();
        z1.setIcon(new ImageIcon("grafika/czarne.png"));
        z1.setBounds(160,20,30,30);
        panel.add(z1);

        JLabel z2 = new JLabel();
        z2.setIcon(new ImageIcon("grafika/czarne.png"));
        z2.setBounds(190,20,30,30);
        panel.add(z2);

        JLabel z3 = new JLabel();
        z3.setIcon(new ImageIcon("grafika/czarne.png"));
        z3.setBounds(220,20,30,30);
        panel.add(z3);

        JLabel z4 = new JLabel();
        z4.setIcon(new ImageIcon("grafika/czarne.png"));
        z4.setBounds(260,20,30,30);
        panel.add(z4);

        JLabel z5 = new JLabel();
        z5.setIcon(new ImageIcon("grafika/czarne.png"));
        z5.setBounds(290,20,30,30);
        panel.add(z5);

        JLabel z6 = new JLabel();
        z6.setIcon(new ImageIcon("grafika/biale.png"));
        z6.setBounds(320,20,30,30);
        panel.add(z6);

        JLabel z7 = new JLabel();
        z7.setIcon(new ImageIcon("grafika/czarne.png"));
        z7.setBounds(360,20,30,30);
        panel.add(z7);

        JLabel z8 = new JLabel();
        z8.setIcon(new ImageIcon("grafika/biale.png"));
        z8.setBounds(390,20,30,30);
        panel.add(z8);

        JLabel z9 = new JLabel();
        z9.setIcon(new ImageIcon("grafika/czarne.png"));
        z9.setBounds(420,20,30,30);
        panel.add(z9);

        JLabel z10 = new JLabel();
        z10.setIcon(new ImageIcon("grafika/czarne.png"));
        z10.setBounds(460,20,30,30);
        panel.add(z10);

        JLabel z11 = new JLabel();
        z11.setIcon(new ImageIcon("grafika/biale.png"));
        z11.setBounds(490,20,30,30);
        panel.add(z11);

        JLabel z12 = new JLabel();
        z12.setIcon(new ImageIcon("grafika/biale.png"));
        z12.setBounds(520,20,30,30);
        panel.add(z12);

        JLabel z13 = new JLabel();
        z13.setIcon(new ImageIcon("grafika/biale.png"));
        z13.setBounds(560,20,30,30);
        panel.add(z13);

        JLabel z14 = new JLabel();
        z14.setIcon(new ImageIcon("grafika/czarne.png"));
        z14.setBounds(590,20,30,30);
        panel.add(z14);

        JLabel z15 = new JLabel();
        z15.setIcon(new ImageIcon("grafika/czarne.png"));
        z15.setBounds(620,20,30,30);
        panel.add(z15);

        JLabel z16 = new JLabel();
        z16.setIcon(new ImageIcon("grafika/biale.png"));
        z16.setBounds(660,20,30,30);
        panel.add(z16);

        JLabel z17 = new JLabel();
        z17.setIcon(new ImageIcon("grafika/czarne.png"));
        z17.setBounds(690,20,30,30);
        panel.add(z17);

        JLabel z18 = new JLabel();
        z18.setIcon(new ImageIcon("grafika/biale.png"));
        z18.setBounds(720,20,30,30);
        panel.add(z18);

        JLabel z19 = new JLabel();
        z19.setIcon(new ImageIcon("grafika/biale.png"));
        z19.setBounds(760,20,30,30);
        panel.add(z19);

        JLabel z20 = new JLabel();
        z20.setIcon(new ImageIcon("grafika/biale.png"));
        z20.setBounds(790,20,30,30);
        panel.add(z20);

        JLabel z21 = new JLabel();
        z21.setIcon(new ImageIcon("grafika/czarne.png"));
        z21.setBounds(820,20,30,30);
        panel.add(z21);

        JLabel z22 = new JLabel();
        z22.setIcon(new ImageIcon("grafika/biale.png"));
        z22.setBounds(860,20,30,30);
        panel.add(z22);

        JLabel z23 = new JLabel();
        z23.setIcon(new ImageIcon("grafika/biale.png"));
        z23.setBounds(890,20,30,30);
        panel.add(z23);

        JLabel z24 = new JLabel();
        z24.setIcon(new ImageIcon("grafika/biale.png"));
        z24.setBounds(920,20,30,30);
        panel.add(z24);

        JLabel zasada1 = new JLabel();
        zasada1.setIcon(new ImageIcon("grafika/biale.png"));
        zasada1.setBounds(190,60,30,30);
        panel.add(zasada1);

        JLabel zasada2 = new JLabel();
        zasada2.setIcon(new ImageIcon("grafika/biale.png"));
        zasada2.setBounds(290,60,30,30);
        panel.add(zasada2);

        JLabel zasada3 = new JLabel();
        zasada3.setIcon(new ImageIcon("grafika/biale.png"));
        zasada3.setBounds(390,60,30,30);
        panel.add(zasada3);

        JLabel zasada4 = new JLabel();
        zasada4.setIcon(new ImageIcon("grafika/biale.png"));
        zasada4.setBounds(490,60,30,30);
        panel.add(zasada4);

        JLabel zasada5 = new JLabel();
        zasada5.setIcon(new ImageIcon("grafika/biale.png"));
        zasada5.setBounds(590,60,30,30);
        panel.add(zasada5);

        JLabel zasada6 = new JLabel();
        zasada6.setIcon(new ImageIcon("grafika/biale.png"));
        zasada6.setBounds(690,60,30,30);
        panel.add(zasada6);

        JLabel zasada7 = new JLabel();
        zasada7.setIcon(new ImageIcon("grafika/biale.png"));
        zasada7.setBounds(790,60,30,30);
        panel.add(zasada7);

        JLabel zasada8 = new JLabel();
        zasada8.setIcon(new ImageIcon("grafika/biale.png"));
        zasada8.setBounds(890,60,30,30);
        panel.add(zasada8);


        zasada1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas1 == 0){
                    zasada1.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas1=1;
                }
                else {
                    zasada1.setIcon(new ImageIcon("grafika/biale.png"));
                    zas1=0;
                }
            }
        });

        zasada2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas2 == 0){
                    zasada2.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas2=1;
                }
                else {
                    zasada2.setIcon(new ImageIcon("grafika/biale.png"));
                    zas2=0;
                }
            }
        });

        zasada3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas3 == 0){
                    zasada3.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas3=1;
                }
                else {
                    zasada3.setIcon(new ImageIcon("grafika/biale.png"));
                    zas3=0;
                }
            }
        });

        zasada4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas4 == 0){
                    zasada4.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas4=1;
                }
                else {
                    zasada4.setIcon(new ImageIcon("grafika/biale.png"));
                    zas4=0;
                }
            }
        });

        zasada5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas5 == 0){
                    zasada5.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas5=1;
                }
                else {
                    zasada5.setIcon(new ImageIcon("grafika/biale.png"));
                    zas5=0;
                }
            }
        });

        zasada6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas6 == 0){
                    zasada6.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas6=1;
                }
                else {
                    zasada6.setIcon(new ImageIcon("grafika/biale.png"));
                    zas6=0;
                }
            }
        });

        zasada7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas7 == 0){
                    zasada7.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas7=1;
                }
                else {
                    zasada7.setIcon(new ImageIcon("grafika/biale.png"));
                    zas7=0;
                }
            }
        });

        zasada8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(zas8 == 0){
                    zasada8.setIcon(new ImageIcon("grafika/czarne.png"));
                    zas8=1;
                }
                else {
                    zasada8.setIcon(new ImageIcon("grafika/biale.png"));
                    zas8=0;
                }
            }
        });

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                panel.removeAll();

                tablica[0][47]=1;
                for(int i=1 ; i<48; i++){
                    for(int j = 1; j<94; j++){
                       if(tablica[i-1][j]==1 && tablica[i-1][j-1]==1 && tablica[i-1][j+1]==1)tablica[i][j]=zas1;
                       else if(tablica[i-1][j]==1 && tablica[i-1][j-1]==1 && tablica[i-1][j+1]==0)tablica[i][j]=zas2;
                       else if(tablica[i-1][j]==0 && tablica[i-1][j-1]==1 && tablica[i-1][j+1]==1)tablica[i][j]=zas3;
                       else if(tablica[i-1][j]==0 && tablica[i-1][j-1]==1 && tablica[i-1][j+1]==0)tablica[i][j]=zas4;
                       else if(tablica[i-1][j]==1 && tablica[i-1][j-1]==0 && tablica[i-1][j+1]==1)tablica[i][j]=zas5;
                       else if(tablica[i-1][j]==1 && tablica[i-1][j-1]==0 && tablica[i-1][j+1]==0)tablica[i][j]=zas6;
                       else if(tablica[i-1][j]==0 && tablica[i-1][j-1]==0 && tablica[i-1][j+1]==1)tablica[i][j]=zas7;
                       else tablica[i][j]=zas8;
                    }
                }



                x=20;
                y=190;

                for(int i=0 ; i<48; i++){
                    for(int j = 1; j<94; j++){
                        JLabel pole = new JLabel();
                        if(tablica[i][j]==1)pole.setIcon(new ImageIcon("grafika/czarne10.png"));
                        else pole.setIcon(new ImageIcon("grafika/biale10.png"));
                        pole.setBounds(x, y,10,10);
                        x+=10;
                        panel.add(pole);
                    }
                    x =20;
                    y+=10;
                }

                panel.add(z1);
                panel.add(z2);
                panel.add(z3);
                panel.add(z4);
                panel.add(z5);
                panel.add(z6);
                panel.add(z7);
                panel.add(z8);
                panel.add(z9);
                panel.add(z10);
                panel.add(z11);
                panel.add(z12);
                panel.add(z13);
                panel.add(z14);
                panel.add(z15);
                panel.add(z16);
                panel.add(z17);
                panel.add(z18);
                panel.add(z19);
                panel.add(z20);
                panel.add(z21);
                panel.add(z22);
                panel.add(z23);
                panel.add(z24);
                panel.add(zasady);
                panel.add(start);
                panel.add(zasada1);
                panel.add(zasada2);
                panel.add(zasada3);
                panel.add(zasada4);
                panel.add(zasada5);
                panel.add(zasada6);
                panel.add(zasada7);
                panel.add(zasada8);
                panel.repaint();
            }
        });


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
