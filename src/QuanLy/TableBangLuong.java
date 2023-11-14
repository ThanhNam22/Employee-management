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
public class TableBangLuong extends AbstractTableModel{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã số lương","Tên nhân viên","Tên phòng ban","Số ngày làm","Hệ số lương","Thưởng", "Phạt","Thực lĩnh","Ghi chú"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class, String.class, Integer.class, Float.class, Float.class, Float.class, Float.class,String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<BangLuong> dsBL=new ArrayList<BangLuong>();

    public TableBangLuong(ArrayList<BangLuong> ds) {
        dsBL = ds;
    }

    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsBL.size();
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
            //Cột mã số lương
            case 0: return dsBL.get(rowIndex).getMaBangLuong(); 
            //Cột tên nhân sự
            case 1: return dsBL.get(rowIndex).getTenNhanSu();
            //Cột tên phòng ban
            case 2: return dsBL.get(rowIndex).getTenPhongBan();
            //Cột số ngày làm
            case 3: return dsBL.get(rowIndex).getSoNgayLam(); 
            //Cột hệ số lương
            case 4: return dsBL.get(rowIndex).getHeSoLuong();
            //Cột thưởng
            case 5: return dsBL.get(rowIndex).getThuong();
            //Cột phạt
            case 6: return dsBL.get(rowIndex).getPhat();
            //Cột thực lĩnh
            case 7: return dsBL.get(rowIndex).getThuclinh();
            //Cột ghi chú
            case 8: return dsBL.get(rowIndex).getGhiChu();
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
