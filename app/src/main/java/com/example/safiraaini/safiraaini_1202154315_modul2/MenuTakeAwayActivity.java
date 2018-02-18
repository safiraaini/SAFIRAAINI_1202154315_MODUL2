package com.example.safiraaini.safiraaini_1202154315_modul2;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MenuTakeAwayActivity extends AppCompatActivity {

    //mengarahkan ke layout activity_menu_take_away
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_take_away);
    }

    //menyambungkan ke layout berikutnya
    public void food(View view) {
        Intent intent = new Intent(this, DaftarMenuActivity.class);

        startActivity(intent);
    }
}
