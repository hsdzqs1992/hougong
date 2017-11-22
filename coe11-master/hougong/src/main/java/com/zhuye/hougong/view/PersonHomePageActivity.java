package com.zhuye.hougong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.zhuye.hougong.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PersonHomePageActivity extends AppCompatActivity {

    @BindView(R.id.person_home_back)
    ImageView personHomeBack;
    @BindView(R.id.person_home_touxiang)
    ImageView personHomeTouxiang;
    @BindView(R.id.person_home_name)
    TextView personHomeName;
    @BindView(R.id.person_home_id)
    TextView personHomeId;
    @BindView(R.id.person_home_vip)
    TextView personHomeVip;
    @BindView(R.id.person_home_persondetail)
    ImageView personHomePersondetail;
    @BindView(R.id.person_home_slider)
    SliderLayout personHomeSlider;
    @BindView(R.id.person_home_age)
    TextView personHomeAge;
    @BindView(R.id.person_home_dizhi)
    TextView personHomeDizhi;
    @BindView(R.id.person_home_jietong)
    TextView personHomeJietong;
    @BindView(R.id.person_home_gengxin_time)
    TextView personHomeGengxinTime;
    @BindView(R.id.person_home_video)
    TextView personHomeVideo;
    @BindView(R.id.person_home_audio)
    TextView personHomeAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_home_page);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.person_home_back, R.id.person_home_touxiang, R.id.person_home_name, R.id.person_home_id, R.id.person_home_vip, R.id.person_home_persondetail, R.id.person_home_slider, R.id.person_home_age, R.id.person_home_dizhi, R.id.person_home_jietong, R.id.person_home_gengxin_time, R.id.person_home_video, R.id.person_home_audio})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.person_home_back:
                break;
            case R.id.person_home_touxiang:
                break;
            case R.id.person_home_name:
                break;
            case R.id.person_home_id:
                break;
            case R.id.person_home_vip:
                break;
            case R.id.person_home_persondetail:
                startActivity(new Intent(PersonHomePageActivity.this,OtherPersonDetailActivity.class));
                break;
            case R.id.person_home_slider:
                break;
            case R.id.person_home_age:
                break;
            case R.id.person_home_dizhi:
                break;
            case R.id.person_home_jietong:
                break;
            case R.id.person_home_gengxin_time:
                break;
            case R.id.person_home_video:
                break;
            case R.id.person_home_audio:
                break;
        }
    }
}
