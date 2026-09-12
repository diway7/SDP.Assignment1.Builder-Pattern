package pattern.builder;
import java.util.ArrayList;
import java.util.List;

public class MangaBookBuilder implements Builder{
    private String title;
    private String author;
    private String genre = "Manga";
    private int page;
    private boolean hardCover = false;
    private List<String> chapters = new ArrayList<>();

    @Override
    public Builder setTitle(String title){
        this.title= title;
        return this;
    }
    @Override
    public Builder setAuthor(String author){
        this.author= author;
        return this;
    }
    @Override
    public Builder setGenre(String genre){
        this.genre= genre;
        return this;
    }
    @Override
    public Builder setPage(int page){
        this.page= page;
        return this;
    }
    @Override
    public Builder setHardcover(boolean hardCover){
        this.hardCover =hardCover;
        return this;
    }
    @Override
    public Builder setChapters(List<String> chapters){
        this.chapters= chapters;
        return this;
    }
    @Override
    public Book build(){
        if (title==null || title.isBlank()){
            throw new IllegalStateException("ty cho gde hazvanye knygy");
        }
        if (chapters == null || chapters.isEmpty()) {
            throw new IllegalStateException("manga est glavy");
        }
        if (page <= 0) {
            throw new IllegalStateException("ty sho");
        }
        return new Book(title, author, genre, page, hardCover, chapters);
    }
}
