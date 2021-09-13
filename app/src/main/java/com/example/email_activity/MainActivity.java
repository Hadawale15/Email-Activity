package com.example.email_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText to,sub,mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to=findViewById(R.id.To_id);
        sub=findViewById(R.id.Sub_id);
        mes=findViewById(R.id.Message_id);
    }

    public void SendMethod(View view) {
        String To=to.getText().toString();
        String SUB=sub.getText().toString();
        String MES=mes.getText().toString();

        Intent intent=new Intent(Intent.ACTION_SEND);
        //intent.setData(Uri.parse("mailto:"));

        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{To});
        intent.putExtra(Intent.EXTRA_SUBJECT,SUB);
        intent.putExtra(Intent.EXTRA_TEXT,MES);

        intent.setType(" plain/text");
        startActivity(Intent.createChooser(intent,"chose "));

    }
}