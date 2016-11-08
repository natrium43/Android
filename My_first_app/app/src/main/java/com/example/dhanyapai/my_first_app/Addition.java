package com.example.dhanyapai.my_first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {


    EditText et1,et2;
    Button b;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        b = (Button) findViewById(R.id.btnAdd);
        ans = (EditText) findViewById(R.id.et3);

        /**
         * setOnClickListener(anonymous class) is a listener which allows us to put response code in 'onClick'
         */
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(et1.getText().toString());
                int secondNumber = Integer.parseInt(et2.getText().toString());

                int k = firstNumber + secondNumber;

                ans.setText("Ans is : "+ k);
            }
        });

    }
    /**
     * This method can be attached to the 'onClick' property of the 'add' button.
     */
    public void add(View v) {
        System.out.println("Clicked on Add");
        int firstNumber = Integer.parseInt(et1.getText().toString());
        int secondNumber = Integer.parseInt(et2.getText().toString());

        int k = firstNumber + secondNumber;

        ans.setText("Ans is : "+ k);

    }
}
