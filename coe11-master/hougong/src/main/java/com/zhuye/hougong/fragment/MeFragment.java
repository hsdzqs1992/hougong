package com.zhuye.hougong.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BaseHolder;
import com.zhuye.hougong.adapter.me.MeBottomAdapter;
import com.zhuye.hougong.utils.SpUtils;
import com.zhuye.hougong.view.FansActivity;
import com.zhuye.hougong.view.GuanZhuActivity;
import com.zhuye.hougong.view.LoginActivity;
import com.zhuye.hougong.view.LookMeActivity;
import com.zhuye.hougong.view.MyFriendsActivity;
import com.zhuye.hougong.view.MyWaletActivity;
import com.zhuye.hougong.view.PersonDetailActivity;
import com.zhuye.hougong.view.SettingsActivity;
import com.zhuye.hougong.view.ShengVIP1Activity;
import com.zhuye.hougong.view.WhoSendLiWuActivity;
import com.zhuye.hougong.view.YanQingJiangLiActivity;
import com.zhuye.hougong.view.ZiPaiActivity;
import com.zhuye.hougong.weidgt.RoundedCornerImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by zzzy on 2017/11/20.
 */

public class MeFragment extends Fragment {


    //private MyToolbar myToolbar;

    RoundedCornerImageView cornerImageView;
    ImageView setiv;
    @BindView(R.id.tv_follow)
    TextView tvFollow;
    @BindView(R.id.tv_fans)
    TextView tvFans;
    @BindView(R.id.tv_friends)
    TextView tvFriends;
    Unbinder unbinder;
    @BindView(R.id.me_recycleview)
    RecyclerView meRecycleview;
    MeBottomAdapter meBottomAdapter;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_mee, null);

        //myToolbar = view.findViewById(R.id.mee_toolbar);

        // myToolbar.hideView(myToolbar.homeLeftIcon);
        cornerImageView = view.findViewById(R.id.avatar);
        setiv = view.findViewById(R.id.iv_set);


        unbinder = ButterKnife.bind(this, view);


        List<String> data = new ArrayList<>();

            data.add("我的钱包");
            data.add("自拍认证");
            data.add("邀请奖励");
            data.add("谁看过我");
            data.add("谁送过礼物");
            data.add("升级VIP");

        meBottomAdapter= new MeBottomAdapter(getActivity(),data);
        meRecycleview.setAdapter(meBottomAdapter);
        meRecycleview.setLayoutManager(new GridLayoutManager(getActivity(),3));
        initListener();
        return view;
    }

    private void initListener() {

        cornerImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String token = SpUtils.getString(getActivity(), "token", "");
                if (TextUtils.isEmpty(token)) {

                    //没登录
                    startActivity(new Intent(getActivity(), LoginActivity.class));
                } else {
                    //登录
                    startActivity(new Intent(getActivity(), PersonDetailActivity.class));
                }
            }
        });
        setiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SettingsActivity.class));
            }
        });

        meBottomAdapter.setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getActivity(), MyWaletActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getActivity(), ZiPaiActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getActivity(), YanQingJiangLiActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getActivity(), LookMeActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getActivity(), WhoSendLiWuActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(getActivity(), ShengVIP1Activity.class));
                        break;
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.tv_follow, R.id.tv_fans, R.id.tv_friends})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_follow:
                startActivity(new Intent(getActivity(), GuanZhuActivity.class));
                break;
            case R.id.tv_fans:
                startActivity(new Intent(getActivity(), FansActivity.class));
                break;
            case R.id.tv_friends:
               startActivity(new Intent(getActivity(), MyFriendsActivity.class));
                break;
        }
    }
}
