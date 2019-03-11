package com.example.gerard.socialapp.model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.ServerValue;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Post {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public String mediaUrl;
    public String mediaType;
    public long time;
    public Map<String, Boolean> likes = new HashMap<>();

    public Post() {}

    public Post(String uid, String author, String authorPhotoUrl, String content, String mediaUrl, String mediaType, Map time) {
        this.uid = uid;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
        this.time=new Date().getTime();
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("authorPhotoUrl", authorPhotoUrl);
        result.put("content", content);
        result.put("mediaUrl", mediaUrl);
        result.put("mediaType", mediaType);
        result.put("likes", likes);
        result.put("time", time);
        result.put("timestamp", ServerValue.TIMESTAMP);


        return result;
    }
}
