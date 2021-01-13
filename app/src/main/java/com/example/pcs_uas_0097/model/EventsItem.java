package com.example.pcs_uas_0097.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class EventsItem implements Parcelable {

	@SerializedName("strOfficial")
	private String strOfficial;

	@SerializedName("intHomeShots")
	private Object intHomeShots;

	@SerializedName("strSport")
	private String strSport;

	@SerializedName("strHomeLineupDefense")
	private Object strHomeLineupDefense;

	@SerializedName("strAwayLineupSubstitutes")
	private Object strAwayLineupSubstitutes;

	@SerializedName("strTweet1")
	private String strTweet1;

	@SerializedName("strTweet2")
	private String strTweet2;

	@SerializedName("strTweet3")
	private String strTweet3;

	@SerializedName("idLeague")
	private String idLeague;

	@SerializedName("idSoccerXML")
	private Object idSoccerXML;

	@SerializedName("strHomeLineupForward")
	private Object strHomeLineupForward;

	@SerializedName("strTVStation")
	private Object strTVStation;

	@SerializedName("strHomeGoalDetails")
	private String strHomeGoalDetails;

	@SerializedName("strVideo")
	private String strVideo;

	@SerializedName("strAwayLineupGoalkeeper")
	private Object strAwayLineupGoalkeeper;

	@SerializedName("strAwayLineupMidfield")
	private Object strAwayLineupMidfield;

	@SerializedName("idEvent")
	private String idEvent;

	@SerializedName("intRound")
	private String intRound;

	@SerializedName("strHomeYellowCards")
	private Object strHomeYellowCards;

	@SerializedName("idHomeTeam")
	private String idHomeTeam;

	@SerializedName("intHomeScore")
	private String intHomeScore;

	@SerializedName("dateEvent")
	private String dateEvent;

	@SerializedName("strCountry")
	private String strCountry;

	@SerializedName("strTimestamp")
	private String strTimestamp;

	@SerializedName("strAwayTeam")
	private String strAwayTeam;

	@SerializedName("strHomeLineupMidfield")
	private Object strHomeLineupMidfield;

	@SerializedName("strPostponed")
	private String strPostponed;

	@SerializedName("strDate")
	private Object strDate;

	@SerializedName("strHomeFormation")
	private Object strHomeFormation;

	@SerializedName("strMap")
	private Object strMap;

	@SerializedName("idAwayTeam")
	private String idAwayTeam;

	@SerializedName("strAwayRedCards")
	private Object strAwayRedCards;

	@SerializedName("strBanner")
	private Object strBanner;

	@SerializedName("strFanart")
	private Object strFanart;

	@SerializedName("strDescriptionEN")
	private String strDescriptionEN;

	@SerializedName("dateEventLocal")
	private String dateEventLocal;

	@SerializedName("strResult")
	private String strResult;

	@SerializedName("intAwayShots")
	private Object intAwayShots;

	@SerializedName("strFilename")
	private String strFilename;

	@SerializedName("strTime")
	private String strTime;

	@SerializedName("strVenue")
	private String strVenue;

	@SerializedName("strAwayGoalDetails")
	private String strAwayGoalDetails;

	@SerializedName("strAwayLineupForward")
	private Object strAwayLineupForward;

	@SerializedName("strTimeLocal")
	private String strTimeLocal;

	@SerializedName("idAPIfootball")
	private String idAPIfootball;

	@SerializedName("strLocked")
	private String strLocked;

	@SerializedName("strSeason")
	private String strSeason;

	@SerializedName("intSpectators")
	private Object intSpectators;

	@SerializedName("strEventAlternate")
	private String strEventAlternate;

	@SerializedName("strHomeRedCards")
	private Object strHomeRedCards;

	@SerializedName("strHomeLineupGoalkeeper")
	private Object strHomeLineupGoalkeeper;

	@SerializedName("strHomeLineupSubstitutes")
	private Object strHomeLineupSubstitutes;

	@SerializedName("strAwayFormation")
	private Object strAwayFormation;

	@SerializedName("strEvent")
	private String strEvent;

	@SerializedName("strAwayYellowCards")
	private Object strAwayYellowCards;

	@SerializedName("strAwayLineupDefense")
	private Object strAwayLineupDefense;

	@SerializedName("strHomeTeam")
	private String strHomeTeam;

	@SerializedName("strThumb")
	private String strThumb;

	@SerializedName("strLeague")
	private String strLeague;

	@SerializedName("intAwayScore")
	private String intAwayScore;

	@SerializedName("strCity")
	private String strCity;

	@SerializedName("strPoster")
	private Object strPoster;

	@SerializedName("strStatus")
	private String strStatus;



	protected EventsItem(Parcel in) {
		strOfficial = in.readString();
		strSport = in.readString();
		strTweet1 = in.readString();
		strTweet2 = in.readString();
		strTweet3 = in.readString();
		idLeague = in.readString();
		strHomeGoalDetails = in.readString();
		strVideo = in.readString();
		idEvent = in.readString();
		intRound = in.readString();
		idHomeTeam = in.readString();
		intHomeScore = in.readString();
		dateEvent = in.readString();
		strCountry = in.readString();
		strTimestamp = in.readString();
		strAwayTeam = in.readString();
		strPostponed = in.readString();
		idAwayTeam = in.readString();
		strDescriptionEN = in.readString();
		dateEventLocal = in.readString();
		strResult = in.readString();
		strFilename = in.readString();
		strTime = in.readString();
		strVenue = in.readString();
		strAwayGoalDetails = in.readString();
		strTimeLocal = in.readString();
		idAPIfootball = in.readString();
		strLocked = in.readString();
		strSeason = in.readString();
		strEventAlternate = in.readString();
		strEvent = in.readString();
		strHomeTeam = in.readString();
		strThumb = in.readString();
		strLeague = in.readString();
		intAwayScore = in.readString();
		strCity = in.readString();
		strStatus = in.readString();
	}

	public static final Creator<EventsItem> CREATOR = new Creator<EventsItem>() {
		@Override
		public EventsItem createFromParcel(Parcel in) {
			return new EventsItem(in);
		}

		@Override
		public EventsItem[] newArray(int size) {
			return new EventsItem[size];
		}
	};

	public void setStrOfficial(String strOfficial){
		this.strOfficial = strOfficial;
	}

	public String getStrOfficial(){
		return strOfficial;
	}

	public void setIntHomeShots(Object intHomeShots){
		this.intHomeShots = intHomeShots;
	}

	public Object getIntHomeShots(){
		return intHomeShots;
	}

	public void setStrSport(String strSport){
		this.strSport = strSport;
	}

	public String getStrSport(){
		return strSport;
	}

	public void setStrHomeLineupDefense(Object strHomeLineupDefense){
		this.strHomeLineupDefense = strHomeLineupDefense;
	}

	public Object getStrHomeLineupDefense(){
		return strHomeLineupDefense;
	}

	public void setStrAwayLineupSubstitutes(Object strAwayLineupSubstitutes){
		this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
	}

	public Object getStrAwayLineupSubstitutes(){
		return strAwayLineupSubstitutes;
	}

	public void setStrTweet1(String strTweet1){
		this.strTweet1 = strTweet1;
	}

	public String getStrTweet1(){
		return strTweet1;
	}

	public void setStrTweet2(String strTweet2){
		this.strTweet2 = strTweet2;
	}

	public String getStrTweet2(){
		return strTweet2;
	}

	public void setStrTweet3(String strTweet3){
		this.strTweet3 = strTweet3;
	}

	public String getStrTweet3(){
		return strTweet3;
	}

	public void setIdLeague(String idLeague){
		this.idLeague = idLeague;
	}

	public String getIdLeague(){
		return idLeague;
	}

	public void setIdSoccerXML(Object idSoccerXML){
		this.idSoccerXML = idSoccerXML;
	}

	public Object getIdSoccerXML(){
		return idSoccerXML;
	}

	public void setStrHomeLineupForward(Object strHomeLineupForward){
		this.strHomeLineupForward = strHomeLineupForward;
	}

	public Object getStrHomeLineupForward(){
		return strHomeLineupForward;
	}

	public void setStrTVStation(Object strTVStation){
		this.strTVStation = strTVStation;
	}

	public Object getStrTVStation(){
		return strTVStation;
	}

	public void setStrHomeGoalDetails(String strHomeGoalDetails){
		this.strHomeGoalDetails = strHomeGoalDetails;
	}

	public String getStrHomeGoalDetails(){
		return strHomeGoalDetails;
	}

	public void setStrVideo(String strVideo){
		this.strVideo = strVideo;
	}

	public String getStrVideo(){
		return strVideo;
	}

	public void setStrAwayLineupGoalkeeper(Object strAwayLineupGoalkeeper){
		this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
	}

	public Object getStrAwayLineupGoalkeeper(){
		return strAwayLineupGoalkeeper;
	}

	public void setStrAwayLineupMidfield(Object strAwayLineupMidfield){
		this.strAwayLineupMidfield = strAwayLineupMidfield;
	}

	public Object getStrAwayLineupMidfield(){
		return strAwayLineupMidfield;
	}

	public void setIdEvent(String idEvent){
		this.idEvent = idEvent;
	}

	public String getIdEvent(){
		return idEvent;
	}

	public void setIntRound(String intRound){
		this.intRound = intRound;
	}

	public String getIntRound(){
		return intRound;
	}

	public void setStrHomeYellowCards(Object strHomeYellowCards){
		this.strHomeYellowCards = strHomeYellowCards;
	}

	public Object getStrHomeYellowCards(){
		return strHomeYellowCards;
	}

	public void setIdHomeTeam(String idHomeTeam){
		this.idHomeTeam = idHomeTeam;
	}

	public String getIdHomeTeam(){
		return idHomeTeam;
	}

	public void setIntHomeScore(String intHomeScore){
		this.intHomeScore = intHomeScore;
	}

	public String getIntHomeScore(){
		return intHomeScore;
	}

	public void setDateEvent(String dateEvent){
		this.dateEvent = dateEvent;
	}

	public String getDateEvent(){
		return dateEvent;
	}

	public void setStrCountry(String strCountry){
		this.strCountry = strCountry;
	}

	public String getStrCountry(){
		return strCountry;
	}

	public void setStrTimestamp(String strTimestamp){
		this.strTimestamp = strTimestamp;
	}

	public String getStrTimestamp(){
		return strTimestamp;
	}

	public void setStrAwayTeam(String strAwayTeam){
		this.strAwayTeam = strAwayTeam;
	}

	public String getStrAwayTeam(){
		return strAwayTeam;
	}

	public void setStrHomeLineupMidfield(Object strHomeLineupMidfield){
		this.strHomeLineupMidfield = strHomeLineupMidfield;
	}

	public Object getStrHomeLineupMidfield(){
		return strHomeLineupMidfield;
	}

	public void setStrPostponed(String strPostponed){
		this.strPostponed = strPostponed;
	}

	public String getStrPostponed(){
		return strPostponed;
	}

	public void setStrDate(Object strDate){
		this.strDate = strDate;
	}

	public Object getStrDate(){
		return strDate;
	}

	public void setStrHomeFormation(Object strHomeFormation){
		this.strHomeFormation = strHomeFormation;
	}

	public Object getStrHomeFormation(){
		return strHomeFormation;
	}

	public void setStrMap(Object strMap){
		this.strMap = strMap;
	}

	public Object getStrMap(){
		return strMap;
	}

	public void setIdAwayTeam(String idAwayTeam){
		this.idAwayTeam = idAwayTeam;
	}

	public String getIdAwayTeam(){
		return idAwayTeam;
	}

	public void setStrAwayRedCards(Object strAwayRedCards){
		this.strAwayRedCards = strAwayRedCards;
	}

	public Object getStrAwayRedCards(){
		return strAwayRedCards;
	}

	public void setStrBanner(Object strBanner){
		this.strBanner = strBanner;
	}

	public Object getStrBanner(){
		return strBanner;
	}

	public void setStrFanart(Object strFanart){
		this.strFanart = strFanart;
	}

	public Object getStrFanart(){
		return strFanart;
	}

	public void setStrDescriptionEN(String strDescriptionEN){
		this.strDescriptionEN = strDescriptionEN;
	}

	public String getStrDescriptionEN(){
		return strDescriptionEN;
	}

	public void setDateEventLocal(String dateEventLocal){
		this.dateEventLocal = dateEventLocal;
	}

	public String getDateEventLocal(){
		return dateEventLocal;
	}

	public void setStrResult(String strResult){
		this.strResult = strResult;
	}

	public String getStrResult(){
		return strResult;
	}

	public void setIntAwayShots(Object intAwayShots){
		this.intAwayShots = intAwayShots;
	}

	public Object getIntAwayShots(){
		return intAwayShots;
	}

	public void setStrFilename(String strFilename){
		this.strFilename = strFilename;
	}

	public String getStrFilename(){
		return strFilename;
	}

	public void setStrTime(String strTime){
		this.strTime = strTime;
	}

	public String getStrTime(){
		return strTime;
	}

	public void setStrVenue(String strVenue){
		this.strVenue = strVenue;
	}

	public String getStrVenue(){
		return strVenue;
	}

	public void setStrAwayGoalDetails(String strAwayGoalDetails){
		this.strAwayGoalDetails = strAwayGoalDetails;
	}

	public String getStrAwayGoalDetails(){
		return strAwayGoalDetails;
	}

	public void setStrAwayLineupForward(Object strAwayLineupForward){
		this.strAwayLineupForward = strAwayLineupForward;
	}

	public Object getStrAwayLineupForward(){
		return strAwayLineupForward;
	}

	public void setStrTimeLocal(String strTimeLocal){
		this.strTimeLocal = strTimeLocal;
	}

	public String getStrTimeLocal(){
		return strTimeLocal;
	}

	public void setIdAPIfootball(String idAPIfootball){
		this.idAPIfootball = idAPIfootball;
	}

	public String getIdAPIfootball(){
		return idAPIfootball;
	}

	public void setStrLocked(String strLocked){
		this.strLocked = strLocked;
	}

	public String getStrLocked(){
		return strLocked;
	}

	public void setStrSeason(String strSeason){
		this.strSeason = strSeason;
	}

	public String getStrSeason(){
		return strSeason;
	}

	public void setIntSpectators(Object intSpectators){
		this.intSpectators = intSpectators;
	}

	public Object getIntSpectators(){
		return intSpectators;
	}

	public void setStrEventAlternate(String strEventAlternate){
		this.strEventAlternate = strEventAlternate;
	}

	public String getStrEventAlternate(){
		return strEventAlternate;
	}

	public void setStrHomeRedCards(Object strHomeRedCards){
		this.strHomeRedCards = strHomeRedCards;
	}

	public Object getStrHomeRedCards(){
		return strHomeRedCards;
	}

	public void setStrHomeLineupGoalkeeper(Object strHomeLineupGoalkeeper){
		this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
	}

	public Object getStrHomeLineupGoalkeeper(){
		return strHomeLineupGoalkeeper;
	}

	public void setStrHomeLineupSubstitutes(Object strHomeLineupSubstitutes){
		this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
	}

	public Object getStrHomeLineupSubstitutes(){
		return strHomeLineupSubstitutes;
	}

	public void setStrAwayFormation(Object strAwayFormation){
		this.strAwayFormation = strAwayFormation;
	}

	public Object getStrAwayFormation(){
		return strAwayFormation;
	}

	public void setStrEvent(String strEvent){
		this.strEvent = strEvent;
	}

	public String getStrEvent(){
		return strEvent;
	}

	public void setStrAwayYellowCards(Object strAwayYellowCards){
		this.strAwayYellowCards = strAwayYellowCards;
	}

	public Object getStrAwayYellowCards(){
		return strAwayYellowCards;
	}

	public void setStrAwayLineupDefense(Object strAwayLineupDefense){
		this.strAwayLineupDefense = strAwayLineupDefense;
	}

	public Object getStrAwayLineupDefense(){
		return strAwayLineupDefense;
	}

	public void setStrHomeTeam(String strHomeTeam){
		this.strHomeTeam = strHomeTeam;
	}

	public String getStrHomeTeam(){
		return strHomeTeam;
	}

	public void setStrThumb(String strThumb){
		this.strThumb = strThumb;
	}

	public String getStrThumb(){
		return strThumb;
	}

	public void setStrLeague(String strLeague){
		this.strLeague = strLeague;
	}

	public String getStrLeague(){
		return strLeague;
	}

	public void setIntAwayScore(String intAwayScore){
		this.intAwayScore = intAwayScore;
	}

	public String getIntAwayScore(){
		return intAwayScore;
	}

	public void setStrCity(String strCity){
		this.strCity = strCity;
	}

	public String getStrCity(){
		return strCity;
	}

	public void setStrPoster(Object strPoster){
		this.strPoster = strPoster;
	}

	public Object getStrPoster(){
		return strPoster;
	}

	public void setStrStatus(String strStatus){
		this.strStatus = strStatus;
	}

	public String getStrStatus(){
		return strStatus;
	}


	public EventsItem() {

	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(strOfficial);
		dest.writeString(strSport);
		dest.writeString(strTweet1);
		dest.writeString(strTweet2);
		dest.writeString(strTweet3);
		dest.writeString(idLeague);
		dest.writeString(strHomeGoalDetails);
		dest.writeString(strVideo);
		dest.writeString(idEvent);
		dest.writeString(intRound);
		dest.writeString(idHomeTeam);
		dest.writeString(intHomeScore);
		dest.writeString(dateEvent);
		dest.writeString(strCountry);
		dest.writeString(strTimestamp);
		dest.writeString(strAwayTeam);
		dest.writeString(strPostponed);
		dest.writeString(idAwayTeam);
		dest.writeString(strDescriptionEN);
		dest.writeString(dateEventLocal);
		dest.writeString(strResult);
		dest.writeString(strFilename);
		dest.writeString(strTime);
		dest.writeString(strVenue);
		dest.writeString(strAwayGoalDetails);
		dest.writeString(strTimeLocal);
		dest.writeString(idAPIfootball);
		dest.writeString(strLocked);
		dest.writeString(strSeason);
		dest.writeString(strEventAlternate);
		dest.writeString(strEvent);
		dest.writeString(strHomeTeam);
		dest.writeString(strThumb);
		dest.writeString(strLeague);
		dest.writeString(intAwayScore);
		dest.writeString(strCity);
		dest.writeString(strStatus);
	}
}