package com.example.baseadapter;
public class ListItem {

    private int imagenResId;
    private String title;
    private String content;

    public ListItem(int imagenResId, String title, String content){
        this.imagenResId = imagenResId;
        this.title = title;
        this.content=content;
    }
    public  int getImagenResId(){ return imagenResId;}
    public String getTitle(){ return title;}
    public String getContent(){ return content;}

}
