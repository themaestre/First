package com.epanqui.first.ui.main;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.epanqui.first.fragments.Page1;
import com.epanqui.first.fragments.Page2;
import com.epanqui.first.fragments.Page3;
import com.epanqui.first.fragments.Page4;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    //    @StringRes
//    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

//        return PlaceholderFragment.newInstance(position + 1);

        //sustituimos el fragmento único por nuestros cuatro fragmentos, así, el método getItem devuelve el fragmento
        // que corresponde a la posición que se le pasa a la clase Fragment como argumento

        switch (position) {
            case 0:
                return new Page1();
            case 1:
                return new Page2();
            case 2:
                return new Page3();
            case 3:
                return new Page4();
            default:
                return null;
        }

    }
    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}