package me.akashmaji;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	@Value("${myapp.name}")
	String appName;
	
	@Value("${myapp.version}")
	String appVersion;
	
	public MyApp() {
		
	}
	public MyApp(String name, String ver) {
		this.appName = name;
		this.appVersion = ver;
		
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
}
