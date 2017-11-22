package com.zhuye.hougong.fragment.message;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cjj.MaterialRefreshLayout;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.message.MessageXiaoXi;
import com.zhuye.hougong.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/21.
 */

public class XiaoxiFragment extends BaseFragment {

    MaterialRefreshLayout materialRefreshLayout;
    RecyclerView recyclerView;
    MessageXiaoXi messageXiaoXi;
    @Override
    protected void initView() {
        materialRefreshLayout = rootView.findViewById(R.id.common_material);
        recyclerView = rootView.findViewById(R.id.commot_recycle);


        List list= new ArrayList();
        for(int i=0;i <3;i++){
            list.add("sdfasdf"+i);
        }
        messageXiaoXi = new MessageXiaoXi(getActivity(),list);

        recyclerView.setAdapter(messageXiaoXi);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    protected int getResId() {
        return R.layout.common_recycle;
    }
}
