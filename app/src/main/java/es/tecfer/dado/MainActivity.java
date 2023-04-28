package es.tecfer.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_resultado;
    private int resultant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultant =0;
        tv_resultado = (TextView) findViewById(R.id.editTextNumber);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        resultant = (int)(Math.random()*6+1);

        tv_resultado.setText(String.valueOf(resultant));
    }

}
