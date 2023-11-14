/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

/**
 *
 * @author admin
 */
public class PhongBan {
    private String maPhongban, tenPhongBan;
    private int soNhanVien;
    private String viTri, moTa;

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public PhongBan() {
    }

    public PhongBan(String maPhongban, String tenPhongBan, int soNhanVien, String vitri, String moTa) {
        this.maPhongban = maPhongban;
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;
        this.viTri = vitri;
        this.moTa = moTa;
    }

    public void setMaPhongban(String maPhongban) {
        this.maPhongban = maPhongban;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    

    public String getMaPhongban() {
        return maPhongban;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "PhongBan{" + "maPhongban=" + maPhongban + ", tenPhongBan=" + tenPhongBan + ", soNhanVien=" + soNhanVien + ", viTri=" + viTri + ", moTa=" + moTa + '}';
    }

    
    
}
