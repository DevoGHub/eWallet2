import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devjy
 */
public class loginPage extends javax.swing.JFrame {
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
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
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
        //jButton2.setBackground(btnBgColor); //Activate when required
        
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
        loginPanel.setBackground(activeColor);
        forgotPasswordPanel.setBackground(exitColor);
        exitPanel.setBackground(exitColor);
        signupPanel.setBackground(exitColor);
        
            //mainPanel Content
        jLabel1.setForeground(labelColor);
        jLabel2.setForeground(labelColor);
        username_tf.setBackground(textfieldBgColor);
        password_pf.setBackground(textfieldBgColor);
        username_tf.setForeground(textfieldFgColor);
        password_pf.setForeground(textfieldFgColor);
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
        username_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
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
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1060, 720));
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
                .addContainerGap(472, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password");

        jButton1.setBackground(new java.awt.Color(234, 195, 168));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Log In");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(password_pf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(411, 411, 411))
        );

        sidePanel.setBackground(new java.awt.Color(53, 12, 3));
        sidePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        loginPanel.setBackground(new java.awt.Color(97, 34, 21));
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

        forgotPasswordPanel.setBackground(new java.awt.Color(77, 14, 1));
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
                .addGap(437, 437, 437))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //will login to home screen

        // gathering info from the filled up form
        String username1=username_tf.getText();
        String password1=new String(password_pf.getPassword());
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con;
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");

            Statement smt=(Statement)con.createStatement(); //select query from customer_deails
            String query="Select * from customer_details where username='"+username1+"';";
            ResultSet rs=smt.executeQuery(query);

            if (!rs.isBeforeFirst()) //conditon 1: to check if username exists or not
            {
                JOptionPane.showMessageDialog(null,"Please enter correct username");
                username_tf.setText("");
            }
            else //'else' for condition 1
            {
                while(rs.next())
                {
                    String password2=rs.getString("password");
                    if (password1.equals(password2)) //condtion 2: 'if' to check if the  password is correct or not
                    {
                        new accountOverviewPage(username1).setVisible(true);
                        this.setVisible(false);
                    }
                    else //'else' for condition 2
                    {
                        JOptionPane.showMessageDialog(null, "Please enter correct password");
                        password_pf.setText("");
                    }
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseClicked
//will clear the form

username_tf.setText("");
password_pf.setText("");
    }//GEN-LAST:event_loginPanelMouseClicked

    private void signupPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupPanelMouseClicked
new signupPage().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_signupPanelMouseClicked

    private void forgotPasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordPanelMouseClicked
new forgotPasswordPage().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_forgotPasswordPanelMouseClicked

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
loginPanel.setBackground(activeColor);
    }//GEN-LAST:event_loginPanelMouseExited

    private void forgotPasswordPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordPanelMouseExited
forgotPasswordPanel.setBackground(exitColor);
    }//GEN-LAST:event_forgotPasswordPanelMouseExited

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
exitPanel.setBackground(exitColor);
    }//GEN-LAST:event_exitPanelMouseExited

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
//jButton2.setBackground(btnBgColor); //Activate when required

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
loginPanel.setBackground(activeColor);
forgotPasswordPanel.setBackground(exitColor);
exitPanel.setBackground(exitColor);
signupPanel.setBackground(exitColor);

    //mainPanel Content
jLabel1.setForeground(labelColor);
jLabel2.setForeground(labelColor);
username_tf.setBackground(textfieldBgColor);
password_pf.setBackground(textfieldBgColor);
username_tf.setForeground(textfieldFgColor);
password_pf.setForeground(textfieldFgColor);
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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitIconLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel forgotPasswordIconLabel;
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JPanel forgotPasswordPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginIconLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel signupIconLabel;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
