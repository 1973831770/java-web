package com.bw.bean;

public class News {

    private  int   newsId;
    private  String  newsTitle;
    private  String  newsAuthor;

    public News() {
    }

    public News(int newsId, String newsTitle, String newsAuthor) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsAuthor = newsAuthor;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsAuthor='" + newsAuthor + '\'' +
                '}';
    }
}
