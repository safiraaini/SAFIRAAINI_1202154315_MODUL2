package com.example.safiraaini.safiraaini_1202154315_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtamaActivity extends AppCompatActivity {

    // membuat variabel untuk RadioGroup
    private RadioGroup c;
    private RadioButton d,e;

    //mengarahkan ke layout activity_menu_utama
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        c = (RadioGroup) findViewById(R.id.konvert);

        Intent c = getIntent();

    }

//melakukan proses eksekusi dengan method
    public void proses(View view) {
        int selecteditem = c.getCheckedRadioButtonId();
        d = (RadioButton) findViewById(R.id.rbdi);
        e = (RadioButton) findViewById(R.id.rbta);

        if (selecteditem == d.getId()) {
            Intent intent = new Intent(this, MenuDineInActivity.class);
            startActivity(intent);
            Toast.makeText(MenuUtamaActivity.this,"Dine In!", Toast.LENGTH_LONG).show();

        }else if (selecteditem == e.getId()){
            Intent intent = new Intent(this, MenuTakeAwayActivity.class);

            startActivity(intent);
            Toast.makeText(MenuUtamaActivity.this,"Take Away!", Toast.LENGTH_LONG).show();
        }


    }

}
