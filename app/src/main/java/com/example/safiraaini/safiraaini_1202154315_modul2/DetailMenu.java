package com.example.safiraaini.safiraaini_1202154315_modul2;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mengambil value yang dikirimkan dari activity sebelumnya berupa sebuah key value
        String menu = getIntent().getStringExtra("menu");
        String harga = getIntent().getStringExtra("harga");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer image = getIntent().getIntExtra("image", 0);

        //mendifinisikan TextView dan ImageView dengan id
        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtHarga = findViewById(R.id.harga);
        TextView txtkomposisi = findViewById(R.id.listkomposisi);
        ImageView images = findViewById(R.id.imageMenu);

        //setting value
        txtMenu.setText(menu);
        txtHarga.setText(harga);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //fungsi ketika button back di klik, akan kembali ke layout sebelumnya
        onBackPressed();
        return true;
    }

}
