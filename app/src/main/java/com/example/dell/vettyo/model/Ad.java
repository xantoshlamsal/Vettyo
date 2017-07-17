package com.example.dell.vettyo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 6/26/2017.
 */

public class Ad {

    @SerializedName("adid")
    @Expose
    private Integer adid;
    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("cid")
    @Expose
    private Integer cid;
    @SerializedName("brand")
    @Expose
    private Object brand;
    @SerializedName("model")
    @Expose
    private Object model;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("photo1")
    @Expose
    private String photo1;
    @SerializedName("photo2")
    @Expose
    private Object photo2;
    @SerializedName("photo3")
    @Expose
    private Object photo3;
    @SerializedName("photo4")
    @Expose
    private Object photo4;
    @SerializedName("ip_add")
    @Expose
    private Object ipAdd;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("expiryDate")
    @Expose
    private Object expiryDate;
    @SerializedName("published")
    @Expose
    private Boolean published;
    @SerializedName("sold")
    @Expose
    private Object sold;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("cond")
    @Expose
    private Boolean cond;
    @SerializedName("price_neg")
    @Expose
    private Boolean priceNeg;
    @SerializedName("used_for")
    @Expose
    private String usedFor;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("landmark")
    @Expose
    private Object landmark;
    @SerializedName("quality")
    @Expose
    private Object quality;
    @SerializedName("alert")
    @Expose
    private Object alert;
    @SerializedName("features")
    @Expose
    private List<Object> features = null;

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Object getBrand() {
        return brand;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public Object getPhoto2() {
        return photo2;
    }

    public void setPhoto2(Object photo2) {
        this.photo2 = photo2;
    }

    public Object getPhoto3() {
        return photo3;
    }

    public void setPhoto3(Object photo3) {
        this.photo3 = photo3;
    }

    public Object getPhoto4() {
        return photo4;
    }

    public void setPhoto4(Object photo4) {
        this.photo4 = photo4;
    }

    public Object getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(Object ipAdd) {
        this.ipAdd = ipAdd;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Object getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Object expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Object getSold() {
        return sold;
    }

    public void setSold(Object sold) {
        this.sold = sold;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getCond() {
        return cond;
    }

    public void setCond(Boolean cond) {
        this.cond = cond;
    }

    public Boolean getPriceNeg() {
        return priceNeg;
    }

    public void setPriceNeg(Boolean priceNeg) {
        this.priceNeg = priceNeg;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getLandmark() {
        return landmark;
    }

    public void setLandmark(Object landmark) {
        this.landmark = landmark;
    }

    public Object getQuality() {
        return quality;
    }

    public void setQuality(Object quality) {
        this.quality = quality;
    }

    public Object getAlert() {
        return alert;
    }

    public void setAlert(Object alert) {
        this.alert = alert;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

}