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
public class TableUngVien extends AbstractTableModel{
    
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã uv","Họ tên","Địa chỉ", "Giới tính", "Email", "Số đt", "Ngày sinh"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class, String.class, String.class, String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<UngVien> dsUV=new ArrayList<UngVien>();

    public TableUngVien(ArrayList<UngVien> ds) {
        dsUV=ds;
    }
    
    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsUV.size();
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
            case 0: return dsUV.get(rowIndex).getMaUngVien(); 
            //Cột họ tên
            case 1: return dsUV.get(rowIndex).getHoTen();
            //Cột dia chi
            case 2: return dsUV.get(rowIndex).getDiaChi();
            //Cột gioi tinh
            case 3: return dsUV.get(rowIndex).getGioiTinh(); 
            //Cột Email
            case 4: return dsUV.get(rowIndex).getEmail();
            //Cột So dt
            case 5: return dsUV.get(rowIndex).getSoDT();
            //Cột ngay sinh
            case 6: return dsUV.get(rowIndex).getNgaySinh();
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
