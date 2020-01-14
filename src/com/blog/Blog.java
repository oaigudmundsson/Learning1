package com.blog;

public class Blog {

    private String title;
    private String table = "Blogx";

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void save()
    {
        // take this object and send to database
    }


}
