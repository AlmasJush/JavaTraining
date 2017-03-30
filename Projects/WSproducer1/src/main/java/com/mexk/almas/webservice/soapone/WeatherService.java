package com.mexk.almas.webservice.soapone;

import javax.jws.*;

@WebService
public interface WeatherService {

	@WebMethod
	String getWeather(String city);
}
