package www.jin.com.jin_text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/18.
 */

public class TextNDK extends AppCompatActivity{

    static {

        System.loadLibrary("text");
    }

    public native String TextNdk();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_ndk_layout);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.text_ndk_tv);

        Log.i("dengpao", "onCreate: "+"565656565656565656565656");

        Log.i("dengpao", "onCreate: "+TextNdk());


        tv.setText(TextNdk());


    }



}
