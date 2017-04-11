package almuwahhid.com.studyclub1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Detailku extends AppCompatActivity {
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailku);

        txt1 = (TextView) findViewById(R.id.namaku);
        txt2 = (TextView) findViewById(R.id.jurusanku);

        Intent intent = getIntent();

        String a = intent.getStringExtra("namaku");
        String b =  intent.getStringExtra("jurusanku");
        txt1.setText(a);
        txt2.setText(b);

        ActionBar act = getSupportActionBar();
        act.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}