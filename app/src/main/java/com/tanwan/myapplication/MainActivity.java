package com.tanwan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.tanwan.gson.GsonCallBack;
import com.tanwan.httplibrary.OkHttpUtils;
import com.tanwan.httplibrary.callback.StringCallback;
import com.tanwan.httplibrary.okhttp3.Call;
import com.tanwan.httplibrary.okhttp3.Request;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private String TAG = "www";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
initData();
            }
        });
         imageView = findViewById(R.id.imageView);
    }
    public class MyStringCallback extends StringCallback
    {
        @Override
        public void onBefore(Request request, int id)
        {
            setTitle("loading...");
        }

        @Override
        public void onAfter(int id)
        {
            setTitle("Sample-okHttp");
        }

        @Override
        public void onError(Call call, Exception e, int id)
        {
            e.printStackTrace();
            Log.i("onError:", e.getMessage().toString());
        }

        @Override
        public void onResponse(String response, int id)
        {
            Log.i("www","response:"+ response);


        }

        @Override
        public void inProgress(float progress, long total, int id)
        {
        }
    }

    private void initData() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", "zhy");
        String url = "https://www.391k.com/api/xapi.ashx/info.json?key=bd_hyrzjjfb4modhj&size=10&page=1";
        OkHttpUtils//
                .post()//
                .url(url)//
//                .params(params)//
                .build()//
                .execute(new GsonCallBack<a>() {


                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(a response, int id) {
                        Log.i("www",response.getData().getName());
//                        mTv.setText("onResponse:" + response.getData().getName());
                    }
                });
    }
}
