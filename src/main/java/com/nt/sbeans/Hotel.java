package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotel")
@PropertySource("com/nt/commons/Info.properties")
@Data
public class Hotel {
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${hotel.addr}")
	private String hotelAddr;
	
	@Value("#{menp.dosaPrice+menp.vadaPrice}")
	private Float totalbill;
	
	@Value("${customer.name}")
	private String customerName;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${path}")
	private String path;
}
