package com.example.cvct121.myimagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private Button btnCalculate = null;
     private ImageButton btnImageClear = null;
     private ImageView imageViewPicture = null;
     private TextView textViewResult = null;
     private EditText editTextLeftOp = null;
    private EditText editTextRightOp = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = (Button)findViewById(R.id.btnCalculate);
        btnImageClear = (ImageButton)findViewById(R.id.btnImageClear);
        imageViewPicture = (ImageView)findViewById(R.id.imageViewPicture);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        editTextLeftOp = (EditText)findViewById(R.id.editTextLeftOp);
        editTextRightOp = (EditText)findViewById(R.id.editTextRightOp);

    }
    public void clickedCalculate(View view)
    {
        String leftOpString = editTextLeftOp.getText().toString();
        double leftOpDouble = 0.0;
        if(!leftOpString.isEmpty())
        {
             leftOpDouble = Double.parseDouble(leftOpString);
        }
        String righttOpString = editTextRightOp.getText().toString();
        double rightOpDouble = 0.0;
        if(!righttOpString.isEmpty())
        {
            rightOpDouble = Double.parseDouble(righttOpString);
        }
        double sumResultDouble = leftOpDouble + rightOpDouble;
        String strResult  = " " + sumResultDouble;
        textViewResult.setText(strResult);

        //show rewarding image if both operands exist
        //otherwise show UGLY PUNISHING IMAGE
        if(!leftOpString.isEmpty() && !righttOpString.isEmpty()) {
            imageViewPicture.setImageResource(R.drawable.golf);
        }
        else {
            imageViewPicture.setImageResource(R.drawable.ball);
        }
    }
    public void clickedClear(View view)
    {
        textViewResult.setText("");
    }
}
