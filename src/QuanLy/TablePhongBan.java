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
public class TablePhongBan extends AbstractTableModel{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã phòng ban","Tên phòng ban","Số nhân viên","Vị trí","Mô tả"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,Integer.class, String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<PhongBan> dsPB=new ArrayList<PhongBan>();

    public TablePhongBan(ArrayList<PhongBan> ds) {
        dsPB=ds;
    }
    
    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsPB.size();
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
            case 0: return dsPB.get(rowIndex).getMaPhongban(); 
            //Cột tên phòng ban
            case 1: return dsPB.get(rowIndex).getTenPhongBan();
            //Cột số lượng nhân viên
            case 2: return dsPB.get(rowIndex).getSoNhanVien();
            //Cột vị trí
            case 3: return dsPB.get(rowIndex).getViTri(); 
            //Cột mô tả
            case 4: return dsPB.get(rowIndex).getMoTa();
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
