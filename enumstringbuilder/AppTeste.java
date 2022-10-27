package enumstringbuilder;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AppTeste {

    @Test
    public void teste_1() throws ParseException {
        BancoDeDadosComentario banco = new BancoDeDadosComentario();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand","I'm going to visit this wonderful country!",12);
        Comment comment = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome!");
        post.addComment(comment);
        post.addComment(comment2);

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","See you tomorrow",5);
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the Force be with you");
        post2.addComment(comment3);
        post2.addComment(comment4);

        banco.adicionar(post);
        banco.adicionar(post2);

        banco.imprimiTudo();

        String resultado = banco.imprimiTudo();
        String expectativa = """
             Traveling to New Zealand
             12 Likes - 21/06/2018 13:05:44
             I'm going to visit this wonderful country!
             Comments:\s
             Have a nice trip
             Wow that's awesome!
             Good night guys
             5 Likes - 28/07/2018 23:14:19
             See you tomorrow
             Comments:\s
             Good night
             May the Force be with you
                                """;

        Assert.assertEquals(expectativa,resultado);

    }

}
