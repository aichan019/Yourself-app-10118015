package com.adichandra.yourselfapp;

/*
 * NIM   : 10118015
 * NAMA  : Adi Chandra Nugraha
 * KELAS : IF1
 * TGL   : 12/05/2021
 * Deskripsi : Membuat kondisi untuk memunculkan fragment OnboardingScreen
 * */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.adichandra.yourselfapp.fragment.onboarding.FragmentA;
import com.adichandra.yourselfapp.fragment.onboarding.FragmentB;
import com.adichandra.yourselfapp.fragment.onboarding.FragmentC;

import org.jetbrains.annotations.NotNull;

public class ViewPager extends FragmentPagerAdapter {
    public ViewPager(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new FragmentA();
            case 1 : return new FragmentB();
            case 2 : return new FragmentC();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
