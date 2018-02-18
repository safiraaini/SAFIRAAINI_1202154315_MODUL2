package com.example.safiraaini.safiraaini_1202154315_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarMenuAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Harga;
    private ArrayList<Integer> Gambar;

    //Array untuk Menu
    private String[] menu = {"Nasi Goreng", "Mie Ayam", "Tahu", "Sate Padang"};
    //Array Harga
    private String[] harga = {"12.000", "15.000", "10.000", "13.000"};
    //Array Gambar
    private int[] image = {R.drawable.nasigoreng, R.drawable.mieayam, R.drawable.tahu, R.drawable.satepadang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //Menggunakan method Array
        Menu = new ArrayList<>();
        Harga = new ArrayList<>();
        Gambar = new ArrayList<>();
        recyclerView = findViewById(R.id.rv);

        DaftarItem();
        //Menggunakan Layout Manager dan Membuat Daftar Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new DaftarMenuAdapter(Menu, Harga, Gambar);

        //Menggunakan Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

    }

    //Menampilkan daftar Item
    private void DaftarItem() {
        for (int w = 0; w < menu.length; w++) {
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Harga.add(harga[w]);
        }
    }
}