package com.example.govege;

import pagefragment.MainPageFragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;

	ViewPager mViewPager;


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		
		
		/***
		 * Make custom actionbar with search jump 
		 */
		// inflate custon layout
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		final ViewGroup actionBarLayout = (ViewGroup) getLayoutInflater().
				inflate(R.layout.actionbar_main_page, null);
		final ActionBar actionBar = this.getSupportActionBar();
		/* save actionbar for later use
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setCustomView(actionBarLayout);
		*/
		actionBar.hide();
		
		setContentView(R.layout.activity_main);
		//set tab strip
		final PagerTabStrip tabStrip = (PagerTabStrip) this.findViewById(R.id.tap_strip_title);
		tabStrip.setDrawFullUnderline(false);
		tabStrip.setTabIndicatorColor(Color.DKGRAY);
		tabStrip.setBackgroundColor(Color.WHITE);
		tabStrip.setNonPrimaryAlpha(0.5f);
		tabStrip.setTextSpacing(25);
		tabStrip.setTextColor(Color.BLACK);
		tabStrip.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);

		// Create the adapter that will return a fragment for each of the three

		// primary sections of the activity.

		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
		RelativeLayout search = (RelativeLayout) this.findViewById(R.id.search_relativeLayout);
		search.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				goToSearchPage();
			}
			
		});
		
		

	}
	
	private void goToSearchPage(){
		Intent i = new Intent(this, SearchActivity.class);
		this.startActivity(i);
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to

	 * one of the sections/tabs/pages.

	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {
		
		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
			switch(position){
				default:
					return new MainPageFragment();
				case 0:
					return new MainPageFragment();
				case 1:
					return new MainPageFragment();
				case 2:
					return new MainPageFragment();
			}
		}


		@Override
		public int getCount() {
			// Show 3 total pages.
			return 3;

		}

		@Override
		public CharSequence getPageTitle(int position) {
			//Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return "1st page";//getString(R.string.title_section1).toUpperCase(l);
			case 1:
				return "2nd page";//getString(R.string.title_section2).toUpperCase(l);
			case 2:
				return "3rd page";//getString(R.string.title_section3).toUpperCase(l);
			}
			return null;

		}
	}



	

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {


		// Inflate the menu; this adds items to the action bar if it is present.

		getMenuInflater().inflate(R.menu.main, menu);

		return true;

	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Handle action bar item clicks here. The action bar will

		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		int id = item.getItemId();

		if (id == R.id.action_settings) {

			return true;

		}
		return super.onOptionsItemSelected(item);

	}

	*/


}
