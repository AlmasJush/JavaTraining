package com.mexk.almas.webservice.soapone;

import javax.jws.*;

@WebService(endpointInterface="com.mexk.almas.webservice.soapone.WeatherService")
public class WeatherServiceImpl implements WeatherService {
	
	@WebMethod
	public String getWeather(String city) {
		return "overcast";
	}

}
