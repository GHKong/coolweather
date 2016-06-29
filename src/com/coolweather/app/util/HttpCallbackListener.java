package com.coolweather.app.util;

public interface HttpCallbackListener {
	void onFinish(String respose);
	void onError(Exception e);

}
