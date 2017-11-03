package com.example.linxuan.myzxing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.linxuan.myzxing.zxing.CaptureActivity;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{

    private Button mBtn_qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn_qr = (Button) findViewById(R.id.btn_qr);
        mBtn_qr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_qr:
                startActivity(new Intent(MainActivity.this, CaptureActivity.class));
                break;
        }
    }
}
