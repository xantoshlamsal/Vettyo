package com.example.dell.vettyo.model;

/**
 * Created by dell on 7/11/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("cid")
    @Expose
    private Integer cid;
    @SerializedName("cname")
    @Expose
    private String cname;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("html_title")
    @Expose
    private String htmlTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("display_index")
    @Expose
    private Object displayIndex;
    @SerializedName("corder")
    @Expose
    private Integer corder;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Object getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Object displayIndex) {
        this.displayIndex = displayIndex;
    }

    public Integer getCorder() {
        return corder;
    }

    public void setCorder(Integer corder) {
        this.corder = corder;
    }

}