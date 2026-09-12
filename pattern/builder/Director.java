package pattern.builder;
import java.util.List;

public class Director {
    public Book constructFavoriteManga(Builder builder){
        return builder.setTitle("Attack on Titan")
                .setAuthor("Hajime Isayama")
                .setGenre("post-apocalyptic")
                .setPage(200)
                .setHardcover(false)
                .setChapters(List.of("To You, 2,000 Years from Now","Night of the Disbanding Ceremony","Iron Hammer"))
                .build();
    }
    public Book constructFictional(Builder builder, String title,String author){
        return builder.setTitle(title)
                .setAuthor(author)
                .setHardcover(true)
                .setPage(350)
                .build();
    }
}
