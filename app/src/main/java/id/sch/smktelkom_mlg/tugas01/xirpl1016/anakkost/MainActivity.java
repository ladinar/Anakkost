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
    EditText etjumlah;
    Spinner spmakanan;
    TextView tvHasil;
    RadioButton deliver;
    RadioGroup rgStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spmakanan = (Spinner) findViewById(R.id.makanan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        etnama = (EditText) findViewById(R.id.pemesan);
        etalamat = (EditText) findViewById(R.id.alamat);
        etjumlah = (EditText) findViewById(R.id.jumlah);
        deliver = (RadioButton) findViewById(R.id.delivery);

        findViewById(R.id.buttonPesan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }


    private void doProcess() {

        if (isvalid()) {
            int ju = Integer.parseInt(etjumlah.getText().toString());
            int hitung = 5000 * ju;
            String nama = etnama.getText().toString();
            tvHasil.setText("Terimakasih " + nama + " Telah memesan " + spmakanan.getSelectedItem().toString() + " Kres di Kriyuk Syek" + "\n"
                    + "Silahkan Anda membayar " + hitung);
        }
    }

    private boolean isvalid() {

        boolean valid = true;

        String nama = etnama.getText().toString();
        String alamat = etalamat.getText().toString();
        if (deliver.isChecked()) {
            if (alamat.isEmpty()) {
                etalamat.setError("Alamat Belum diisi");
            } else {
                etalamat.setError(null);
            }

        }

        if (nama.isEmpty()) {
            etnama.setError("Nama Belum diisi");
            valid = false;
        } else {
            etnama.setError(null);
        }
        return valid;
    }



}


