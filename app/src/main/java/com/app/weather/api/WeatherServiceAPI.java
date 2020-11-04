package com.app.weather.api;


import com.app.weather.model.CurrentWeather.CurrentWeatherResponse;
import com.app.weather.model.ForecastWeather.ForecastWeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WeatherServiceAPI {

    @GET
    Call<CurrentWeatherResponse> getCurrentWeatherResponse(@Url String endUrl);

    @GET
    Call<ForecastWeatherResponse> getForecastWeatherResponse(@Url String forecastEndUrl);


}
