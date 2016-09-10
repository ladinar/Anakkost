package id.sch.smktelkom_mlg.tugas01.xirpl1016.anakkost;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etnama;
    EditText etalamat;
    Spinner spmakanan;
    TextView tvHasil;
    RadioButton delivery, cash;
    RadioGroup rgStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spmakanan = (Spinner) findViewById(R.id.makanan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        etnama = (EditText) findViewById(R.id.pemesan);
        etalamat = (EditText) findViewById(R.id.alamat);
        /*delivery= (RadioButton) findViewById(R.id.delivery);
        cash= (RadioButton) findViewById(R.id.cash);*/

        findViewById(R.id.buttonPesan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        if (isvalid()) {
            String nama = etnama.getText().toString();
            tvHasil.setText("Terimakasih " + etnama + " Telah memesan " + spmakanan.getSelectedItem().toString() + " di Kriyuk Syek");
        }
    }

    private boolean isvalid() {
        boolean valid = true;

        String nama = etnama.getText().toString();

        if (nama.isEmpty()) {
            etnama.setError("Nama Belum diisi");
            valid = false;
        } else {
            etnama.setError(null);
        }
        return valid;
    }



}


