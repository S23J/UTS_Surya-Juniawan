package com.UTS.Surya_UTS.models;

public class Profile {
    String nama = null;

    public Profile(String nama) {
        this.nama = nama;
    }

    public Profile() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
