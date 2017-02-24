package edu.sbu.cs.android.NMR.adapter;

import edu.sbu.cs.android.NMR.core.SpectraFragment;
import edu.sbu.cs.android.NMR.core.HomeFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Home fragment activity
			return new HomeFragment();
		case 1:
			// Spectra fragment activity
			return new SpectraFragment();

			
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
