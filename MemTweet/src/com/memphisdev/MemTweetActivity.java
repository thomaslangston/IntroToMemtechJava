package com.memphisdev;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MemTweetActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://mobile.twitter.com/searches?q=memtech"));
		
		startActivity(intent);
    }
}