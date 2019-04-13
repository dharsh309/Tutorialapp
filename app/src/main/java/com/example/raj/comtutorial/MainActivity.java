
package com.example.raj.comtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView CV_Android,CV_Python,CV_Java,CV_iOS,CV_C,CV_Cplus;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        CV_Android=findViewById( R.id.CV_Android );
        CV_Python=findViewById( R.id.CV_Python );
        CV_Java=findViewById( R.id.CV_Java );
        CV_iOS=findViewById( R.id.CV_iOS);
        CV_C=findViewById( R.id.CV_C );
        CV_Cplus=findViewById( R.id.CV_Cplus );



        CV_Android.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent android=new Intent( MainActivity.this,Android.class );
                startActivity( android );
            }
        } );


        CV_Python.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent python=new Intent( MainActivity.this,Python.class );
                startActivity( python );
            }
        } );

        CV_Java.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent java=new Intent( MainActivity.this,Java.class );
                startActivity( java );
            }
        } );
        


        CV_iOS.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent ios=new Intent( MainActivity.this,iOS.class );
                startActivity( ios );
            }
        } );

        CV_C.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent c=new Intent( MainActivity.this,C.class );
                startActivity( c );
            }
        } );

        CV_Cplus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent cplus=new Intent( MainActivity.this,Cplus.class );
                startActivity( cplus );
            }
        } );
    }

}
