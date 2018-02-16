package yuri.kl.com.ua.myfirstapp;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class MainActivity extends AppCompatActivity {
    //button field
    private Button mBtnClick;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String newString = getString(R.string.new_text);

        //fixed old api method getColor
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red);
        }
        //or
        ContextCompat.getColor(MainActivity.this, R.color.red);

        //button in method called
        mBtnClick = findViewById(R.id.btn_click);

        //textView in method called
        mText = findViewById(R.id.text_view);

        //Listener for button
        mBtnClick.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mText.setText(newString);
            }
        });

//        Bundle bundle = new Bundle();
//        bundle.putString("KEY", "SAD");
    }
}
