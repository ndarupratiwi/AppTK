package com.example.apptk.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSiswa {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Siswa> listDataSiswa;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Siswa> getListDataSiswa() {
        return listDataSiswa;
    }

    public void setListDataSiswa(List<Siswa> listDataSiswa) {
        this.listDataSiswa = listDataSiswa;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
