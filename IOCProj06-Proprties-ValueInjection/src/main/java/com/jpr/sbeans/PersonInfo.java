package com.jpr.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonInfo {
//	Injecting the values from proprties file
	@Value("${per.id}")
	private int id;
	@Value("${per.name}")
	private String name;
	@Value("${per.billamt}")
	private double billAmount;
//	Injecting the value directly
	@Value("hyd")
	private String adress;

//	Injecting the System property values
	
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private String osVersion;
	
//	Injecting the Environmentvariable values
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", billAmount=" + billAmount + ", adress=" + adress
				+ ", osName=" + osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	}
	
	
	

}
