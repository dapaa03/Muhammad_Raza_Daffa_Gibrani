package controllers;

import java.sql.SQLException;

import database.Database;

public class ControllerBarang extends Database {
    // Constructor untuk Connect ke Database
    public ControllerBarang() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    public void insertelektronik(String nama_barang, int stok_barang, int harga_satuan) throws SQLException {
        String reset = String.format("ALTER TABLE elektronik AUTO_INCREMENT = %d", 0);
        String sql = String.format("INSERT INTO elektronik (nama_barang, stok_barang, harga_satuan) VALUE ('%s', %d, %d)", nama_barang,
                stok_barang, harga_satuan);
        this.setQuery(reset);
        this.execute();
        this.setQuery(sql);        
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM elektronik";
        this.setQuery(sql);
        this.fetch();
    }
    
    public String[] getById(int id) throws SQLException {
        String sql = String.format("SELECT * FROM elektronik WHERE id = %d", id);
        this.setQuery(sql);
        this.fetch();
        
        String[] data = new String[4];
        while (this.value.next()) {
            data[0] =  Integer.toString(this.value.getInt("id"));
            data[1] = this.value.getString("nama_barang");
            data[2] = Integer.toString(this.value.getInt("stok_barang"));
            data[3] = Integer.toString(this.value.getInt("harga_satuan"));
        }
        return data;
    }
    
    // Update
    public void updateelektronik(int id, String nama_barang, int stok_barang, int harga_satuan) throws SQLException {
        String sql = String.format("UPDATE elektronik SET nama_barang = '%s', stok_barang = %d, harga_satuan = %d WHERE id = %d",
                nama_barang, stok_barang, harga_satuan, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deleteelektronik(int id) throws SQLException {
        String reset = String.format("ALTER TABLE elektronik AUTO_INCREMENT = %d", 0);
        String sql = String.format("DELETE FROM elektronik WHERE id = %d", id);
        this.setQuery(reset);
        this.setQuery(sql);
        this.execute();
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkelektronik(String nama_barang) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("nama_barang").equals(nama_barang)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkelektronik(int id) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (Integer.parseInt(value.getString("id")) == id) {
                return true;
            }
        }
        return false;
    }

    // Print hewan
    public String[][] showelektronik() throws SQLException {
        String[][] data = new String[this.lenelektronik()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] =  Integer.toString(this.value.getInt("id"));
            data[i][1] = this.value.getString("nama_barang");
            data[i][2] = Integer.toString(this.value.getInt("stok_barang"));
            data[i][3] = Integer.toString(this.value.getInt("harga_satuan"));
            i++;
        }
        return data;
    }
    
    public int lenelektronik() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
