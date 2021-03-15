package com.mvc.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class TripDTO {
	private int contentId;
	private String firstImage;
	private String latitude;
	private String longitude;
	private String address;
	private String title;
	private String contentCode;
	private String largeIdx;
	private String mediumCode;
	private String smallCode;
	private String areaCode;
	private String cityCode;
	private String managerId;
	private Date reg_date;
	private Timestamp regDate;
	private int bookmarkCnt;
	private String deactivate;
	private String overview;
	private String contentName;
	private String largeName;
	private String mediumName;
	private String smallName;
	private String areaName;
	private String cityName;
	
	/////
	private int bookmark;
	
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public String getLargeName() {
		return largeName;
	}
	public void setLargeName(String largeName) {
		this.largeName = largeName;
	}
	public String getMediumName() {
		return mediumName;
	}
	public void setMediumName(String mediumName) {
		this.mediumName = mediumName;
	}
	public String getSmallName() {
		return smallName;
	}
	public void setSmallName(String smallName) {
		this.smallName = smallName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	private String area;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	public String getDeactivate() {
		return deactivate;
	}
	public void setDeactivate(String deactivate) {
		this.deactivate = deactivate;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public String getFirstImage() {
		return firstImage;
	}
	public void setFirstImage(String firstImage) {
		this.firstImage = firstImage;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentCode() {
		return contentCode;
	}
	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}
	public String getLargeIdx() {
		return largeIdx;
	}
	public void setLargeIdx(String largeIdx) {
		this.largeIdx = largeIdx;
	}
	public String getMediumCode() {
		return mediumCode;
	}
	public void setMediumCode(String mediumCode) {
		this.mediumCode = mediumCode;
	}
	public String getSmallCode() {
		return smallCode;
	}
	public void setSmallCode(String smallCode) {
		this.smallCode = smallCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public int getBookmarkCnt() {
		return bookmarkCnt;
	}
	public void setBookmarkCnt(int bookmarkCnt) {
		this.bookmarkCnt = bookmarkCnt;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
}
