package id.sch.smktelkom_mlg.tugas01.xirpl1016.anakkost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cbpcl, cbllp, cbbbr, cbjer, cbteh, cbkop;
    EditText etNama;
    Button bpesan;
    TextView tvHasil;
    int nmakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbpcl = (CheckBox) findViewById(R.id.checkBoxpcl);
        cbllp = (CheckBox) findViewById(R.id.checkBoxllp);
        cbbbr = (CheckBox) findViewById(R.id.checkBoxbbr);
        cbjer = (CheckBox) findViewById(R.id.checkBoxjer);
        cbteh = (CheckBox) findViewById(R.id.checkBoxteh);
        cbkop = (CheckBox) findViewById(R.id.checkBoxkop);

        etNama = (EditText) findViewById(R.id.editTextNama);
        bpesan = (Button) findViewById(R.id.buttonPesan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        cbpcl.setOnCheckedChangeListener(this);
        cbllp.setOnCheckedChangeListener(this);
        cbbbr.setOnCheckedChangeListener(this);
        cbjer.setOnCheckedChangeListener(this);
        cbteh.setOnCheckedChangeListener(this);
        cbkop.setOnCheckedChangeListener(this);

        bpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = etNama.getText().toString();
                tvHasil.setText(nama);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) nmakan;
    }
}
