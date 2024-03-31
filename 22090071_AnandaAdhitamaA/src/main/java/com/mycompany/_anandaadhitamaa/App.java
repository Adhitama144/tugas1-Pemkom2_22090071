/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._anandaadhitamaa;
import java.io.Serializable;
/**
 *
 * @author LENOVO
 */
public class App implements Serializable{
    private String host, username, password;
    final int port;
    static String nama;
    transient String motivasi;
    
    public App(){
        this.port = 3306;
    }
        public App(String host, int port, String user, String pass, String nama, String motivasi){
        this.host = host;
        this.port = port;
        this.username = user;
        this.password = pass;
        
        App.nama = nama;
        this.motivasi = motivasi;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    } 
    
    public int getPort(){
        return port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        App.nama = nama;
    }

    public String getMotivasi() {
        return motivasi;
    }

    public void setMotivasi(String motivasi) {
        this.motivasi = motivasi;
    }
}
