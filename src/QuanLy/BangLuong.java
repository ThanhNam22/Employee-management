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
public class BangLuong {
    private String maBangLuong, tenNhanSu, tenPhongBan;
    private int soNgayLam=0;
    private float heSoLuong=0, thuong=0, phat=0;
    private float thuclinh;
    private String ghiChu;

    public BangLuong() {
    }

    public BangLuong(String maBangLuong, String tenNhanSu, String tenPhongBan, int soNgayLam, float heSoLuong, float thuong, float phat, float thuclinh, String ghiChu) {
        this.maBangLuong = maBangLuong;
        this.tenNhanSu = tenNhanSu;
        this.tenPhongBan = tenPhongBan;
        this.ghiChu = ghiChu;
        this.soNgayLam = soNgayLam;
        this.thuong = thuong;
        this.phat = phat;
        this.thuclinh = heSoLuong*(float)soNgayLam+thuong-phat;
        this.heSoLuong = heSoLuong;
    }

    public String getMaBangLuong() {
        return maBangLuong;
    }

    public void setMaBangLuong(String maBangLuong) {
        this.maBangLuong = maBangLuong;
    }

    public String getTenNhanSu() {
        return tenNhanSu;
    }

    public void setTenNhanSu(String tenNhanSu) {
        this.tenNhanSu = tenNhanSu;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public float getPhat() {
        return phat;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }

    public float getThuclinh() {
        return thuclinh;
    }

    public void setThuclinh() {
        this.thuclinh = soNgayLam*heSoLuong+thuong-phat;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "BangLuong{" + "maBangLuong=" + maBangLuong + ", tenNhanSu=" + tenNhanSu + ", tenPhongBan=" + tenPhongBan + ", soNgayLam=" + soNgayLam + ", heSoLuong=" + heSoLuong + ", thuong=" + thuong + ", phat=" + phat + ", thuclinh=" + thuclinh + ", ghiChu=" + ghiChu + '}';
    }
    
}
