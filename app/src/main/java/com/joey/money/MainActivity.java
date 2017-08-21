package com.joey.money;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.joey.money.adapter.GridViewAdapter;
import com.joey.money.bean.Money;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 *  
 *
 * @author joey
 *         created at 2017/8/20 15:17 
 */
public class MainActivity extends Activity {
    private GridView mGvThirdPartyService;
    private GridView mGvTencentService;
    private GridView mGvTimeLimitPromotion;

    private MainActivity mActivity;

    private GridViewAdapter tencentServiceAdapter = null;
    private GridViewAdapter timeLimitPromotionAdapter = null;
    private GridViewAdapter thirdPartyServiceAdapter = null;

    private List<Money> tencentServiceData = null;
    private List<Money> timeLimitPromotionData = null;
    private List<Money> thirdPartyServiceData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;

        initView();
        setData();
    }

    private void initView() {
        mGvTencentService = findViewById(R.id.gv_tencent_service);
        mGvThirdPartyService = findViewById(R.id.gv_third_party_service);
        mGvTimeLimitPromotion = findViewById(R.id.gv_item);
    }

    private void setData() {
        if (tencentServiceData == null) {
            tencentServiceData = new ArrayList<>();
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "信用卡还款"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "微贷借钱"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "手机充值"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "理财通"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "生活缴费"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "城市服务"));
            tencentServiceData.add(new Money(R.drawable.ic_launcher, "腾讯公益"));
        }
        if (tencentServiceAdapter == null) {
            tencentServiceAdapter = new GridViewAdapter(mActivity, tencentServiceData);
            mGvTencentService.setAdapter(tencentServiceAdapter);
        } else {
            tencentServiceAdapter.setData(tencentServiceData);
        }

        if (timeLimitPromotionData == null) {
            timeLimitPromotionData = new ArrayList<>();
            timeLimitPromotionData.add(new Money(R.drawable.ic_launcher, "莫开单车"));
            timeLimitPromotionData.add(new Money(R.drawable.ic_launcher, "熊啊黄车"));
        }
        if (timeLimitPromotionAdapter == null) {
            timeLimitPromotionAdapter = new GridViewAdapter(mActivity, timeLimitPromotionData);
            mGvTimeLimitPromotion.setAdapter(timeLimitPromotionAdapter);
        } else {
            timeLimitPromotionAdapter.setData(timeLimitPromotionData);
        }

        if (thirdPartyServiceData == null) {
            thirdPartyServiceData = new ArrayList<>();
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "蘑菇街"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "淘宝"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "美团"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "糯米团购"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "百度糯米"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "58同城"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "弟弟出行"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "没么米来了"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "饿了么"));
            thirdPartyServiceData.add(new Money(R.drawable.ic_launcher, "我很饿"));
        }
        if (thirdPartyServiceAdapter == null) {
            thirdPartyServiceAdapter = new GridViewAdapter(mActivity, thirdPartyServiceData);
            mGvThirdPartyService.setAdapter(tencentServiceAdapter);
        } else {
            thirdPartyServiceAdapter.setData(thirdPartyServiceData);
        }
    }
}
