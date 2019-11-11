package com.example.mvvmapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MoviesItem{

	@SerializedName("small_cover_image")
	private String smallCoverImage;

	@SerializedName("year")
	private int year;

	@SerializedName("description_full")
	private String descriptionFull;

	@SerializedName("rating")
	private double rating;

	@SerializedName("large_cover_image")
	private String largeCoverImage;

	@SerializedName("title_long")
	private String titleLong;

	@SerializedName("language")
	private String language;

	@SerializedName("yt_trailer_code")
	private String ytTrailerCode;

	@SerializedName("title")
	private String title;

	@SerializedName("mpa_rating")
	private String mpaRating;

	@SerializedName("genres")
	private List<String> genres;

	@SerializedName("title_english")
	private String titleEnglish;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private String state;

	@SerializedName("slug")
	private String slug;

	@SerializedName("summary")
	private String summary;

	@SerializedName("date_uploaded")
	private String dateUploaded;

	@SerializedName("runtime")
	private int runtime;

	@SerializedName("synopsis")
	private String synopsis;

	@SerializedName("url")
	private String url;

	@SerializedName("imdb_code")
	private String imdbCode;

	@SerializedName("background_image")
	private String backgroundImage;

	@SerializedName("torrents")
	private List<TorrentsItem> torrents;

	@SerializedName("date_uploaded_unix")
	private int dateUploadedUnix;

	@SerializedName("background_image_original")
	private String backgroundImageOriginal;

	@SerializedName("medium_cover_image")
	private String mediumCoverImage;

	public void setSmallCoverImage(String smallCoverImage){
		this.smallCoverImage = smallCoverImage;
	}

	public String getSmallCoverImage(){
		return smallCoverImage;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setDescriptionFull(String descriptionFull){
		this.descriptionFull = descriptionFull;
	}

	public String getDescriptionFull(){
		return descriptionFull;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setLargeCoverImage(String largeCoverImage){
		this.largeCoverImage = largeCoverImage;
	}

	public String getLargeCoverImage(){
		return largeCoverImage;
	}

	public void setTitleLong(String titleLong){
		this.titleLong = titleLong;
	}

	public String getTitleLong(){
		return titleLong;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setYtTrailerCode(String ytTrailerCode){
		this.ytTrailerCode = ytTrailerCode;
	}

	public String getYtTrailerCode(){
		return ytTrailerCode;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setMpaRating(String mpaRating){
		this.mpaRating = mpaRating;
	}

	public String getMpaRating(){
		return mpaRating;
	}

	public void setGenres(List<String> genres){
		this.genres = genres;
	}

	public List<String> getGenres(){
		return genres;
	}

	public void setTitleEnglish(String titleEnglish){
		this.titleEnglish = titleEnglish;
	}

	public String getTitleEnglish(){
		return titleEnglish;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setDateUploaded(String dateUploaded){
		this.dateUploaded = dateUploaded;
	}

	public String getDateUploaded(){
		return dateUploaded;
	}

	public void setRuntime(int runtime){
		this.runtime = runtime;
	}

	public int getRuntime(){
		return runtime;
	}

	public void setSynopsis(String synopsis){
		this.synopsis = synopsis;
	}

	public String getSynopsis(){
		return synopsis;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setImdbCode(String imdbCode){
		this.imdbCode = imdbCode;
	}

	public String getImdbCode(){
		return imdbCode;
	}

	public void setBackgroundImage(String backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	public String getBackgroundImage(){
		return backgroundImage;
	}

	public void setTorrents(List<TorrentsItem> torrents){
		this.torrents = torrents;
	}

	public List<TorrentsItem> getTorrents(){
		return torrents;
	}

	public void setDateUploadedUnix(int dateUploadedUnix){
		this.dateUploadedUnix = dateUploadedUnix;
	}

	public int getDateUploadedUnix(){
		return dateUploadedUnix;
	}

	public void setBackgroundImageOriginal(String backgroundImageOriginal){
		this.backgroundImageOriginal = backgroundImageOriginal;
	}

	public String getBackgroundImageOriginal(){
		return backgroundImageOriginal;
	}

	public void setMediumCoverImage(String mediumCoverImage){
		this.mediumCoverImage = mediumCoverImage;
	}

	public String getMediumCoverImage(){
		return mediumCoverImage;
	}

	@Override
 	public String toString(){
		return 
			"MoviesItem{" + 
			"small_cover_image = '" + smallCoverImage + '\'' + 
			",year = '" + year + '\'' + 
			",description_full = '" + descriptionFull + '\'' + 
			",rating = '" + rating + '\'' + 
			",large_cover_image = '" + largeCoverImage + '\'' + 
			",title_long = '" + titleLong + '\'' + 
			",language = '" + language + '\'' + 
			",yt_trailer_code = '" + ytTrailerCode + '\'' + 
			",title = '" + title + '\'' + 
			",mpa_rating = '" + mpaRating + '\'' + 
			",genres = '" + genres + '\'' + 
			",title_english = '" + titleEnglish + '\'' + 
			",id = '" + id + '\'' + 
			",state = '" + state + '\'' + 
			",slug = '" + slug + '\'' + 
			",summary = '" + summary + '\'' + 
			",date_uploaded = '" + dateUploaded + '\'' + 
			",runtime = '" + runtime + '\'' + 
			",synopsis = '" + synopsis + '\'' + 
			",url = '" + url + '\'' + 
			",imdb_code = '" + imdbCode + '\'' + 
			",background_image = '" + backgroundImage + '\'' + 
			",torrents = '" + torrents + '\'' +
			",date_uploaded_unix = '" + dateUploadedUnix + '\'' +
			",background_image_original = '" + backgroundImageOriginal + '\'' + 
			",medium_cover_image = '" + mediumCoverImage + '\'' + 
			"}";
		}
}