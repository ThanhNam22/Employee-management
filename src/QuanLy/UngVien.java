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
public class UngVien extends Nguoi{
    private String maUngVien;

    @Override
    public String toString() {
        return "UngVien{" + "maUngVien=" + maUngVien +  ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", email=" + email + ", soDT=" + soDT + ", ngaySinh=" + ngaySinh + '}';
    }

    public UngVien() {
    }

    public UngVien(String maUngVien, String hoTen, String diaChi, String gioiTinh, String email, String soDT, String NgaySinh) {
        super(hoTen, diaChi, gioiTinh, email, soDT, NgaySinh);
        this.maUngVien = maUngVien;
    }
    
    public void setMaUngVien(String maUngVien) {
        this.maUngVien = maUngVien;
    }
    
    public String getMaUngVien() {
        return maUngVien;
    }
    
}
