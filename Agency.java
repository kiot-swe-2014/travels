
package travel;
import java.awt.List;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static travel.connections.con;

public class Agency extends javax.swing.JFrame {
 Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    private int selectedAgencyId;
     private String loginName;
    public Agency(String loginName) {
        initComponents();
         con=connections.getConnection();
         this.loginName = loginName; 
         table_update();
        
    }
    
  private void table_update() {
    int cc;
    Connection con = null;
    Statement st = null;
    ResultSet Rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM agency");
        ResultSetMetaData RSMD = Rs.getMetaData();
        cc = RSMD.getColumnCount();
        
        DefaultTableModel DFT = (DefaultTableModel) jTable11.getModel();
        DFT.setRowCount(0); 

        while (Rs.next()) {
            Vector<Object> v2 = new Vector<>();
            for (int i = 1; i <= cc; i++) {
                Object value = Rs.getObject(i); 
                if (value == null) {
                    v2.add(""); 
                } else {
                    v2.add(value); 
                }
            }
            DFT.addRow(v2); 
        }
    } catch (Exception e) {
        e.printStackTrace(); 
    } finally {
        
        try {
            if (Rs != null) Rs.close();
            if (st != null) st.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }
    }
}

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jboot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtraveldate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jmoney = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jdest = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtime = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(103, 54, 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agency Name");

        jname.setForeground(new java.awt.Color(153, 153, 153));
        jname.setText("Enter agency name");
        jname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jnameFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Boot Area");

        jboot.setForeground(new java.awt.Color(153, 153, 153));
        jboot.setText("Enter boot area");
        jboot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbootFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbootFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Travel Date");

        jtraveldate.setForeground(new java.awt.Color(153, 153, 153));
        jtraveldate.setText("yy/mm/dd");
        jtraveldate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtraveldateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtraveldateFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Regisration");

        jLabel5.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phonenumber");

        jphone.setForeground(new java.awt.Color(153, 153, 153));
        jphone.setText("Enter phone number");
        jphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jphoneFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Money");

        jmoney.setForeground(new java.awt.Color(153, 153, 153));
        jmoney.setText("Enter money");
        jmoney.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jmoneyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jmoneyFocusLost(evt);
            }
        });
        jmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmoneyActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Destination");

        jdest.setForeground(new java.awt.Color(153, 153, 153));
        jdest.setText("Enter destination");
        jdest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jdestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jdestFocusLost(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(103, 54, 5));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("<----");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Travel Time");

        jtime.setForeground(new java.awt.Color(153, 153, 153));
        jtime.setText("00:00");
        jtime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtimeFocusLost(evt);
            }
        });
        jtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jboot, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jphone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jdest, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtraveldate, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(jtime, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addComponent(jButton4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jboot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtraveldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(146, 112, 45));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Boot Area", "Destination", "Travel Date", "Travel Time", "Money", "Phonenumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                        
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        String name = jname.getText().trim();
        String bootarea = jboot.getText().trim();
        String destination = jdest.getText().trim();
        String traveltime = jtime.getText().trim();
        String traveldate =jtraveldate.getText().trim();
        String money = jmoney.getText().trim();
        String phonenumber = jphone.getText().trim();
       
      int ID = getLoggedInAgencyId(); 
        DefaultTableModel DFT = (DefaultTableModel) jTable11.getModel();
    int selectIndex = jTable11.getSelectedRow();
       String agencyName = DFT.getValueAt(selectIndex, 1).toString();
            String login_NAME = getLoginNameFromAgency(ID);
        if (!agencyName .equals(getLoginNameFromAgency(ID))) {
            JOptionPane.showMessageDialog(this, "Enter the same name as you used when creating the new account!", "Permission Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (name.isEmpty() || bootarea.isEmpty() || destination.isEmpty() || 
            traveltime.isEmpty() ||  traveldate.isEmpty() ||  money.isEmpty() || phonenumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
      
        if (!phonenumber.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Phone number must be 10 digits", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

       
        try {
            double moneyValue = Double.parseDouble(money);
            if (moneyValue <= 0) {
                JOptionPane.showMessageDialog(this, "Money must be a positive number", "Input Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Money must be a valid number", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

       
        Connection con = connections.getConnection();
        String sql = "INSERT INTO agency(Name, `Boot Area`, Destination, `Travel Date`, `Travel Time`, Money, Phonenumber,login_NAME) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, bootarea);
        pst.setString(3, destination);
          pst.setString(4, traveldate);
        pst.setString(5, traveltime);
        pst.setString(6, money);
        pst.setString(7, phonenumber);
         pst.setString(8, login_NAME);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data saved successfully ");

      
        jname.setText("");
        jboot.setText("");
        jdest.setText("");
        jtraveldate.setText("");
         jtime.setText("");
        jmoney.setText("");
        jphone.setText("");
        table_update();

    } catch (SQLException ex) {
        Logger.getLogger(Agency.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private String getLoginNameFromAgency(int ID) {
   
    String loginName = "";
    try {
        Connection con = connections.getConnection();
        String sql = "SELECT NAME FROM login where ID=?";
        
        
        PreparedStatement pst = con.prepareStatement(sql);
      
          pst.setInt(1, ID);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            loginName = rs.getString("NAME");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Agency.class.getName()).log(Level.SEVERE, null, ex);
    }
    return loginName;
}
    private int getLoggedInAgencyId() {
    return CurrentAgency.getAgencyId(); 
}
    

    private void jmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmoneyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         LOGIN login= new LOGIN(); 
           login.show();
           dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        DefaultTableModel DFT = (DefaultTableModel) jTable11.getModel();
    int selectIndex = jTable11.getSelectedRow();

    
   
       
         
           int ID = Integer.parseInt(DFT.getValueAt(selectIndex, 0).toString());  
   
   
    jname.setText(DFT.getValueAt(selectIndex, 1).toString());
    jboot.setText(DFT.getValueAt(selectIndex, 2).toString());
    jdest.setText(DFT.getValueAt(selectIndex, 3).toString());
    jtraveldate.setText(DFT.getValueAt(selectIndex, 4).toString());
     jtime.setText(DFT.getValueAt(selectIndex, 5).toString());
    jmoney.setText(DFT.getValueAt(selectIndex, 6).toString());
    jphone.setText(DFT.getValueAt(selectIndex, 7).toString());

    
    this.selectedAgencyId = ID; 
        // }  
    
    }//GEN-LAST:event_jTable11MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             
    try {
        DefaultTableModel DFT = (DefaultTableModel) jTable11.getModel();
        int selectIndex = jTable11.getSelectedRow();
          if (selectIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an agency to edit.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
         String agencyName = DFT.getValueAt(selectIndex, 1).toString();
        
          
int ID = getLoggedInAgencyId();
       
        if (!agencyName .equals(getLoginNameFromAgency(ID))) {
            JOptionPane.showMessageDialog(this, "You do not have permission to edit this agency's data.", "Permission Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }

 int Id = Integer.parseInt(DFT.getValueAt(selectIndex, 0).toString());
        
       String name = jname.getText();
        String bootarea = jboot.getText();
        String destination = jdest.getText();
         String traveldate = jtraveldate.getText();
        String traveltime = jtime.getText();
           String money = jmoney.getText();
        String phonenumber = jphone.getText();

        Connection con = connections.getConnection();
        String sql = "UPDATE agency SET Name=?, `Boot Area`=?, Destination=?, `Travel Date`=?,`Travel Time`=?, Money=?, Phonenumber=? WHERE ID=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, bootarea);
        pst.setString(3, destination);
         pst.setString(4, traveldate);
        pst.setString(5, traveltime);
        
        pst.setString(6, money);
        pst.setString(7, phonenumber);
        pst.setInt(8, Id);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Updated");
         jname.setText("");
        jboot.setText("");
        jdest.setText("");
        jtraveldate.setText("");
         jtime.setText("");
        jmoney.setText("");
        jphone.setText("");
        
        table_update();

    } catch (SQLException ex) {
        Logger.getLogger(Agency.class.getName()).log(Level.SEVERE, null, ex);
    }

   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
    if (opt == 0) {
        try {
            DefaultTableModel DFT = (DefaultTableModel) jTable11.getModel();
            int selectIndex = jTable11.getSelectedRow();
              if (selectIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an agency to edit.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
            int Id = Integer.parseInt(DFT.getValueAt(selectIndex, 0).toString());
 String agencyName = DFT.getValueAt(selectIndex, 1).toString();
           int ID = getLoggedInAgencyId();
        
        if (!agencyName .equals(getLoginNameFromAgency(ID))) {
            JOptionPane.showMessageDialog(this, "You do not have permission to delete this agency's data.", "Permission Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }

            Connection con = connections.getConnection();
            String sql = "DELETE FROM agency WHERE ID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Deleted");
            jname.setText("");
        jboot.setText("");
        jdest.setText("");
        jtraveldate.setText("");
         jtime.setText("");
        jmoney.setText("");
        jphone.setText("");
            table_update();

        } catch (SQLException ex) {
            Logger.getLogger(Agency.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }//GEN-LAST:event_jButton3ActionPerformed

 
    private void jnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jnameFocusGained
       if(jname.getText().equals("Enter agency name")){
       jname.setText("");
       
       }
    }//GEN-LAST:event_jnameFocusGained

    private void jnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jnameFocusLost
         if(jname.getText().equals("")){
       jname.setText("Enter agency name");
       }
    }//GEN-LAST:event_jnameFocusLost

    private void jbootFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbootFocusGained
        if(jboot.getText().equals("Enter boot area")){
       jboot.setText("");
       }
    }//GEN-LAST:event_jbootFocusGained

    private void jbootFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbootFocusLost
         if(jboot.getText().equals("")){
       jboot.setText("Enter boot area");
       }
    }//GEN-LAST:event_jbootFocusLost

    private void jdestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdestFocusGained
         if(jdest.getText().equals("Enter destination")){
       jdest.setText("");
       }
    }//GEN-LAST:event_jdestFocusGained

    private void jdestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdestFocusLost
        if(jdest.getText().equals("")){
       jdest.setText("Enter destination");
       }
    }//GEN-LAST:event_jdestFocusLost

    private void jtraveldateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtraveldateFocusGained
          if(jtraveldate.getText().equals("yy/mm/dd")){
       jtraveldate.setText("");
       }
    }//GEN-LAST:event_jtraveldateFocusGained

    private void jtraveldateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtraveldateFocusLost
           if(jtraveldate.getText().equals("")){
       jtraveldate.setText("yy/mm/dd");
       }
    }//GEN-LAST:event_jtraveldateFocusLost

    private void jtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtimeActionPerformed

    private void jtimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtimeFocusGained
          if(jtime.getText().equals("00:00")){
       jtime.setText("");
       }
    }//GEN-LAST:event_jtimeFocusGained

    private void jtimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtimeFocusLost
           if(jtime.getText().equals("")){
       jtime.setText("00:00");
       }
    }//GEN-LAST:event_jtimeFocusLost

    private void jmoneyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jmoneyFocusGained
           if(jmoney.getText().equals("Enter money")){
       jmoney.setText("");
       }
    }//GEN-LAST:event_jmoneyFocusGained

    private void jmoneyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jmoneyFocusLost
            if(jmoney.getText().equals("")){
       jmoney.setText("Enter money");
       }
    }//GEN-LAST:event_jmoneyFocusLost

    private void jphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jphoneFocusGained
           if(jphone.getText().equals("Enter phone number")){
       jphone.setText("");
       }
    }//GEN-LAST:event_jphoneFocusGained

    private void jphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jphoneFocusLost
           if(jphone.getText().equals("")){
       jphone.setText("Enter phone number");
       }
    }//GEN-LAST:event_jphoneFocusLost

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         String loginName ="NAME";
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
               new Agency(loginName).setVisible(true);
            }
            
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable11;
    private javax.swing.JTextField jboot;
    private javax.swing.JTextField jdest;
    private javax.swing.JTextField jmoney;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField jtime;
    private javax.swing.JTextField jtraveldate;
    // End of variables declaration//GEN-END:variables
}
