package com.hb.qx;

import android.content.Context;
import android.content.SharedPreferences;

public class Config {
	

	    public static final String PREFERENCE_NAME = "config";
	    public static final String KEY_ENABLE_WECHAT = "KEY_ENABLE_WECHAT";
	    public static final String KEY_WECHAT_AFTER_OPEN_HONGBAO = "KEY_WECHAT_AFTER_OPEN_HONGBAO";
	    public static final String KEY_WECHAT_DELAY_TIME = "KEY_WECHAT_DELAY_TIME";

	    public static final int WX_AFTER_OPEN_HONGBAO = 0;
	    public static final int WX_AFTER_OPEN_SEE = 1; //看大家手气

	    SharedPreferences preferences;

	    public Config(Context context) {
	        preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
	    }

	    /** 是否启动微信抢红包*/
	    public boolean isEnableWechat() {
	        return preferences.getBoolean(KEY_ENABLE_WECHAT, true);
	    }

	    /** 微信打开红包后的事件*/
	    public int getWechatAfterOpenHongBaoEvent() {
	        int defaultValue = 0;
	        String result =  preferences.getString(KEY_WECHAT_AFTER_OPEN_HONGBAO, String.valueOf(defaultValue));
	        try {
	            return Integer.parseInt(result);
	        } catch (Exception e) {}
	        return defaultValue;
	    }

	    /** 微信打开红包后延时时间*/
	    public int getWechatOpenDelayTime() {
	        int defaultValue = 0;
	        String result = preferences.getString(KEY_WECHAT_DELAY_TIME, String.valueOf(defaultValue));
	        try {
	            return Integer.parseInt(result);
	        } catch (Exception e) {}
	        return defaultValue;
	    }
}
