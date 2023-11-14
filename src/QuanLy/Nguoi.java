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
public class Nguoi {
    protected String hoTen, diaChi, gioiTinh, email, soDT, ngaySinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, String gioiTinh, String email, String soDT, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
    
    
    
}
