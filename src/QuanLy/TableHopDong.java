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
public class TableHopDong extends AbstractTableModel{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã hợp đồng","Mã nhân viên","Tên nhân viên","Loại hợp đồng","Ngày ký","Ngày hết hạn", "Ghi chú"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class, String.class, String.class, String.class, String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<HopDongNhanSu> dsHD=new ArrayList<HopDongNhanSu>();

    public TableHopDong(ArrayList<HopDongNhanSu> ds) {
        dsHD = ds;
    }

    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsHD.size();
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
            //Cột mã hợp đồng
            case 0: return dsHD.get(rowIndex).getMaHopDong(); 
            //Cột mã nhân sự
            case 1: return dsHD.get(rowIndex).getMaNhanSu();
            //Cột tên nhân sự
            case 2: return dsHD.get(rowIndex).getTenNhanSu();
            //Cột loại hợp đồng
            case 3: return dsHD.get(rowIndex).getLoaiHopDong(); 
            //Cột ngày ký hợp đồng
            case 4: return dsHD.get(rowIndex).getNgayKy();
            //Cột ngày hết hạn hợp đồng
            case 5: return dsHD.get(rowIndex).getNgayHetHan();
            //Cột ghi chú
            case 6: return dsHD.get(rowIndex).getGhiChu();
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
