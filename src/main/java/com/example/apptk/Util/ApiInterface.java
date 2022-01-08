package com.example.apptk.Util;

import com.example.apptk.Model.GetSiswa;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("siswa")
    Call<GetSiswa> getSiswa();
}
