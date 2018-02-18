package com.example.safiraaini.safiraaini_1202154315_modul2;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Adapter;
        import android.widget.Spinner;

public class MenuDineInActivity extends AppCompatActivity{

    //menggunakan spinner
    private Spinner d;

    //eksekusi spinner
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dine_in);

        d = findViewById(R.id.spinnernm);

    }

    //menyambungkan ke layout berikutnya
    public void food(View view) {
        Intent intent = new Intent(this,DaftarMenuActivity.class);

        startActivity(intent);
    }
}

