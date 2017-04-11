package almuwahhid.com.studyclub1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pertambahan extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertambahan);

        txt1 = (EditText) findViewById(R.id.edt_tambah1);
        txt2 = (EditText) findViewById(R.id.edt_tambah2);
        btn = (Button) findViewById(R.id.btn_tambah);
        hasil = (TextView) findViewById(R.id.hasil_tambah);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.valueOf(txt1.getText().toString());
                int b = Integer.valueOf(txt2.getText().toString());
                int c = a + b;
                hasil.setText(String.valueOf(c));
            }
        });

        ActionBar act = getSupportActionBar();
        act.setDisplayHomeAsUpEnabled(true);
        act.setTitle("Pertambahan");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuicon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.kanan:
                Intent intent = new Intent(Pertambahan.this, Pengurangan.class);
                startActivity(intent);
                break;
            case android.R.id.home :
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
