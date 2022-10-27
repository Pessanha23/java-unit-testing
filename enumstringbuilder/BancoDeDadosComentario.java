package enumstringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BancoDeDadosComentario {

    private List<Post> post = new ArrayList<>();

    public String adicionar(Post posts) {
        post.add(posts);

        return "Sucesso adicionado";
    }

    public String imprimiTudo() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String titulo = "";
        String data = "";
        String data2 = "";
        String content = "";
        String comentarios = "";
        String impressao = "";
        int gostar = 0;

        for (Post post1 : post) {

            for (int i = 0; i < post1.getComment().size(); i++) {
                Comment comentario = post1.getComment().get(i);
                comentarios += comentario.getText() + '\n';

            }
            titulo = post1.getTitle();
            gostar = post1.getLikes();
            data = sdf.format(post1.getMoment());
            content = post1.getContent();

            // no lugar do titulo vc chama o metodo toString que possui  a classe String builder
            impressao += titulo + '\n'
                    + gostar + " Likes - " + data + '\n'
                    + content + '\n'
                    + "Comments: " + '\n'
                    + comentarios;

            comentarios = "";
        }

        return impressao;
    }


}
