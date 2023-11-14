/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TableNhanSu extends AbstractTableModel{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã ns", "Chức danh", "Tên phòng","Họ tên","Địa chỉ", "Giới tính", "Email", "Số đt", "Ngày sinh"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class, String.class, String.class,String.class,String.class, String.class, String.class, String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<NhanSu> dsNS=new ArrayList<NhanSu>();

    public TableNhanSu(ArrayList<NhanSu> ds) {
        dsNS=ds;
    }
    
    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsNS.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return  name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            //Cột mã
            case 0: return dsNS.get(rowIndex).getMaNhanSu(); 
            //Cột chức danh
            case 1: return dsNS.get(rowIndex).getChucDanh(); 
            //Cột tên phòng ban
            case 2: return dsNS.get(rowIndex).getTenPhongBan(); 
            //Cột họ tên
            case 3: return dsNS.get(rowIndex).getHoTen();
            //Cột dia chi
            case 4: return dsNS.get(rowIndex).getDiaChi();
            //Cột gioi tinh
            case 5: return dsNS.get(rowIndex).getGioiTinh(); 
            //Cột Email
            case 6: return dsNS.get(rowIndex).getEmail();
            //Cột So dt
            case 7: return dsNS.get(rowIndex).getSoDT();
            //Cột ngay sinh
            case 8: return dsNS.get(rowIndex).getNgaySinh();
            default :return null;
        }
        
    }
     @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
}
 
