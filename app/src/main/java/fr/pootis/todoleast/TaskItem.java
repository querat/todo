package fr.pootis.todoleast;

/**
 * Created by querat_g on 24/01/17.
 */

public class TaskItem
{

    private long id;
    private String title;
    private String content;
    private String date;

    public TaskItem(long iid, String ttitle, String ccontent, String ddate){
        this.id = iid;
        this.title = ttitle;
        this.content = ccontent;
        this.date = ddate;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    public void setContent(String ccontent) {
        this.content = ccontent;
    }

    public String getDate() {
        return this.date;
    }
    public void setDate(String ddate) {
        this.date = ddate;
    }

    public long getId() { return this.id; }
    public void setId(long id) { this.id = id; }

}
