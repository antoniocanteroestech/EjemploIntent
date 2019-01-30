package es.estech.ejemplointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {

    public static final String KEY_DATA_STRING = "es.estech.ejemplointent.KEY_DATO_STRING";
    public static final String KEY_DATA_INT = "es.estech.ejemplointent.KEY_DATO_INT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String dataString = null;
        int dataInt;
        int[] numbers;

        if (getIntent().hasExtra(KEY_DATA_STRING)) {
            dataString = getIntent().getStringExtra(KEY_DATA_STRING);

            final TextView text1 = findViewById(R.id.text1);
            text1.setText(dataString);
        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: " + KEY_DATA_STRING);
        }



        if (getIntent().hasExtra(KEY_DATA_INT)) {
            dataInt = getIntent().getIntExtra(KEY_DATA_INT, -1);

            final TextView text2 = findViewById(R.id.text2);
            text2.setText(String.valueOf(dataInt));

        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: " + KEY_DATA_INT);
        }

        if (getIntent().hasExtra("array")) {
            numbers = getIntent().getIntArrayExtra("array");

            final TextView text3 = findViewById(R.id.text3);
            text3.setText(String.valueOf(Arrays.toString(numbers)));

        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: array");
        }

    }
}
