package com.jxtuan.zhongxin;

import com.jxtuan.zhongxin.util.SharePreferenceUtil;

import android.content.Context;

public class APPConfig {

	public static String CHECK_VERSION_TIME = "check_version_time";

	public static String CHECK_HAD_CHECKED = "check_had_checked";
	
	//public static boolean IS_FIRST_MYACCOUNT = true;

	public static String USERNAME = "";
//	public static String PASSWD = "";

	public static String getUserID(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"userid");
	}

	public static String getMobile(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"mobile");
	}

	public static String getAuthState(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"authstate");
	}

	public static String getUsertype(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"usertype");
	}

	public static String getPUserId(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"puserid");
	}

	public static String getCardBindState(Context context) {
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				"bindstate");
	}
	
	public static String getGesturePwd(Context context){
		return CustomApplication.getInstance().getSpUtil().getStringSharedPreferencesData(context,
				SharePreferenceUtil.SHARED_KEY_GESTURE_PWD);
	}
	
	public static boolean isAllowGesture(Context context){
		return CustomApplication.getInstance().getSpUtil().isAllowGesture();
	}

	public static boolean isAuthedUser(Context context) {
		return getAuthState(context).equals("AUTHED");
	}
	
	public static boolean isBindCard(Context context){
		return getCardBindState(context).equals("BINDED")
				|| getCardBindState(context).equals("UPLOAD");
	}
}
