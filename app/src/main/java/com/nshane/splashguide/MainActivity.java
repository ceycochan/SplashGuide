package com.nshane.splashguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_link_home)
    TextView tvLinkHome;
    @BindView(R.id.tv_link_features)
    TextView tvLinkFeatures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }


    private void initView() {
        /**
         * 跳转至设备浏览器
         */
        tvLinkHome.setMovementMethod(LinkMovementMethod.getInstance());
        tvLinkFeatures.setMovementMethod(LinkMovementMethod.getInstance());
    }


    @OnClick({R.id.tv_link_home, R.id.tv_link_features})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_link_home:
                break;
            case R.id.tv_link_features:
                break;
            default:
                break;
        }
    }
}
