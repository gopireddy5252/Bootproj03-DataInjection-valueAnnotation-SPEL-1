package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menp")
@PropertySource("com/nt/commons/Info.properties")
@Data
public class MenuItemPrices {
	@Value("${menu.dosarate}")
	private Float dosaPrice;
	
	@Value("${menu.idlyrate}")
	private Float idlyPrice;
	
	@Value("${menu.vadarate}")
	private Float vadaPrice;
	
	@Value("${menu.purirate}")
	private Float puriPrice;
	

}
