package com.parcial.ruben.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.parcial.ruben.Model.AnimalesModel;
import com.parcial.ruben.Model.FotografiaListaModel;
import com.parcial.ruben.Model.FotografiaModel;

public class ExtincionServices {
    Connection conn;

    public ExtincionServices() {
        conn = new ConexionServices().openDb();
    }

    public List<FotografiaModel> ObtenerInfoFotografia() {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM fotografia";

            List<FotografiaModel> fotografias = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                FotografiaModel fotografia = new FotografiaModel(
                        result.getInt("id"),
                        result.getString("titulo"),
                        result.getString("descripcion"));

                fotografias.add(fotografia);
            }

            result.close();
            stmt.close();
            return fotografias;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }

    public List<FotografiaListaModel> ObtenerListaFotografia() {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM fotografia_lista";

            List<FotografiaListaModel> fotografias = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                FotografiaListaModel fotografia = new FotografiaListaModel(
                        result.getInt("id"),
                        result.getString("descripcion"));

                fotografias.add(fotografia);
            }

            result.close();
            stmt.close();
            return fotografias;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }

    public List<AnimalesModel> ObtenerAnimales() {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM animales";

            List<AnimalesModel> fotografias = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                AnimalesModel fotografia = new AnimalesModel(
                        result.getInt("id"),
                        result.getString("titulo"),
                        result.getString("descripcion"),
                        result.getString("imagen"));

                fotografias.add(fotografia);
            }

            result.close();
            stmt.close();
            return fotografias;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
}
