package com.barathanakash.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int create1 = 0;
    int start1 = 0;
    int resume1 = 0;
    int pause1 = 0;
    int stop1 = 0;
    int destroy1 = 0;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    int c = 0;
    int s = 0;
    int r = 0;
    int p = 0;
    int stp = 0;
    int d = 0;
    SharedPreferences sharedPreferences = getSharedPreferences("Settings", MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.create);
        two=findViewById(R.id.start);
        three=findViewById(R.id.resume);
        four=findViewById(R.id.pause);
        five=findViewById(R.id.stop);
        six=findViewById(R.id.destroy);


        SharedPreferences.Editor editor = sharedPreferences.edit();
        c=sharedPreferences.getInt("idTV1", c);

        create1=create1+1;
        c=create1;
        editor.putInt("idTV1", c);
        editor.apply();
        Log.d("lifecycle","onCreate invoked");
        TextView displayText=findViewById(R.id.create);
        displayText.setText("OnCreate"+" "+create1+" " + c);
    }
    @Override
    protected void onStart() {
        super.onStart();
        start1=start1+1;
        s=start1;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("idTV1", s);
        editor.apply();
        Log.d("lifecycle","onStart invoked");
        TextView displayText=findViewById(R.id.start);
        displayText.setText("OnStart"+" "+start1+" "+s);
    }
    @Override
    protected void onResume() {
        super.onResume();
        resume1=resume1+1;
        r=resume1;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("idTV1", r);
        editor.apply();
        Log.d("lifecycle","onResume invoked");
        TextView displayText=findViewById(R.id.resume);
        displayText.setText("OnResume"+" "+resume1+" "+r);
    }
    @Override
    protected void onPause() {
        super.onPause();
        pause1=pause1+1;
        p=pause1;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("idTV1", p);
        editor.apply();
        Log.d("lifecycle","onPause invoked");
        TextView displayText=findViewById(R.id.pause);
        displayText.setText("OnPause"+" "+pause1+" "+p);
    }
    @Override
    protected void onStop() {
        super.onStop();
        stop1=stop1+1;
        stp=stop1;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("idTV1", stp);
        editor.apply();
        Log.d("lifecycle","onStop invoked");
        TextView displayText=findViewById(R.id.stop);
        displayText.setText("OnStop"+" "+stop1+" "+stp);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy1 = destroy1 +1;
        d=destroy1;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("idTV1", d);
        editor.apply();
        Log.d("lifecycle","onDestroy invoked");
        TextView displayText=findViewById(R.id.destroy);
        displayText.setText("OnDestroy"+" "+destroy1);
    }


    @Override
    public void onClick(View v) {

    }
}
