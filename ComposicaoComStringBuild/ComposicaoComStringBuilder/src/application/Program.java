package application;

import entities.Comment;                    // Importando metodo
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");         // PARA SETAR DATA E SETAR MASCARA / dd/MM...

        Comment c1 = new Comment("Hava a nice trip!" + "\n");          // CRIANDO UM OBJETO DO TIPO Comment recebendo um novo comentario
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post (                                        // METODO CRIADO ATRAVÉS DE CLASS STANCIADA
                sdf.parse("21/06/2018 13:05:44"),            // sdf.parse recebendo o data
                "Traveling to New Zealand",                         // title do post
                "I'm going to visit this wonderful country!",       // Conteudo do post
                12);                                                // Numero de likes

        p1.addComment(c1);              //ASSOCIANDO COMENTARIO COM O POST
        p1.addComment(c2);

        Comment c3 = new Comment("Good night" + "\n");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow", 5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);          // Desta forma sem toString na classe Post, não aparecerá
        System.out.println(p2);
    }
}