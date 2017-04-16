package com.example.verticallinearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.verticallinearlayout.VerticalLinearLayout.OnPageChangeListener;

public class MainActivity extends Activity
{
	private VerticalLinearLayout mMianLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mMianLayout = (VerticalLinearLayout) findViewById(R.id.id_main_ly);
		mMianLayout.setOnPageChangeListener(new OnPageChangeListener()
		{
			@Override
			public void onPageChange(int currentPage)
			{
				Toast.makeText(MainActivity.this, "at "+(currentPage+1)+"page", Toast.LENGTH_SHORT).show();
			}
		});
	}

}
