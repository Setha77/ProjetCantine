package model;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ResultSetTableModel extends AbstractTableModel {
    private ResultSet result;

    public ResultSetTableModel(ResultSet r){
        this.result = r;
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        try {
            if (result == null){
                return 0;
            } else {
                return result.getMetaData().getColumnCount();
            }
        } catch (SQLException e){
            System.out.println("getColumncount resultset generating error while getting column count");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int getRowCount() {
        try {
            if (result == null){
                return 0;
            } else {
                result.last();
                return result.getRow();
            }
        } catch (SQLException e){
            System.out.println("getRowcount resultset generating error while getting rows count");
            System.out.println(e.getMessage());
            return 0;
        }
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        if(rowIndex < 0 || rowIndex > getRowCount()) || columnIndex < 0 || columnIndex > getColumnCount()){
            return null;
        }
        try {
            if (result == null) {
                return null;
            } else {
                result.absolute(rowIndex + 1);
                return result.getObject(columnIndex + 1);
            }
        } catch (SQLException e){
            System.out.println("getValueAt resultset generating error while fetching rows");
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        try{
            return result.getMetaData().getColumnName(columnIndex + 1);
        } catch (SQLException e){
            System.out.println("getColumnName resulset generating error while fetching column name");
            System.out.println(e.getMessage());
        }
        return super.getColumnName(columnIndex);
    }    
}
