/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author admin
 */
public class QLBangLuong extends javax.swing.JFrame {

    ArrayList<BangLuong> dsBL=new ArrayList<BangLuong>();   
    int dongChon=-1;//dòng chọn khi bấm vào bảng
    BangLuong bl=new BangLuong();//biến trung gian dùng tạo đối tượng  
    int kt=1;
    public QLBangLuong() {
        initComponents();
    }
    
    public void loadBangLuong(){
        //In du lieu ra bang
        tbbangluong.setModel(new TableBangLuong(dsBL));
        float tong = 0;
        for (var x : dsBL) {
            tong+=x.getThuclinh();
        }
        txttongluong.setText(tong+"");
    }
    public void fakeData(){
        dsBL.clear();
        BangLuong bl1 = new BangLuong("BL01", "Nguyễn Văn A", "Tài chính", 28, 500000,2000000,0, 0, "Tốt");
        BangLuong bl2 = new BangLuong("BL02", "Nguyễn THị C", "Quản lý chất lượng",27, 450000, 1000000, 100000, 0, "Tốt");
        BangLuong bl3 = new BangLuong("BL03", "Trần Văn B", "Khoa CNTT", 30,550000, 500000, 0, 0, "Tốt");
        dsBL.add(bl1);
        dsBL.add(bl2);
        dsBL.add(bl3);
    }
    public boolean Check(String ma) {
        for(var t : dsBL)
            if (t.getMaBangLuong().trim().compareTo(ma.trim())==0)
                return true;
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnthoat = new javax.swing.JButton();
        btnload = new javax.swing.JButton();
        btnluufile = new javax.swing.JButton();
        btnxoatrang = new javax.swing.JButton();
        btnsapxep = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txthesoluong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtthuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtphat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtghichu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttennhansu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttenphongban = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsongaylam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttongluong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbangluong = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        btnthoat.setBackground(new java.awt.Color(255, 255, 102));
        btnthoat.setText("Trang chủ");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnload.setBackground(new java.awt.Color(255, 255, 102));
        btnload.setText("Load");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });

        btnluufile.setBackground(new java.awt.Color(255, 255, 102));
        btnluufile.setText("Lưu file");
        btnluufile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluufileActionPerformed(evt);
            }
        });

        btnxoatrang.setBackground(new java.awt.Color(255, 255, 102));
        btnxoatrang.setText("Xóa trắng");
        btnxoatrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoatrangActionPerformed(evt);
            }
        });

        btnsapxep.setBackground(new java.awt.Color(255, 255, 102));
        btnsapxep.setText("Sắp xếp");
        btnsapxep.setToolTipText("");
        btnsapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsapxepActionPerformed(evt);
            }
        });

        btnthem.setBackground(new java.awt.Color(255, 255, 102));
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(255, 255, 102));
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 255, 102));
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnxoatrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnluufile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsapxep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnthoat))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnthoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnluufile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoatrang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsapxep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnthem)
                .addGap(18, 18, 18)
                .addComponent(btnsua)
                .addGap(18, 18, 18)
                .addComponent(btnxoa)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        title.setBackground(new java.awt.Color(255, 0, 0));
        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setText("QUẢN LÝ BẢNG LƯƠNG");

        jLabel6.setText("Hệ số lương");

        txthesoluong.setText("0");

        jLabel7.setText("Thưởng:");

        txtthuong.setText("0");

        jLabel9.setText("Phạt:");

        txtphat.setText("0");

        jLabel10.setText("Ghi chú:");

        jLabel2.setText("Mã lương:");

        jLabel3.setText("Tên nhân sự:");

        jLabel4.setText("Tên phòng ban:");

        jLabel5.setText("Số ngày làm:");

        txtsongaylam.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tổng lương:");

        txttongluong.setText("0");

        tbbangluong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbbangluong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbangluongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbangluong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txttenphongban, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtma, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttennhansu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsongaylam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthesoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtphat)
                            .addComponent(txtghichu)
                            .addComponent(txtthuong))
                        .addGap(56, 56, 56))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txttongluong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthesoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txttennhansu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txttenphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtphat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtsongaylam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txttongluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
        fakeData();
        loadBangLuong();
    }//GEN-LAST:event_btnloadActionPerformed

    private void btnluufileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluufileActionPerformed
        try {
            FileWriter fw = new FileWriter("bangluong.txt");
            for (var x : dsBL)
                fw.write(x.toString()+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this,"Đã lưu thành công","Thông báo", WIDTH);
    }//GEN-LAST:event_btnluufileActionPerformed

    private void btnxoatrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoatrangActionPerformed
        txtma.setText("");
        txttennhansu.setText("");
        txttenphongban.setText("");
        txtsongaylam.setText("0");
        txthesoluong.setText("0");
        txtthuong.setText("0");
        txtphat.setText("0");
        txtghichu.setText("");
    }//GEN-LAST:event_btnxoatrangActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        try {
            kt=1;
            bl = new  BangLuong(txtma.getText(), txttennhansu.getText(), txttenphongban.getText(),
                Integer.parseInt(txtsongaylam.getText()), Float.parseFloat(txthesoluong.getText()),
                Float.parseFloat(txtthuong.getText()), Float.parseFloat(txtphat.getText()),
                0, txtghichu.getText());
        } catch (Exception ex) {
            kt=0;
            JOptionPane.showMessageDialog(this,ex.toString(),"Thông báo", WIDTH);
        }
        try {
            kt=1;
            if (Check(bl.getMaBangLuong()))
            {
                throw new Exception("Không được trùng mã số lương");
            }
            if (bl.getTenNhanSu().trim().compareTo("")==0
                    || bl.getTenNhanSu().trim().compareTo("")==0
                    || bl.getTenNhanSu().trim().compareTo("")==0){
                     throw new Exception("Không được để trống thông tin");
                            }
        } catch (Exception ex) {
            kt=0;
            JOptionPane.showMessageDialog(this,ex.toString(),"Thông báo", WIDTH);
        }
        if (kt==1)
            dsBL.add(bl);
        loadBangLuong();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed

        dongChon = tbbangluong.getSelectedRow();
        String x = (String) tbbangluong.getValueAt(dongChon, 0);
        BangLuong blNew = new BangLuong();
        if (dongChon!=-1) {
            try {
                kt=1;
                blNew.setMaBangLuong(x);
                blNew.setTenNhanSu(txttennhansu.getText());
                blNew.setTenPhongBan(txttenphongban.getText());
                blNew.setThuclinh();
                blNew.setGhiChu(txtghichu.getText());
                if (blNew.getTenNhanSu().trim().compareTo("")==0
                    || blNew.getTenNhanSu().trim().compareTo("")==0
                    || blNew.getTenNhanSu().trim().compareTo("")==0
                   // || blNew.getMaBangLuong().trim().compareTo("")==0    
                  ){
                     throw new Exception("Không được để trống thông tin");
                }
               if (x.trim().compareTo(txtma.getText().trim())!=0) {
                        throw new Exception("Không được sửa mã số lương");
                   }
            } catch (Exception ex) {
                kt=0;
                JOptionPane.showMessageDialog(this,ex.toString(),"Thông báo", WIDTH);
            }
            try {
                kt=1;
                blNew.setSoNgayLam(Integer.parseInt(txtsongaylam.getText()));
                blNew.setHeSoLuong(Float.parseFloat(txthesoluong.getText()));
                blNew.setThuong(Float.parseFloat(txtthuong.getText()));
                blNew.setPhat(Float.parseFloat(txtphat.getText()));
            } catch (Exception ex) {
                kt=0;
                JOptionPane.showMessageDialog(this,"Số ngày làm, Hệ số lương, "
                        + "Thưởng, Phạt phải là số","Thông báo", WIDTH);
            }
            if (kt==1)
                dsBL.set(dongChon, blNew);
            loadBangLuong();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Chưa chọn dòng sửa","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        dongChon = tbbangluong.getSelectedRow();
        if (dongChon!=-1) {
            dsBL.remove(dongChon);
            loadBangLuong();
        }
        else {
            JOptionPane.showMessageDialog(this,"Chưa chọn dòng xóa","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
       //System.exit(0);
       this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void tbbangluongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbangluongMouseClicked
        dongChon = tbbangluong.getSelectedRow();
        if (dongChon!=-1) {
            bl = dsBL.get(dongChon);
            txtma.setText(bl.getMaBangLuong());
            txttennhansu.setText(bl.getTenNhanSu());
            txttenphongban.setText(bl.getTenPhongBan());
            txtsongaylam.setText(bl.getSoNgayLam()+"");
            txthesoluong.setText(bl.getHeSoLuong()+"");
            txtthuong.setText(bl.getThuong()+"");
            txtphat.setText(bl.getPhat()+"");
            txtghichu.setText(bl.getGhiChu());
        }
    }//GEN-LAST:event_tbbangluongMouseClicked

    private void btnsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsapxepActionPerformed
        Collections.sort(dsBL, new Comparator<BangLuong>(){
            public int compare(BangLuong x1, BangLuong x2){
                return (int)(x1.getThuclinh()-x2.getThuclinh());
            }
        });
        loadBangLuong();
    }//GEN-LAST:event_btnsapxepActionPerformed

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
            java.util.logging.Logger.getLogger(QLBangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBangLuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBangLuong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnluufile;
    private javax.swing.JButton btnsapxep;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoatrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbbangluong;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txthesoluong;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtphat;
    private javax.swing.JTextField txtsongaylam;
    private javax.swing.JTextField txttennhansu;
    private javax.swing.JTextField txttenphongban;
    private javax.swing.JTextField txtthuong;
    private javax.swing.JTextField txttongluong;
    // End of variables declaration//GEN-END:variables
}
