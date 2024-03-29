package Tools;

import Entities.Pizza;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {
    private String[] colonnes;
    private Object[][] lignes;

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        lignes[row][column] = value;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 4 ;
    }


    public void loadDatasPizzas(ArrayList<Pizza> lesPizzas)
    {
        nomsColonnes = new String[]{"Numéro", "Nom"};
        rows = new Object[lesPizzas.size()][2];
        //rows = new Vector<>();
        int i = 0;
        for (Pizza piz : lesPizzas) {
            rows[i][0] = piz.getIdPizza();
            rows[i][1] = piz.getNomPizza();
            i++;
        }
        fireTableChanged(null); // Mettre à jour le JTABLE

    }
}
