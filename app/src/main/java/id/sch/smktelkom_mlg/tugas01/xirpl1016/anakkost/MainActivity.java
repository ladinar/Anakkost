package id.sch.smktelkom_mlg.tugas01.xirpl1016.anakkost;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Spinner spmakanan;
    TextView tvHasil;
    Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spmakanan = (Spinner) findViewById(R.id.makanan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonPesan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {
        tvHasil.setText("Terimakasih Telah memesan" + spmakanan.getSelectedItem().toString() + "di Kriyuk Syek");
    }
}


