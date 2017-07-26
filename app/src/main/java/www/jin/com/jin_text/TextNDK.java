package www.jin.com.jin_text;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/7/18.
 */

public class TextNDK extends AppCompatActivity{

    static {

        System.loadLibrary("text");
    }

    public native String TextNdk();

    public native void CryptFile(String src,String dest);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_ndk_layout);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.text_ndk_tv);

        Log.i("dengpao", "onCreate: "+"565656565656565656565656");

        Log.i("dengpao", "onCreate: "+TextNdk());


        tv.setText(TextNdk());

        String src = Environment.getExternalStorageDirectory() .getAbsolutePath() + File.separatorChar + "test_src.txt";

        String dest = Environment.getExternalStorageDirectory() .getAbsolutePath() + File.separatorChar + "test_crypt.txt";

/*
        addFile(src,"你好啊");

        CryptFile(src,dest);

        Toast.makeText(this, "加密完成了", Toast.LENGTH_SHORT).show();
*/


    }

    void addFile(String src,String message){

        try {
            FileOutputStream fout = openFileOutput(src, MODE_PRIVATE);
            byte[] bytes = message.getBytes();
            fout.write(bytes);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
