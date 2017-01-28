package fr.pootis.todoleast;

/**
 * Created by querat_g on 24/01/17.
 */

public class TaskItem
{
    private String title;
    private String text;
    private String date;

    public TaskItem(String ttitle, String ttext, String ddate){
        this.title = ttitle;
        this.text = ttext;
        this.date = ddate;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return this.date;
    }
    public void setDate(String ddate) {
        this.date = ddate;
    }



}
