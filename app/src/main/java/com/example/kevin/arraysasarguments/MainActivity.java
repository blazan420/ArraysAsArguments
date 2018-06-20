package com.example.kevin.arraysasarguments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView  txtArrayValues = (TextView) findViewById(R.id.txtArrayValues);
        String oldTxtArrayValues;
        TextView txtAverageValue = (TextView) findViewById(R.id.txtAverageValue);

        int[] intArray = {2, 4, 54, 6, 7 ,43, 23, 75, 7, 8, 4, 22, 89};

        for (int index = 0; index < intArray.length; index++) {
            oldTxtArrayValues = txtArrayValues.getText().toString();
            txtArrayValues.setText(oldTxtArrayValues + intArray[index] + "      ");
        }


    }

    public int getTheAverageValue(int... numbers) {
        int totalValue = 0;
        for (int value : numbers) {
            totalValue += value;

        }
        return totalValue / numbers.length;
    }
}
