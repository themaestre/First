package com.example.fundamentals;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView dateView = (TextView) findViewById(R.id.mydate);
        setDate(dateView);

    }

    public void setDate(TextView view) {
//        String str = String.format("%tc", new Date());
//        view.setText(str);
//
        Date today = Calendar.getInstance().getTime();//getting date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy"); //formating according to my needs
        String date = formatter.format(today);
        view.setText(date);

    }
}