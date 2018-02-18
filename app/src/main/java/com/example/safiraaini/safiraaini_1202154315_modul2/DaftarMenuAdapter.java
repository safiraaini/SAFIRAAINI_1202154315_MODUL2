package com.example.safiraaini.safiraaini_1202154315_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarMenuAdapter extends RecyclerView.Adapter<DaftarMenuAdapter.ViewHolder> {

    private ArrayList<String> arrayListMenu; //Digunakan untuk Judul
    private ArrayList<String> arrayListsHarga; //Digunakan untuk Menu
    private ArrayList<Integer> gambar; //Digunakan untuk Image/Gambar

    DaftarMenuAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsHarga, ArrayList<Integer> Gambar){
        this.arrayListMenu = arrayListMenu;
        this.arrayListsHarga = arrayListsHarga;
        this.gambar = Gambar;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView menu, price;
        private ImageView gambar;
        private LinearLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            menu = itemView.findViewById(R.id.txtMenu);
            price = itemView.findViewById(R.id.txtPrice);
            gambar = itemView.findViewById(R.id.image);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    public DaftarMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_daftar_menu_adapter, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    public void onBindViewHolder(final DaftarMenuAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String price = arrayListsHarga.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.menu.setText(menu);
        holder.price.setText("Harga Rp. "+price);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Action Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMenu.class);
                String komposisi;
                switch (position){

                    //yang terjadi apabila case dieksekusi
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsHarga.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Nasi, Kecap, Sambal, Telur";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsHarga.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Mie Telur, Ayam, Sawi";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsHarga.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Tahu, Tepung, Cabai Hijau";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsHarga.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Daging, Rempah Khas Padang, Sambal";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                }
            }
        });
    }


    public int getItemCount() {
        return arrayListMenu.size();
    }
}

