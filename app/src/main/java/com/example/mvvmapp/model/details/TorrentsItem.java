package com.example.mvvmapp.model.details;

import com.google.gson.annotations.SerializedName;

public class TorrentsItem{

	@SerializedName("size_bytes")
	private int sizeBytes;

	@SerializedName("size")
	private String size;

	@SerializedName("seeds")
	private int seeds;

	@SerializedName("date_uploaded")
	private String dateUploaded;

	@SerializedName("peers")
	private int peers;

	@SerializedName("date_uploaded_unix")
	private int dateUploadedUnix;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("hash")
	private String hash;

	@SerializedName("quality")
	private String quality;

	public void setSizeBytes(int sizeBytes){
		this.sizeBytes = sizeBytes;
	}

	public int getSizeBytes(){
		return sizeBytes;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setSeeds(int seeds){
		this.seeds = seeds;
	}

	public int getSeeds(){
		return seeds;
	}

	public void setDateUploaded(String dateUploaded){
		this.dateUploaded = dateUploaded;
	}

	public String getDateUploaded(){
		return dateUploaded;
	}

	public void setPeers(int peers){
		this.peers = peers;
	}

	public int getPeers(){
		return peers;
	}

	public void setDateUploadedUnix(int dateUploadedUnix){
		this.dateUploadedUnix = dateUploadedUnix;
	}

	public int getDateUploadedUnix(){
		return dateUploadedUnix;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHash(String hash){
		this.hash = hash;
	}

	public String getHash(){
		return hash;
	}

	public void setQuality(String quality){
		this.quality = quality;
	}

	public String getQuality(){
		return quality;
	}

	@Override
 	public String toString(){
		return 
			"TorrentsItem{" + 
			"size_bytes = '" + sizeBytes + '\'' + 
			",size = '" + size + '\'' + 
			",seeds = '" + seeds + '\'' + 
			",date_uploaded = '" + dateUploaded + '\'' + 
			",peers = '" + peers + '\'' + 
			",date_uploaded_unix = '" + dateUploadedUnix + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			",hash = '" + hash + '\'' + 
			",quality = '" + quality + '\'' + 
			"}";
		}
}