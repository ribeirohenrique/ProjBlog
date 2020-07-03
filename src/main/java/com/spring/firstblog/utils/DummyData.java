package com.spring.firstblog.utils;

import com.spring.firstblog.model.Post;
import com.spring.firstblog.repository.FirstblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    FirstblogRepository firstblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Tolkien");
        post1.setData(LocalDate.now());
        post1.setTitulo("Tom Bombadil");
        post1.setTexto("Tom Bombadil é um personagem obscuro do mundo do Senhor dos Anéis, uma espécie de hippie medieval. Para quem pensa que Wagner foi o primeiro a falar com as florestas, pode tirar o cavalinho da chuva.");

        Post post2 = new Post();
        post2.setAutor("Tolkien");
        post2.setData(LocalDate.now());
        post2.setTitulo("Fruta D'ouro");
        post2.setTexto("Fruta D'ouro cantava uma alegre canção do Marilyn Manson, quando Tom gritou que ela tinha clientes. Se animou como nunca e naquele dia, resolveu tomar seu primeiro banho em 11 anos. ");

        Post post3 = new Post();
        post3.setAutor("Tolkien");
        post3.setData(LocalDate.now());
        post3.setTitulo("Frodo Bolseiro");
        post3.setTexto("Certa vez na festa de onzenta e um anos de Bilbo, que também era o aniversário de dois mil anos da Dercy Gonçalves e quando Fodo se tornaria maior de idade e poderia se casar com Sam, Bilbo parou o seu discurso e disse: Mais é claro! A resposta é 42! E sumiu no meio da festa. ");

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        for (Post post : postList){
            Post postSaved = firstblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
