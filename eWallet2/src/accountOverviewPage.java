import java.sql.*;
import java.awt.Color;
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
public class accountOverviewPage extends javax.swing.JFrame {
String flagUsername="";
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
    /**
     * Creates new form accountOverviewPage
     */
    public accountOverviewPage() {
        initComponents();
    }
    
    public accountOverviewPage(String username) {
        initComponents();
        flagUsername=username;
        jLabel1.setText("Hi, "+flagUsername);
        try
        { 
         Class.forName("java.sql.DriverManager");
         Connection con;
         con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");

         Statement smt=(Statement)con.createStatement();
         String query= "Select * from user_account where username='"+username+"';";
         ResultSet rs= smt.executeQuery(query);

         while(rs.next())
         {
          int amount=rs.getInt("amount");
          account_balance_tf.setText(""+amount); //set user account balance in respective tf
         }
        }
        catch (Exception e)
        {
         JOptionPane.showMessageDialog(this, e.getMessage());       
        } 
        
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
            }
        }
        //common
        logoLabel.setForeground(logoColor);
        logoPanel.setBackground(logoPanelColor);
        mainPanel.setBackground(mainPanelBgColor);
        sidePanel.setBackground(naviPanelBgColor);
        jButton1.setBackground(btnBgColor); //Activate when required
        //jButton2.setBackground(btnBgColor); //Activate when required
        
        //Level 2
        accountOverviewLabel.setForeground(naviLabel);
        viewPassbookLabel.setForeground(naviLabel);
        changePasswordLabel.setForeground(naviLabel);
        changeRecoveryAnswersLabel.setForeground(naviLabel);
        addMoneyLabel.setForeground(naviLabel);
        logoutLabel.setForeground(naviLabel);
        jLabel1.setForeground(labelColor);
        
        //Indiv
            //sidePanel content
        accountOverviewPanel.setBackground(activeColor);
        viewPassbookPanel.setBackground(exitColor);
        addMoneyPanel.setBackground(exitColor);
        changePasswordPanel.setBackground(exitColor);
        changeRecoveryAnswersPanel.setBackground(exitColor);
        logoutPanel.setBackground(exitColor);
            
            //mainPanel content
        jLabel2.setForeground(labelColor);
        jLabel3.setForeground(labelColor);
        jLabel4.setForeground(labelColor);
        confirm_cb.setForeground(labelColor);
        account_balance_tf.setBackground(textfieldBgColor);
        username_tf.setBackground(textfieldBgColor);
        amount_tf.setBackground(textfieldBgColor);
        account_balance_tf.setForeground(textfieldFgColor);
        username_tf.setForeground(textfieldFgColor);
        amount_tf.setForeground(textfieldFgColor);
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
        jLabel2 = new javax.swing.JLabel();
        account_balance_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount_tf = new javax.swing.JTextField();
        confirm_cb = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        viewPassbookPanel = new javax.swing.JPanel();
        viewPassbookLabel = new javax.swing.JLabel();
        accountOverviewPanel = new javax.swing.JPanel();
        accountOverviewLabel = new javax.swing.JLabel();
        addMoneyPanel = new javax.swing.JPanel();
        addMoneyLabel = new javax.swing.JLabel();
        changePasswordPanel = new javax.swing.JPanel();
        changePasswordLabel = new javax.swing.JLabel();
        changeRecoveryAnswersPanel = new javax.swing.JPanel();
        changeRecoveryAnswersLabel = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();

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
                .addContainerGap(473, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Hi, ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Account Balance");

        account_balance_tf.setEditable(false);
        account_balance_tf.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Send Money To");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Amount To Be Sent");

        confirm_cb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirm_cb.setText("I Have Confirmed The Amount To Be Sent And The Username Mentioned");

        jButton1.setBackground(new java.awt.Color(234, 195, 168));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Pay/Send");
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
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(account_balance_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(username_tf)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount_tf))
                    .addComponent(confirm_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(account_balance_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amount_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_cb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(53, 12, 3));
        sidePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        viewPassbookPanel.setBackground(new java.awt.Color(77, 14, 1));
        viewPassbookPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        viewPassbookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPassbookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPassbookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewPassbookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewPassbookPanelMouseExited(evt);
            }
        });

        viewPassbookLabel.setForeground(new java.awt.Color(225, 198, 193));
        viewPassbookLabel.setText("View Passbook");

        javax.swing.GroupLayout viewPassbookPanelLayout = new javax.swing.GroupLayout(viewPassbookPanel);
        viewPassbookPanel.setLayout(viewPassbookPanelLayout);
        viewPassbookPanelLayout.setHorizontalGroup(
            viewPassbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPassbookPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewPassbookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        viewPassbookPanelLayout.setVerticalGroup(
            viewPassbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPassbookPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewPassbookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        accountOverviewPanel.setBackground(new java.awt.Color(97, 34, 21));
        accountOverviewPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        accountOverviewPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountOverviewPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountOverviewPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountOverviewPanelMouseExited(evt);
            }
        });

        accountOverviewLabel.setForeground(new java.awt.Color(225, 198, 193));
        accountOverviewLabel.setText("Account Overview");

        javax.swing.GroupLayout accountOverviewPanelLayout = new javax.swing.GroupLayout(accountOverviewPanel);
        accountOverviewPanel.setLayout(accountOverviewPanelLayout);
        accountOverviewPanelLayout.setHorizontalGroup(
            accountOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountOverviewPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(accountOverviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        accountOverviewPanelLayout.setVerticalGroup(
            accountOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountOverviewPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(accountOverviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addMoneyPanel.setBackground(new java.awt.Color(77, 14, 1));
        addMoneyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        addMoneyPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMoneyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMoneyPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMoneyPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMoneyPanelMouseExited(evt);
            }
        });

        addMoneyLabel.setForeground(new java.awt.Color(225, 198, 193));
        addMoneyLabel.setText("Add Money");

        javax.swing.GroupLayout addMoneyPanelLayout = new javax.swing.GroupLayout(addMoneyPanel);
        addMoneyPanel.setLayout(addMoneyPanelLayout);
        addMoneyPanelLayout.setHorizontalGroup(
            addMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMoneyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        addMoneyPanelLayout.setVerticalGroup(
            addMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        changePasswordPanel.setBackground(new java.awt.Color(77, 14, 1));
        changePasswordPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        changePasswordPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePasswordPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePasswordPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePasswordPanelMouseExited(evt);
            }
        });

        changePasswordLabel.setForeground(new java.awt.Color(225, 198, 193));
        changePasswordLabel.setText("Change Password");

        javax.swing.GroupLayout changePasswordPanelLayout = new javax.swing.GroupLayout(changePasswordPanel);
        changePasswordPanel.setLayout(changePasswordPanelLayout);
        changePasswordPanelLayout.setHorizontalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        changePasswordPanelLayout.setVerticalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        changeRecoveryAnswersPanel.setBackground(new java.awt.Color(77, 14, 1));
        changeRecoveryAnswersPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        changeRecoveryAnswersPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeRecoveryAnswersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeRecoveryAnswersPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeRecoveryAnswersPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeRecoveryAnswersPanelMouseExited(evt);
            }
        });

        changeRecoveryAnswersLabel.setForeground(new java.awt.Color(225, 198, 193));
        changeRecoveryAnswersLabel.setText("Change Recovery Answers");

        javax.swing.GroupLayout changeRecoveryAnswersPanelLayout = new javax.swing.GroupLayout(changeRecoveryAnswersPanel);
        changeRecoveryAnswersPanel.setLayout(changeRecoveryAnswersPanelLayout);
        changeRecoveryAnswersPanelLayout.setHorizontalGroup(
            changeRecoveryAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeRecoveryAnswersPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changeRecoveryAnswersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        changeRecoveryAnswersPanelLayout.setVerticalGroup(
            changeRecoveryAnswersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeRecoveryAnswersPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changeRecoveryAnswersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logoutPanel.setBackground(new java.awt.Color(77, 14, 1));
        logoutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutPanelMouseExited(evt);
            }
        });

        logoutLabel.setForeground(new java.awt.Color(225, 198, 193));
        logoutLabel.setText("Logout");

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewPassbookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addMoneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(changePasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(changeRecoveryAnswersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(accountOverviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewPassbookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addMoneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(changePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(changeRecoveryAnswersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void accountOverviewPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountOverviewPanelMouseEntered
accountOverviewPanel.setBackground(hoverColor);
    }//GEN-LAST:event_accountOverviewPanelMouseEntered

    private void viewPassbookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassbookPanelMouseEntered
viewPassbookPanel.setBackground(hoverColor);
    }//GEN-LAST:event_viewPassbookPanelMouseEntered

    private void addMoneyPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMoneyPanelMouseEntered
addMoneyPanel.setBackground(hoverColor);
    }//GEN-LAST:event_addMoneyPanelMouseEntered

    private void changePasswordPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordPanelMouseEntered
changePasswordPanel.setBackground(hoverColor);
    }//GEN-LAST:event_changePasswordPanelMouseEntered

    private void changeRecoveryAnswersPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeRecoveryAnswersPanelMouseEntered
changeRecoveryAnswersPanel.setBackground(hoverColor);
    }//GEN-LAST:event_changeRecoveryAnswersPanelMouseEntered

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
logoutPanel.setBackground(hoverColor);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void accountOverviewPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountOverviewPanelMouseExited
accountOverviewPanel.setBackground(activeColor);
    }//GEN-LAST:event_accountOverviewPanelMouseExited

    private void viewPassbookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassbookPanelMouseExited
viewPassbookPanel.setBackground(exitColor);
    }//GEN-LAST:event_viewPassbookPanelMouseExited

    private void addMoneyPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMoneyPanelMouseExited
addMoneyPanel.setBackground(exitColor);
    }//GEN-LAST:event_addMoneyPanelMouseExited

    private void changePasswordPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordPanelMouseExited
changePasswordPanel.setBackground(exitColor);
    }//GEN-LAST:event_changePasswordPanelMouseExited

    private void changeRecoveryAnswersPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeRecoveryAnswersPanelMouseExited
changeRecoveryAnswersPanel.setBackground(exitColor);
    }//GEN-LAST:event_changeRecoveryAnswersPanelMouseExited

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
logoutPanel.setBackground(exitColor);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
new loginPage().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Will Transact Money
        
//Gathering All the info from the form        
String usernamer,usernames;
int amount=Integer.parseInt(amount_tf.getText());
usernamer=username_tf.getText();
usernames=flagUsername;
int account=Integer.parseInt(account_balance_tf.getText());

if(usernamer.equals(usernames)) //condition 1: User Not Paying to self
{
 JOptionPane.showMessageDialog(null, "You cannot pay or send to yourself");
}
else //else for condition 1
{
 if(confirm_cb.isSelected()) //condition 2:Confirmation confirmed
 {
  if(account>=amount) //condition 3:User cant exceed his balance
  {
   try
   {
    Class.forName("java.sql.DriverManager");
    Connection con;
    con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
    
    Statement smt1=(Statement)con.createStatement();
    String query1="Insert into transactions(username_sent,username_recieved,amount,trans_date) values('"+usernames+"','"+usernamer+"','"+amount+"',(select curdate()));";
    smt1.executeUpdate(query1);
    
    Statement smt2=(Statement)con.createStatement();
    String query2="Update user_account set amount=amount-"+amount+" where username='"+usernames+"';";
    smt2.executeUpdate(query2);
    
    Statement smt3=(Statement)con.createStatement();
    String query3="Update user_account set amount=amount+"+amount+" where username='"+usernamer+"';";
    smt3.executeUpdate(query3);
    
    amount_tf.setText(null);
    username_tf.setText(null);
    Statement smt=(Statement)con.createStatement();
      String query= "Select * from user_account where username='"+usernames+"';";
      ResultSet rs= smt.executeQuery(query);
      
      while(rs.next())
      {
       int amount2=rs.getInt("amount");
       account_balance_tf.setText(""+amount2); //set user account balance in respective tf
   }
   }
   catch (Exception e)
   {
    String error=(String)e.getMessage();
    if(error.equals("Cannot add or update a child row: a foreign key constraint fails (`bank`.`transactions`, CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`username_recieved`) REFERENCES `customer_details` (`username`))")) // error condition 1: wrong username input
    {
     JOptionPane.showMessageDialog(null, "Please Enter Correct Username.");
    }
    else //else for error conditions 
    {
     JOptionPane.showMessageDialog(this, e.getMessage());
    }
   }
  }
  else //else for condition 3
  {
   JOptionPane.showMessageDialog(null, "You cannot exceed your account balnce more than your account balance");
   amount_tf.setText("");
  }
 }
 else //else for condition 2
 {
  JOptionPane.showMessageDialog(null, "Please confirm the username and amount entered is correct");
 }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewPassbookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassbookPanelMouseClicked
new viewPassbookPage(flagUsername).setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_viewPassbookPanelMouseClicked

    private void addMoneyPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMoneyPanelMouseClicked
new addMoneyPage(flagUsername).setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_addMoneyPanelMouseClicked

    private void changePasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordPanelMouseClicked
new changePasswordPage(flagUsername).setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_changePasswordPanelMouseClicked

    private void changeRecoveryAnswersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeRecoveryAnswersPanelMouseClicked
new changeRecoveryAnswersPage(flagUsername).setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_changeRecoveryAnswersPanelMouseClicked

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
    }
}
//common
logoLabel.setForeground(logoColor);
logoPanel.setBackground(logoPanelColor);
mainPanel.setBackground(mainPanelBgColor);
sidePanel.setBackground(naviPanelBgColor);
jButton1.setBackground(btnBgColor); //Activate when required
//jButton2.setBackground(btnBgColor); //Activate when required

//Level 2
accountOverviewLabel.setForeground(naviLabel);
viewPassbookLabel.setForeground(naviLabel);
changePasswordLabel.setForeground(naviLabel);
changeRecoveryAnswersLabel.setForeground(naviLabel);
addMoneyLabel.setForeground(naviLabel);
logoutLabel.setForeground(naviLabel);
jLabel1.setForeground(labelColor);

//Indiv
    //sidePanel content
accountOverviewPanel.setBackground(activeColor);
viewPassbookPanel.setBackground(exitColor);
addMoneyPanel.setBackground(exitColor);
changePasswordPanel.setBackground(exitColor);
changeRecoveryAnswersPanel.setBackground(exitColor);
logoutPanel.setBackground(exitColor);

    //mainPanel content
jLabel2.setForeground(labelColor);
jLabel3.setForeground(labelColor);
jLabel4.setForeground(labelColor);
confirm_cb.setForeground(labelColor);
account_balance_tf.setBackground(textfieldBgColor);
username_tf.setBackground(textfieldBgColor);
amount_tf.setBackground(textfieldBgColor);
account_balance_tf.setForeground(textfieldFgColor);
username_tf.setForeground(textfieldFgColor);
amount_tf.setForeground(textfieldFgColor);
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
            java.util.logging.Logger.getLogger(accountOverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountOverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountOverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountOverviewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountOverviewPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountOverviewLabel;
    private javax.swing.JPanel accountOverviewPanel;
    private javax.swing.JTextField account_balance_tf;
    private javax.swing.JLabel addMoneyLabel;
    private javax.swing.JPanel addMoneyPanel;
    private javax.swing.JTextField amount_tf;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JLabel changeRecoveryAnswersLabel;
    private javax.swing.JPanel changeRecoveryAnswersPanel;
    private javax.swing.JCheckBox confirm_cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField username_tf;
    private javax.swing.JLabel viewPassbookLabel;
    private javax.swing.JPanel viewPassbookPanel;
    // End of variables declaration//GEN-END:variables
}
