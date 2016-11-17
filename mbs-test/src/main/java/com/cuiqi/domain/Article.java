package com.cuiqi.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by 01439613 on 2016/11/14.
 */
public class Article {

    private Integer id;//

    private User Author;//作者

    private String title;//标题

    private String content;//内容

    private Integer views;//浏览次数

    private Date createTime;//创建时间

    private Integer createBy;//创建人

    private Date updateTime;//修改时间

    private Integer updateBy;//修改人

    private List<ArticleComment> commentList;//评论列表

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getAuthor() {
        return Author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public List<ArticleComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<ArticleComment> commentList) {
        this.commentList = commentList;
    }
}
