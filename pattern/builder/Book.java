package pattern.builder;
import java.util.List;

public class Book {
    private final String title;
    private final String author;
    private final String genre;
    private final int page;
    private final boolean hardCover;
    private final List<String> chapters;

    Book(String title,String author, String genre, int page,
         boolean hardCover, List<String> chapters){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.page = page;
        this.hardCover = hardCover;
        this.chapters = chapters;
    }


    @Override
    public String toString(){
        return "Book {\n" +
               " Title: '"+ title+ "'\n"  +
               " Author: '"+ author+ "'\n" +
               " Genre: '"+ genre + "'\n" +
               " Pages: '"+ page+ "'\n"+
               " hardCover '"+ hardCover+"'\n" +
               " Chapters '"+ chapters+ "'\n" +
                '}';

    }
}