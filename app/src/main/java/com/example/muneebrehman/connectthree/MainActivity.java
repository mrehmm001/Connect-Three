package com.example.muneebrehman.connectthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Boolean redsTurn=true;
    Boolean gameOver=false;
    List<String>checkerPlaced=new ArrayList<>();
    Map<String,String>rows=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view){
        if(!gameOver) {
            ImageView imageView = (ImageView) view;
            if (!checkerPlaced.contains(imageView.getTag().toString())) {
                if (redsTurn) {
                    imageView.setImageResource(R.drawable.red);
                    imageView.setY(imageView.getY() - 2000);
                    imageView.animate().translationYBy(2000).setDuration(500);
                    rows.put(imageView.getTag().toString(), "red");
                    redsTurn = false;
                } else if (!redsTurn) {
                    rows.put(imageView.getTag().toString(), "yellow");
                    imageView.setImageResource(R.drawable.yellow);
                    imageView.setY(imageView.getY() - 2000);
                    imageView.animate().translationYBy(2000).setDuration(500);
                    redsTurn = true;
                }
                checkerPlaced.add(imageView.getTag().toString());
            }


            checkWhoWon();
        }

    }


    public void checkWhoWon(){
        if (rows.get("row1A") == "red" && rows.get("row1B") == "red" && rows.get("row1C") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row2A") == "red" && rows.get("row2B") == "red" && rows.get("row2C") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row3A") == "red" && rows.get("row3B") == "red" && rows.get("row3C") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row1A") == "red" && rows.get("row2B") == "red" && rows.get("row3C") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row1C") == "red" && rows.get("row2B") == "red" && rows.get("row3A") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row1A") == "red" && rows.get("row2A") == "red" && rows.get("row3A") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row1B") == "red" && rows.get("row2B") == "red" && rows.get("row3B") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        } else if (rows.get("row1C") == "red" && rows.get("row2C") == "red" && rows.get("row3C") == "red") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Red wins!");
        }

        if (rows.get("row1A") == "yellow" && rows.get("row1B") == "yellow" && rows.get("row1C") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row2A") == "yellow" && rows.get("row2B") == "yellow" && rows.get("row2C") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row3A") == "yellow" && rows.get("row3B") == "yellow" && rows.get("row3C") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row1A") == "yellow" && rows.get("row2B") == "yellow" && rows.get("row3C") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row1C") == "yellow" && rows.get("row2B") == "yellow" && rows.get("row3A") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row1A") == "yellow" && rows.get("row2A") == "yellow" && rows.get("row3A") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row1B") == "yellow" && rows.get("row2B") == "yellow" && rows.get("row3B") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        } else if (rows.get("row1C") == "yellow" && rows.get("row2C") == "yellow" && rows.get("row3C") == "yellow") {
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Yellow wins!");
        }else if(checkerPlaced.size()==9){
            gameOver=true;
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(1);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("Draw!");

        }
    }

    public void restart(View view){
        if(gameOver){
            Button restart=(Button)findViewById(R.id.restart);
            restart.setAlpha(0);
            TextView text=(TextView)findViewById(R.id.textView);
            text.setText("");

            ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
            ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
            ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
            ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
            ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
            ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
            ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
            ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);



            redsTurn=true;
            rows.clear();
            checkerPlaced.clear();

            imageView1.setImageResource(0);
            imageView2.setImageResource(0);
            imageView3.setImageResource(0);
            imageView4.setImageResource(0);
            imageView5.setImageResource(0);
            imageView6.setImageResource(0);
            imageView7.setImageResource(0);
            imageView8.setImageResource(0);
            imageView9.setImageResource(0);

            gameOver=false;
        }
    }


}
