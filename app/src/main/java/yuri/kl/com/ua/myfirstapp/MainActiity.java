package yuri.kl.com.ua.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getString(R.string.hello_android);
    }
}
