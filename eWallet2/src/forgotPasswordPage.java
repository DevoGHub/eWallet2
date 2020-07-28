import java.sql.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devjy
 */
public class forgotPasswordPage extends javax.swing.JFrame {
String flagUser="";
//common
int theme;
themeClass themeObj=new themeClass();
Color hoverColor=new Color(122,43,16);
Color activeColor=new Color(97,34,21);
Color exitColor=new Color(77,14,1);
Color naviLabel;
Color naviPanelBgColor;
Color mainPanelBgColor;
Color logoPanelColor;
Color logoColor;
Color textfieldBgColor;
Color textfieldFgColor;
Color labelColor;
Color btnBgColor;

//Level 1
ImageIcon signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_0.png"));
ImageIcon loginIcon=new ImageIcon(getClass().getResource("/imgs/login_0.png"));
ImageIcon forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_0.png"));
ImageIcon exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_0.png"));
    /**
     * Creates new form forgotPasswordPage
     */
    public forgotPasswordPage() {
        initComponents();
        new_pf.setVisible(false);
        confirm_pf.setVisible(false);
        jButton2.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        theme=themeObj.getPref();
        switch(theme)
        {
            case 0:
            {
                //Common
                hoverColor=new Color(122,43,16);
                activeColor=new Color(97,34,21);
                exitColor=new Color(77,14,1);
                naviLabel=new Color(225,198,193);
                naviPanelBgColor=new Color(53,12,3);
                mainPanelBgColor=new Color(143,125,122);
                logoPanelColor=new Color(166,49,24);
                logoColor=new Color(215,178,173);
                textfieldBgColor=new Color(255,255,255);
                labelColor=new Color(0,0,0);
                btnBgColor=new Color(234,195,168);
                textfieldFgColor=new Color(0,0,0);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_0.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_0.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_0.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_0.png"));
            }
            break;
            case 1:
            {
                //Common
                hoverColor=new Color(165,205,66);
                activeColor=new Color(147,184,0);
                exitColor=new Color(184,225,6);
                naviLabel=new Color(23,118,5);
                naviPanelBgColor=new Color(145,204,0);
                mainPanelBgColor=new Color(160,205,0);
                logoPanelColor=new Color(105,174,6);
                logoColor=new Color(209,206,101);
                textfieldBgColor=new Color(255,255,255);
                labelColor=new Color(0,0,0);
                btnBgColor=new Color(185,202,60);
                textfieldFgColor=new Color(0,0,0);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_1.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_1.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_1.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_1.png"));
            }
            break;
            case 2:
            {
                //Common
                hoverColor=new Color(145,135,120);
                activeColor=new Color(75,75,75);
                exitColor=new Color(90,90,90);
                naviLabel=new Color(250,230,170);
                naviPanelBgColor=new Color(20,20,20);
                mainPanelBgColor=new Color(50,50,50);
                logoPanelColor=new Color(100,100,105);
                logoColor=new Color(225,188,140);
                textfieldBgColor=new Color(100,100,100);
                labelColor=new Color(255,255,255);
                btnBgColor=new Color(140,130,100);
                textfieldFgColor=new Color(185,190,170);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_2.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_2.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_2.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_2.png"));
            }
            break;
            case 3:
            {
                //Common
                hoverColor=new Color(82,133,106);
                activeColor=new Color(5, 151, 9);
                exitColor=new Color(7, 125, 10);
                naviLabel=new Color(255,188,153);
                naviPanelBgColor=new Color(196, 14, 14);
                mainPanelBgColor=new Color(224, 53, 50);
                logoPanelColor=new Color(36,119,40);
                logoColor=new Color(235,138,123);
                textfieldBgColor=new Color(255,255,255);
                labelColor=new Color(30, 89, 4);
                btnBgColor=new Color(0,180,0);
                textfieldFgColor=new Color(53, 130, 43);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_3.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_3.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_3.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_3.png"));
            }
            break;
            case 4:
            {
                //Common
                hoverColor=new Color(0,0,0);
                activeColor=new Color(134, 23, 99);
                exitColor=new Color(200, 19, 142);
                naviLabel=new Color(255,255,255);
                naviPanelBgColor=new Color(244, 50, 182);
                mainPanelBgColor=new Color(225, 0, 170);
                logoPanelColor=new Color(35,35,35);
                logoColor=new Color(235,225,225);
                textfieldBgColor=new Color(215,215,215);
                labelColor=new Color(0,0,0);
                btnBgColor=new Color(175, 89, 169);
                textfieldFgColor=new Color(171, 9, 137);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_4.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_4.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_4.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_4.png"));
            }
            break;
            default:
            {
                //Common
                hoverColor=new Color(122,43,16);
                activeColor=new Color(97,34,21);
                exitColor=new Color(77,14,1);
                naviLabel=new Color(225,198,193);
                naviPanelBgColor=new Color(53,12,3);
                mainPanelBgColor=new Color(143,125,122);
                logoPanelColor=new Color(166,49,24);
                logoColor=new Color(215,178,173);
                textfieldBgColor=new Color(255,255,255);
                labelColor=new Color(0,0,0);
                btnBgColor=new Color(234,195,168);
                textfieldFgColor=new Color(0,0,0);
                
                //Level 1
                signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_0.png"));
                loginIcon=new ImageIcon(getClass().getResource("/imgs/login_0.png"));
                forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_0.png"));
                exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_0.png"));
            }
        }
        //common
        logoLabel.setForeground(logoColor);
        logoPanel.setBackground(logoPanelColor);
        mainPanel.setBackground(mainPanelBgColor);
        sidePanel.setBackground(naviPanelBgColor);
        jButton1.setBackground(btnBgColor); //Activate when required
        jButton2.setBackground(btnBgColor); //Activate when required
        
        //Level 1
        signupIconLabel.setIcon(signupIcon);
        loginIconLabel.setIcon(loginIcon);
        forgotPasswordIconLabel.setIcon(forgotPasswordIcon);
        exitIconLabel.setIcon(exitIcon);
        signupLabel.setForeground(naviLabel);
        loginLabel.setForeground(naviLabel);
        forgotPasswordLabel.setForeground(naviLabel);
        exitLabel.setForeground(naviLabel);
        
        //Indiv
            //sidePanel Content
        loginPanel.setBackground(exitColor);
        forgotPasswordPanel.setBackground(activeColor);
        exitPanel.setBackground(exitColor);
        signupPanel.setBackground(exitColor);
        
            //mainPanel Content
        jLabel1.setForeground(labelColor);
        jLabel2.setForeground(labelColor);
        jLabel3.setForeground(labelColor);
        jLabel4.setForeground(labelColor);
        jLabel5.setForeground(labelColor);
        jLabel6.setForeground(labelColor);
        you_tf.setBackground(textfieldBgColor);
        city_tf.setBackground(textfieldBgColor);
        animal_tf.setBackground(textfieldBgColor);
        sport_tf.setBackground(textfieldBgColor);
        new_pf.setBackground(textfieldBgColor);
        confirm_pf.setBackground(textfieldBgColor);
        you_tf.setForeground(textfieldFgColor);
        city_tf.setForeground(textfieldFgColor);
        animal_tf.setForeground(textfieldFgColor);
        sport_tf.setForeground(textfieldFgColor);
        new_pf.setForeground(textfieldFgColor);
        confirm_pf.setForeground(textfieldFgColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        you_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        city_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sport_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        animal_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        new_pf = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        confirm_pf = new javax.swing.JPasswordField();
        sidePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginIconLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        signupPanel = new javax.swing.JPanel();
        signupIconLabel = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        forgotPasswordPanel = new javax.swing.JPanel();
        forgotPasswordIconLabel = new javax.swing.JLabel();
        forgotPasswordLabel = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitIconLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(143, 125, 122));

        logoPanel.setBackground(new java.awt.Color(166, 49, 24));
        logoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        logoPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoPanelMouseClicked(evt);
            }
        });

        logoLabel.setBackground(new java.awt.Color(215, 178, 173));
        logoLabel.setFont(new java.awt.Font("Segoe Script", 3, 48)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(215, 178, 173));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logoLabel.setText("PayZZ");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(98, 98, 98))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Username");

        you_tf.setPreferredSize(new java.awt.Dimension(485, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Your Favourite City");

        city_tf.setPreferredSize(new java.awt.Dimension(485, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Your Favourite Sport");

        sport_tf.setPreferredSize(new java.awt.Dimension(485, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Your Favourite Animal");

        animal_tf.setPreferredSize(new java.awt.Dimension(485, 27));

        jButton1.setBackground(new java.awt.Color(234, 195, 168));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Verify User");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("New Password");

        new_pf.setPreferredSize(new java.awt.Dimension(485, 27));

        jButton2.setBackground(new java.awt.Color(234, 195, 168));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Reset Password");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Confirm Password");

        confirm_pf.setPreferredSize(new java.awt.Dimension(485, 27));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(you_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sport_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(animal_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(new_pf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirm_pf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(you_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(city_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sport_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(animal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(new_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(confirm_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(53, 12, 3));
        sidePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        loginPanel.setBackground(new java.awt.Color(77, 14, 1));
        loginPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        loginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginPanelMouseExited(evt);
            }
        });

        loginIconLabel.setBackground(new java.awt.Color(97, 34, 21));
        loginIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login_0.png"))); // NOI18N

        loginLabel.setForeground(new java.awt.Color(225, 198, 193));
        loginLabel.setText("Login");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        signupPanel.setBackground(new java.awt.Color(77, 14, 1));
        signupPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        signupPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupPanelMouseExited(evt);
            }
        });

        signupIconLabel.setBackground(new java.awt.Color(250, 250, 250));
        signupIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/signup_0.png"))); // NOI18N

        signupLabel.setForeground(new java.awt.Color(225, 198, 193));
        signupLabel.setText("Sign Up");

        javax.swing.GroupLayout signupPanelLayout = new javax.swing.GroupLayout(signupPanel);
        signupPanel.setLayout(signupPanelLayout);
        signupPanelLayout.setHorizontalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(signupIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        signupPanelLayout.setVerticalGroup(
            signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signupIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(signupLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        forgotPasswordPanel.setBackground(new java.awt.Color(97, 34, 21));
        forgotPasswordPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        forgotPasswordPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordPanelMouseExited(evt);
            }
        });

        forgotPasswordIconLabel.setBackground(new java.awt.Color(250, 250, 250));
        forgotPasswordIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/forgot password_0.png"))); // NOI18N

        forgotPasswordLabel.setForeground(new java.awt.Color(225, 198, 193));
        forgotPasswordLabel.setText("Forgot Password");

        javax.swing.GroupLayout forgotPasswordPanelLayout = new javax.swing.GroupLayout(forgotPasswordPanel);
        forgotPasswordPanel.setLayout(forgotPasswordPanelLayout);
        forgotPasswordPanelLayout.setHorizontalGroup(
            forgotPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPasswordPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(forgotPasswordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(forgotPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forgotPasswordPanelLayout.setVerticalGroup(
            forgotPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPasswordPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(forgotPasswordIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(forgotPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        exitPanel.setBackground(new java.awt.Color(77, 14, 1));
        exitPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPanelMouseExited(evt);
            }
        });

        exitIconLabel.setBackground(new java.awt.Color(250, 250, 250));
        exitIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit_0.png"))); // NOI18N

        exitLabel.setForeground(new java.awt.Color(225, 198, 193));
        exitLabel.setText("Exit");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(exitIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(forgotPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(forgotPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseClicked
new signupPage().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_signupPanelMouseClicked

    private void loginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseClicked
new loginPage().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_loginPanelMouseClicked

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
System.exit(0);
    }//GEN-LAST:event_exitPanelMouseClicked

    private void signupPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseEntered
signupPanel.setBackground(hoverColor);
    }//GEN-LAST:event_signupPanelMouseEntered

    private void loginPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseEntered
loginPanel.setBackground(hoverColor);
    }//GEN-LAST:event_loginPanelMouseEntered

    private void forgotPasswordPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordPanelMouseEntered
forgotPasswordPanel.setBackground(hoverColor);
    }//GEN-LAST:event_forgotPasswordPanelMouseEntered

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
exitPanel.setBackground(hoverColor);
    }//GEN-LAST:event_exitPanelMouseEntered

    private void signupPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseExited
signupPanel.setBackground(exitColor);
    }//GEN-LAST:event_signupPanelMouseExited

    private void loginPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseExited
loginPanel.setBackground(exitColor);
    }//GEN-LAST:event_loginPanelMouseExited

    private void forgotPasswordPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordPanelMouseExited
forgotPasswordPanel.setBackground(activeColor);
    }//GEN-LAST:event_forgotPasswordPanelMouseExited

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
exitPanel.setBackground(exitColor);
    }//GEN-LAST:event_exitPanelMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //to verify user and the recovery quetions match up

        String username=you_tf.getText();
        String city=city_tf.getText();
        String sport=sport_tf.getText();
        String animal=animal_tf.getText();

        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con;
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            Statement smt1=(Statement)con.createStatement();
            String query1="Select * from recovery where username='"+username+"';";
            ResultSet rs=smt1.executeQuery(query1);
            if(!rs.isBeforeFirst())
            {
                JOptionPane.showMessageDialog(this, "Please provide correct username.");
                you_tf.setText("");
            }
            else
            {
                while(rs.next())
                {
                    String q1=rs.getString("q1");
                    String q2=rs.getString("q2");
                    String q3=rs.getString("q3");

                    if(q1.equals(city) && q2.equals(sport) && q3.equals(animal)) //conditon 1: checking the recovery answers
                    {
                        jButton1.setVisible(false);
                        animal_tf.setVisible(false);
                        sport_tf.setVisible(false);
                        city_tf.setVisible(false);
                        you_tf.setVisible(false);
                        jLabel2.setVisible(false);
                        jLabel3.setVisible(false);
                        jLabel4.setVisible(false);
                        jLabel1.setVisible(false);
                        new_pf.setVisible(true);
                        confirm_pf.setVisible(true);
                        new_pf.setVisible(true);
                        confirm_pf.setVisible(true);
                        jButton2.setVisible(true);
                        jLabel5.setVisible(true);
                        jLabel6.setVisible(true);
                        flagUser=username;
                    }
                    else //else for conditon 1
                    {
                        JOptionPane.showMessageDialog(null, "Please enter correct recovery answers.");
                    }
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //will allow user to reset password

        String username=flagUser;
        String password_new=new String(new_pf.getPassword());
        String password_confirm=new String(confirm_pf.getPassword());

        if(password_new.length()>6) //conditon 1:making sure password is long enough
        {
            if(password_new.equals(password_confirm)) //conditon 2:confirm password
            {
                try
                {
                    Class.forName("java.sql.DriverManager");
                    Connection con;
                    con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
                    Statement smt=(Statement)con.createStatement();
                    String query="Update customer_details set password='"+password_new+"' where username='"+username+"';";
                    smt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Your password has successfully been reset. Press 'ok' or 'x' to continue to sign in page.");
                    new loginPage().setVisible(true);
                    this.setVisible(false);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "New password and confirmed password do not match");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please choose a longer password.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void forgotPasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordPanelMouseClicked
jButton1.setVisible(true);
animal_tf.setVisible(true);
sport_tf.setVisible(true);
city_tf.setVisible(true);
you_tf.setVisible(true);
jLabel2.setVisible(true);
jLabel3.setVisible(true);
jLabel4.setVisible(true);
jLabel1.setVisible(true);
new_pf.setVisible(false);
confirm_pf.setVisible(false);
new_pf.setVisible(false);
confirm_pf.setVisible(false);
jButton2.setVisible(false);
jLabel5.setVisible(false);
jLabel6.setVisible(false);
you_tf.setText("");
animal_tf.setText("");
sport_tf.setText("");
city_tf.setText("");
new_pf.setText("");
confirm_pf.setText("");
flagUser="";
    }//GEN-LAST:event_forgotPasswordPanelMouseClicked

    private void logoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoPanelMouseClicked
if(theme>=4 || theme<=-1)
{
    theme=0;
}
else
{
    theme++;
}
themeObj.setPref(theme);
switch(theme)
{
    case 0:
    {
        //Common
        hoverColor=new Color(122,43,16);
        activeColor=new Color(97,34,21);
        exitColor=new Color(77,14,1);
        naviLabel=new Color(225,198,193);
        naviPanelBgColor=new Color(53,12,3);
        mainPanelBgColor=new Color(143,125,122);
        logoPanelColor=new Color(166,49,24);
        logoColor=new Color(215,178,173);
        textfieldBgColor=new Color(255,255,255);
        labelColor=new Color(0,0,0);
        btnBgColor=new Color(234,195,168);
        textfieldFgColor=new Color(0,0,0);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_0.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_0.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_0.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_0.png"));
    }
    break;
    case 1:
    {
        //Common
        hoverColor=new Color(165,205,66);
        activeColor=new Color(147,184,0);
        exitColor=new Color(184,225,6);
        naviLabel=new Color(23,118,5);
        naviPanelBgColor=new Color(145,204,0);
        mainPanelBgColor=new Color(160,205,0);
        logoPanelColor=new Color(105,174,6);
        logoColor=new Color(209,206,101);
        textfieldBgColor=new Color(255,255,255);
        labelColor=new Color(0,0,0);
        btnBgColor=new Color(185,202,60);
        textfieldFgColor=new Color(0,0,0);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_1.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_1.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_1.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_1.png"));
    }
    break;
    case 2:
    {
        //Common
        hoverColor=new Color(145,135,120);
        activeColor=new Color(75,75,75);
        exitColor=new Color(90,90,90);
        naviLabel=new Color(250,230,170);
        naviPanelBgColor=new Color(20,20,20);
        mainPanelBgColor=new Color(50,50,50);
        logoPanelColor=new Color(100,100,105);
        logoColor=new Color(225,188,140);
        textfieldBgColor=new Color(100,100,100);
        labelColor=new Color(255,255,255);
        btnBgColor=new Color(140,130,100);
        textfieldFgColor=new Color(185,190,170);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_2.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_2.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_2.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_2.png"));
    }
    break;
    case 3:
    {
        //Common
        hoverColor=new Color(82,133,106);
        activeColor=new Color(5, 151, 9);
        exitColor=new Color(7, 125, 10);
        naviLabel=new Color(255,188,153);
        naviPanelBgColor=new Color(196, 14, 14);
        mainPanelBgColor=new Color(224, 53, 50);
        logoPanelColor=new Color(36,119,40);
        logoColor=new Color(235,138,123);
        textfieldBgColor=new Color(255,255,255);
        labelColor=new Color(30, 89, 4);
        btnBgColor=new Color(0,180,0);
        textfieldFgColor=new Color(53, 130, 43);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_3.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_3.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_3.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_3.png"));
    }
    break;
    case 4:
    {
        //Common
        hoverColor=new Color(0,0,0);
        activeColor=new Color(134, 23, 99);
        exitColor=new Color(200, 19, 142);
        naviLabel=new Color(255,255,255);
        naviPanelBgColor=new Color(244, 50, 182);
        mainPanelBgColor=new Color(225, 0, 170);
        logoPanelColor=new Color(35,35,35);
        logoColor=new Color(235,225,225);
        textfieldBgColor=new Color(215,215,215);
        labelColor=new Color(0,0,0);
        btnBgColor=new Color(175, 89, 169);
        textfieldFgColor=new Color(171, 9, 137);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_4.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_4.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_4.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_4.png"));
    }
    break;
    default:
    {
        //Common
        hoverColor=new Color(122,43,16);
        activeColor=new Color(97,34,21);
        exitColor=new Color(77,14,1);
        naviLabel=new Color(225,198,193);
        naviPanelBgColor=new Color(53,12,3);
        mainPanelBgColor=new Color(143,125,122);
        logoPanelColor=new Color(166,49,24);
        logoColor=new Color(215,178,173);
        textfieldBgColor=new Color(255,255,255);
        labelColor=new Color(0,0,0);
        btnBgColor=new Color(234,195,168);
        textfieldFgColor=new Color(0,0,0);

        //Level 1
        signupIcon=new ImageIcon(getClass().getResource("/imgs/signup_0.png"));
        loginIcon=new ImageIcon(getClass().getResource("/imgs/login_0.png"));
        forgotPasswordIcon=new ImageIcon(getClass().getResource("/imgs/forgot password_0.png"));
        exitIcon=new ImageIcon(getClass().getResource("/imgs/exit_0.png"));
    }
}
//common
logoLabel.setForeground(logoColor);
logoPanel.setBackground(logoPanelColor);
mainPanel.setBackground(mainPanelBgColor);
sidePanel.setBackground(naviPanelBgColor);
jButton1.setBackground(btnBgColor); //Activate when required
jButton2.setBackground(btnBgColor); //Activate when required

//Level 1
signupIconLabel.setIcon(signupIcon);
loginIconLabel.setIcon(loginIcon);
forgotPasswordIconLabel.setIcon(forgotPasswordIcon);
exitIconLabel.setIcon(exitIcon);
signupLabel.setForeground(naviLabel);
loginLabel.setForeground(naviLabel);
forgotPasswordLabel.setForeground(naviLabel);
exitLabel.setForeground(naviLabel);

//Indiv
    //sidePanel Content
loginPanel.setBackground(exitColor);
forgotPasswordPanel.setBackground(activeColor);
exitPanel.setBackground(exitColor);
signupPanel.setBackground(exitColor);

    //mainPanel Content
jLabel1.setForeground(labelColor);
jLabel2.setForeground(labelColor);
jLabel3.setForeground(labelColor);
jLabel4.setForeground(labelColor);
jLabel5.setForeground(labelColor);
jLabel6.setForeground(labelColor);
you_tf.setBackground(textfieldBgColor);
city_tf.setBackground(textfieldBgColor);
animal_tf.setBackground(textfieldBgColor);
sport_tf.setBackground(textfieldBgColor);
new_pf.setBackground(textfieldBgColor);
confirm_pf.setBackground(textfieldBgColor);
you_tf.setForeground(textfieldFgColor);
city_tf.setForeground(textfieldFgColor);
animal_tf.setForeground(textfieldFgColor);
sport_tf.setForeground(textfieldFgColor);
new_pf.setForeground(textfieldFgColor);
confirm_pf.setForeground(textfieldFgColor);
    }//GEN-LAST:event_logoPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPasswordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPasswordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField animal_tf;
    private javax.swing.JTextField city_tf;
    private javax.swing.JPasswordField confirm_pf;
    private javax.swing.JLabel exitIconLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel forgotPasswordIconLabel;
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JPanel forgotPasswordPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loginIconLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField new_pf;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel signupIconLabel;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JTextField sport_tf;
    private javax.swing.JTextField you_tf;
    // End of variables declaration//GEN-END:variables
}
