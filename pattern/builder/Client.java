package pattern.builder;
import java.util.List;
public class Client {
    public static void main(String[] args){
        Director director= new Director();
        Builder mangaBuilder = new MangaBookBuilder();
        Book favoriteManga = director.constructFavoriteManga(mangaBuilder);
        System.out.println("===whatch===");
        System.out.println(favoriteManga);

        Book fictional = new FictionBookBuilder()
                .setTitle("Hunger Game")
                .setAuthor("Suzanne Collins")
                .setPage(374)
                .setChapters(List.of("The Tributes", "The Games", "The Victor"))
                .build();
        System.out.println("yes whatch");
        System.out.println(fictional);

        try{
            System.out.println("proverka");
            Book invalidBook = new MangaBookBuilder()
                    .setTitle("Bungou stray dogs")
                    .build();
        } catch (IllegalStateException e){
            System.out.println("have the error" + e.getMessage());
        }
    }
}
