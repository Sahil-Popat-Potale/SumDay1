package sahil.p.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextnum1,editTextnum2;
    Button buttonsum;

    TextView textViewres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valinit();
        op();
    }

    private void op() {
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(editTextnum1.getText().toString());
                int b = Integer.parseInt(editTextnum2.getText().toString());
                int c= a+b;
                textViewres.setText("SUM "+c);
            }
        });
    }

    private void valinit() {
        editTextnum1=findViewById(R.id.num1);
        editTextnum2=findViewById(R.id.num2);
        buttonsum=findViewById(R.id.op);
        textViewres=findViewById(R.id.res);
    }
}