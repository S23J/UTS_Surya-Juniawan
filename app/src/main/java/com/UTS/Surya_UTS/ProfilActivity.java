package com.UTS.Surya_UTS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.UTS.Surya_UTS.models.Profile;

public class ProfilActivity extends AppCompatActivity {

    Profile profile = MainActivity.profile;

    EditText txtNama;
//    Button btnTampil;
    TextView txtTampil, txtTampilNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        txtNama = findViewById(R.id.editTextNama);
        txtTampil = findViewById(R.id.textViewTampil);
        txtTampilNama = findViewById(R.id.textViewTampilNama);

        if(profile.getNama() != null){
            TampilkanNama();
        }
    }

    public void TampilkanNama(){
        String txtT = "Nama anda:";
        txtTampil.setText(txtT);
        txtTampilNama.setText(profile.getNama());
    }

    public void TampilClicked(View view){
        String stringNama = txtNama.getText().toString();
        profile.setNama(stringNama);
        TampilkanNama();
    }
}
