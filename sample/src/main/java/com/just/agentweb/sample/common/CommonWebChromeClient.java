package com.just.agentweb.sample.common;

import android.util.Log;

import com.just.agentweb.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

/**
 * @author cenxiaozhong
 * @date 2019/2/19
 * @since 1.0.0
 */
public class CommonWebChromeClient extends WebChromeClient {
	@Override
	public void onProgressChanged(WebView view, int newProgress) {
		  super.onProgressChanged(view, newProgress);
		Log.i("CommonWebChromeClient", "onProgressChanged:" + newProgress + "  view:" + view);
	}
}
