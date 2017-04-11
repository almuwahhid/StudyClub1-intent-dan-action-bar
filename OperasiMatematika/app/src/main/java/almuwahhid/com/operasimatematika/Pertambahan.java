package almuwahhid.com.operasimatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pertambahan extends AppCompatActivity{

    EditText edit1, edit2;
    Button btn;
    TextView hasil;

    int isi1, isi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertambahan);

        edit1 = (EditText) findViewById(R.id.edit_tambah1);
        edit2 = (EditText) findViewById(R.id.edit_tambah2);

        btn = (Button) findViewById(R.id.btn_tambah);
        hasil = (TextView) findViewById(R.id.hasil_tambah);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isi1 = Integer.valueOf(edit1.getText().toString());
                isi2 = Integer.valueOf(edit2.getText().toString());
                int c = isi1+isi2;
                hasil.setText(String.valueOf(c));

            }
        });
        getSupportActionBar().setTitle("Pertambahan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
