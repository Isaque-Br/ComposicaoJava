package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();     // ASSOCIAÇÃO COM ARRAYS_LIST

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

    public List<Comment> getComments() {
        return comments;
    }
        // Quando há uma coleção(array) não criamos o metodo set e sim e o metodo addRemve
    public void addComment(Comment comment) {                        // Metodo para adc um comentario, recebendo um comentario como argumento
        comments.add(comment);                                      // Metodo vai na lista de comentarios que chama comments chama o metodo add para adicionar na lista o comentario que veio no argumento do metodo
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public  String toString() {                      // Usando StrinfBuilder para otimizar toString muito grande
        StringBuilder sb = new StringBuilder();     // Stanciando o StringBuilder
        sb.append(title + "\n");                           // Concatenando outros String / acrescentando no final
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c: comments) {                         // Um for each para cada Comment c: na lista<>de comentarios do Post,
            sb.append(c.getText());                         // Acrescenta todos comentarios no StringBuilder
            
        }

        return sb.toString();
    }
}
