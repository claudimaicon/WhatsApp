package com.example.samsung.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragController extends FragmentPagerAdapter{

        public FragController(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Camera();
                case 1:
                    return new Chatscreen();
                case 2:
                    return new Status();
                case 3:
                    return new Calls();
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "";
                case 1:
                    return "Conversas";
                case 2:
                    return "Status";
                case 3:
                    return "Chamadas";
                default:
                    return "NULL";
            }
        }

        @Override
        public int getCount() {
            return 4;
        }{}
}
