package lat.ta.ujianpemrograman;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static lat.ta.ujianpemrograman.Utils.setFullScreen;

public class PilihactionActivity extends AppCompatActivity {

    @OnClick(R.id.bt_mulai) void handleStart() {
        startActivity(new Intent(this, PilihPelajaranActivity.class));
    }

    @OnClick(R.id.bt_nilaiakhir) void handleResult() {
        startActivity(new Intent(this, NilaiActivity.class));
    }

    @OnClick(R.id.bt_materi) void handleShowMateri() {
        startActivity(new Intent(this, Pilihmateri.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFullScreen(getWindow());
        setContentView(R.layout.activity_pilihaction);
        ButterKnife.bind(this);
    }
}