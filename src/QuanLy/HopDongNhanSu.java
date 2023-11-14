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
public class HopDongNhanSu {
    private String maHopDong, maNhanSu, tenNhanSu, loaiHopDong;
    private String ngayKy, ngayHetHan, ghiChu;

    public HopDongNhanSu() {
    }

    public HopDongNhanSu(String maHopDong, String maNhanSu, String tenNhanSu, String loaiHopDong, String ngayKy, String ngayHetHan, String ghiChu) {
        this.maHopDong = maHopDong;
        this.maNhanSu = maNhanSu;
        this.tenNhanSu = tenNhanSu;
        this.loaiHopDong = loaiHopDong;
        this.ghiChu = ghiChu;
        this.ngayKy = ngayKy;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getTenNhanSu() {
        return tenNhanSu;
    }

    public void setTenNhanSu(String tenNhanSu) {
        this.tenNhanSu = tenNhanSu;
    }

    public String getLoaiHopDong() {
        return loaiHopDong;
    }

    public void setLoaiHopDong(String loaiHopDong) {
        this.loaiHopDong = loaiHopDong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(String ngayKy) {
        this.ngayKy = ngayKy;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHeHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "HopDongNhanSu{" + "maHopDong=" + maHopDong + ", maNhanSu=" + maNhanSu + ", tenNhanSu=" + tenNhanSu + ", loaiHopDong=" + loaiHopDong + ", ngayKy=" + ngayKy + ", ngayHetHan=" + ngayHetHan + ", ghiChu=" + ghiChu + '}';
    }
    
}
