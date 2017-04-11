
package almuwahhid.com.studyclub1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn_detail);
        txt1 = (TextView) findViewById(R.id.nama);
        txt2 = (TextView) findViewById(R.id.jurusan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("namaku", txt1.getText().toString());
                bundle.putString("jurusanku", txt2.getText().toString());
                startActivity(new Intent(MainActivity.this, Detailku.class).putExtras(bundle));
            }
        });
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
                Intent intent = new Intent(MainActivity.this, Pertambahan.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
