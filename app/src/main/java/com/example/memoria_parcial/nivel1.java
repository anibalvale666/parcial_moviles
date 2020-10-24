package com.example.memoria_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class nivel1 extends AppCompatActivity {
    ImageButton btn;
    ImageButton activated;
    TextView score;
    int cont=0;
    int punt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);
        btn = (ImageButton)findViewById(R.id.imageButton);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton2);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton3);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton4);
        btn.setImageResource(R.drawable.maggie);

        score = (TextView)findViewById(R.id.textView4);
    }

    public void victory(){
        Intent ac = new Intent(this,nivel2.class);
        startActivity(ac);
    }



    public void action1(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton);
        btn.setImageResource(R.drawable.homer);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton4)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();

                if(punt==2) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;

            }
        }
    }
    public void action2(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton2);
        btn.setImageResource(R.drawable.bart);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton2);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton3)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt==2) victory();

            }
            else{
                btn.setImageResource(R.drawable.bart);
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;
            }
        }
    }
    public void action3(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton3);
        btn.setImageResource(R.drawable.bart);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton3);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton2)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt==2) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;
            }
        }
    }
    public void action4(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton4);
        btn.setImageResource(R.drawable.homer);
        if(cont ==0){
            activated =(ImageButton)findViewById(R.id.imageButton4);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt==2) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;

            }
        }
    }
}