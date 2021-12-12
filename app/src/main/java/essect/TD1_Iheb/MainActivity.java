package essect.TD1_Iheb;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String selected_value = "";

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
        Button b = (Button) findViewById(R.id.rt);
        b.setOnClickListener(new OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     EditText t1 = (EditText) findViewById(R.id.t1);
                                     EditText t2 = (EditText) findViewById(R.id.t2);

                                     Toast.makeText(getApplicationContext(),t1.getText().toString()+", "+t2.getText().toString()+", "+ selected_value, Toast.LENGTH_SHORT).show();

                                 }
                             }

        );

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selected_value = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}