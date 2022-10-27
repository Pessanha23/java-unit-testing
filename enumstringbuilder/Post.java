package enumstringbuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    List<Comment> comment = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void addComment(Comment coment) {
        comment.add(coment);
    }

    public void removeComent(Comment coment) {
        comment.remove(coment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append('\n');
        sb.append( likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment));
        sb.append('\n');
        sb.append(content);
        sb.append('\n');
        for (Comment comment1 : comment) {
            sb.append(comment1.getText());
        }

        return sb.toString();
    }

}
