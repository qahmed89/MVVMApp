package com.example.mvvmapp.model;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("server_time")
	private int serverTime;

	@SerializedName("server_timezone")
	private String serverTimezone;

	@SerializedName("api_version")
	private int apiVersion;

	@SerializedName("execution_time")
	private String executionTime;

	public void setServerTime(int serverTime){
		this.serverTime = serverTime;
	}

	public int getServerTime(){
		return serverTime;
	}

	public void setServerTimezone(String serverTimezone){
		this.serverTimezone = serverTimezone;
	}

	public String getServerTimezone(){
		return serverTimezone;
	}

	public void setApiVersion(int apiVersion){
		this.apiVersion = apiVersion;
	}

	public int getApiVersion(){
		return apiVersion;
	}

	public void setExecutionTime(String executionTime){
		this.executionTime = executionTime;
	}

	public String getExecutionTime(){
		return executionTime;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"server_time = '" + serverTime + '\'' + 
			",server_timezone = '" + serverTimezone + '\'' + 
			",api_version = '" + apiVersion + '\'' + 
			",execution_time = '" + executionTime + '\'' + 
			"}";
		}
}