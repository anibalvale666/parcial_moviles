package com.example.memoria_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class nivel2 extends AppCompatActivity {
    ImageButton btn;
    ImageButton activated;
    TextView score;
    int cont=0;
    int punt = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);
        btn = (ImageButton)findViewById(R.id.imageButton5);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton6);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton7);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton8);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton9);
        btn.setImageResource(R.drawable.maggie);
        btn = (ImageButton)findViewById(R.id.imageButton10);
        btn.setImageResource(R.drawable.maggie);

        score = (TextView)findViewById(R.id.textView7);
        score.setText(Integer.toString(punt*2) );
    }

    public void victory(){
        Intent ac = new Intent(this,victory.class);
        startActivity(ac);
    }



    public void action5(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton5);
        btn.setImageResource(R.drawable.homer);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton5);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton10)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();

                if(punt>4) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;

            }
        }
    }
    public void action6(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton6);
        btn.setImageResource(R.drawable.lisa);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton6);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton7)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt>4) victory();

            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;
            }
        }
    }
    public void action7(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton7);
        btn.setImageResource(R.drawable.lisa);
        if(cont==0){
            activated =(ImageButton)findViewById(R.id.imageButton7);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton6)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt>4) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;
            }
        }
    }
    public void action8(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton8);
        btn.setImageResource(R.drawable.bart);
        if(cont ==0){
            activated =(ImageButton)findViewById(R.id.imageButton8);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton9)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt>4) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;

            }
        }
    }
    public void action9(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton9);
        btn.setImageResource(R.drawable.bart);
        if(cont ==0){
            activated =(ImageButton)findViewById(R.id.imageButton9);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton8)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt>4) victory();
            }
            else{
                Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                btn.setImageResource(R.drawable.maggie);
                activated.setImageResource(R.drawable.maggie);
                cont=0;

            }
        }
    }
    public void action10(View v) {

        btn = (ImageButton)findViewById(R.id.imageButton10);
        btn.setImageResource(R.drawable.homer);
        if(cont ==0){
            activated =(ImageButton)findViewById(R.id.imageButton10);
            cont++;
        }
        else
        {
            if(activated == (ImageButton)findViewById(R.id.imageButton5)){
                cont=0;
                punt++;
                score.setText(Integer.toString(punt*2) );
                Toast.makeText(this, "Jugada Correcta", Toast.LENGTH_SHORT).show();
                if(punt>4) victory();
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