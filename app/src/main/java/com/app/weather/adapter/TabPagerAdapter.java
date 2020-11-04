package com.app.weather.adapter;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.app.weather.utils.Constant;
import com.app.weather.view.fragments.CurrentWeather_Fragment;
import com.app.weather.view.fragments.ForecastedWeather_Fragment;


public class TabPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public TabPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        // passing lat, lng values through ADAPTER into Fragments
        Bundle bundle = new Bundle();
//        bundle.putDouble("lat", Constant.defaultLatLng.DEFAULT_LAT);
//        bundle.putDouble("lng", Constant.defaultLatLng.DEFAULT_LNG);
        bundle.putDouble("lat", Constant.defaultLatLng.DEFAULT_LAT);
        bundle.putDouble("lng", Constant.defaultLatLng.DEFAULT_LNG);

        switch (i){
            case 0:
                CurrentWeather_Fragment currentWeatherFragment = new CurrentWeather_Fragment();
                currentWeatherFragment.setArguments(bundle);
                return currentWeatherFragment;

            case 1:
                ForecastedWeather_Fragment forecastWeatherFragment = new ForecastedWeather_Fragment();
                forecastWeatherFragment.setArguments(bundle);
                return forecastWeatherFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
