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
public class NhanSu extends Nguoi{
    private String maNhanSu, chucDanh, tenPhongBan;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String chucDanh, String tenPhongBan, String hoTen, String diaChi, String gioiTinh, String email, String soDT, String ngaySinh) {
        super(hoTen, diaChi, gioiTinh, email, soDT, ngaySinh);
        this.maNhanSu = maNhanSu;
        this.chucDanh = chucDanh;
        this.tenPhongBan = tenPhongBan;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    @Override
    public String toString() {
        return "NhanSu{" + "maNhanSu=" + maNhanSu + ", chucDanh=" + chucDanh + ", tenPhongBan=" + tenPhongBan + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", email=" + email + ", soDT=" + soDT + ", ngaySinh=" + ngaySinh +'}';
    }
    
}
