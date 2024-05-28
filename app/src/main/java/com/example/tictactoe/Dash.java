package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dash extends AppCompatActivity {
     int count=0;
     int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
        ConstraintLayout l1;
        l1=findViewById(R.id.cnmain);
        getSupportActionBar().setTitle("GAME");
    }

    public void Check(View v){

        ConstraintLayout l1;
        l1=findViewById(R.id.cnmain);
        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9= findViewById(R.id.button9);
        String b1,b2,b3,b4,b5,b6,b7,b8,b9;


        Button btncurrent=(Button)v;
        count++;
        if(btncurrent.getText().toString().equals("")){
        if(flag==0){
            btncurrent.setText("X");
            flag=1;
        }
        else{
            btncurrent.setText("O");
            flag=0;
        }
        if (count>4)
        {

            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();


            if(b1.equals(b2)&&b2.equals(b3)&&!b1.equals("")){
                Toast.makeText(this, "WINNER! "+b1, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();


            }
            if(b4.equals(b5)&&b4.equals(b5)&&!b4.equals("")){
                Toast.makeText(this, "WINNER! "+b4, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();

            }
            if(b7.equals(b8)&&b8.equals(b9)&&!b7.equals("")){
                Toast.makeText(this, "WINNER! "+b7, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }
            if(b1.equals(b4)&&b4.equals(b7)&&!b4.equals("")){
                Toast.makeText(this, "WINNER! "+b1, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }
            if(b5.equals(b2)&&b2.equals(b8)&&!b8.equals("")){
                Toast.makeText(this, "WINNER! "+b5, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }
            if(b3.equals(b6)&&b6.equals(b9)&&!b9.equals("")){
                Toast.makeText(this, "WINNER! "+b3, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }
            if(b7.equals(b5)&&b5.equals(b3)&&!b5.equals("")){
                Toast.makeText(this, "WINNER "+b7, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }
            if(b1.equals(b5)&&b5.equals(b9)&&!b1.equals("")){
                Toast.makeText(this, "WINNER "+b1, Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Green));
                newGame();
            }else if(count==9){
                Toast.makeText(this, "THE MATCH IS DRAW", Toast.LENGTH_SHORT).show();
                l1.setBackgroundColor(getResources().getColor(R.color.Red));
                newGame();
            }





        }



    }

}

    private void newGame() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
                btn1 = findViewById(R.id.button1);
                btn2 = findViewById(R.id.button2);
                btn3 = findViewById(R.id.button3);
                btn4 = findViewById(R.id.button4);
                btn5 = findViewById(R.id.button5);
                btn6 = findViewById(R.id.button6);
                btn7 = findViewById(R.id.button7);
                btn8 = findViewById(R.id.button8);
                btn9= findViewById(R.id.button9);
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=0;
                flag=0;

            }
        },4000);
         }


}
