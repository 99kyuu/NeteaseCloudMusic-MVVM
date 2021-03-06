package com.netease.music.ui.base.binding_adapter;

import android.graphics.Color;

import androidx.databinding.BindingAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.imooc.lib_common_ui.navigator.CommonNavigatorCreater;
import com.kunminx.architecture.ui.adapter.CommonViewPagerAdapter;
import com.netease.music.R;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;

/**
 * Create by KunMinX at 2020/3/13
 */
public class TabPageBindingAdapter {

    //适用于ViewPager只含有两个的情况
    @BindingAdapter(value = {"initTabAndPage", "currentItem"}, requireAll = false)
    public static void initTabAndPage(MagicIndicator indicator, CharSequence[] title, int currentItem) {
        if (title != null) {
            ViewPager viewPager = (indicator.getRootView()).findViewById(R.id.view_pager);

            indicator.setBackgroundColor(Color.WHITE);
            CommonNavigator commonNavigator = CommonNavigatorCreater.setDefaultNavigator(indicator.getContext(), title, viewPager);
            commonNavigator.setAdjustMode(true);
            indicator.setNavigator(commonNavigator);
            indicator.onPageSelected(1);
            ViewPagerHelper.bind(indicator, viewPager);
            viewPager.setAdapter(new CommonViewPagerAdapter(title.length, false, title));
            viewPager.setCurrentItem(currentItem);
        }

    }

    @BindingAdapter(value = {"tabSelectedListener"}, requireAll = false)
    public static void tabSelectedListener(TabLayout tabLayout, TabLayout.OnTabSelectedListener listener) {
        tabLayout.addOnTabSelectedListener(listener);
    }

}
