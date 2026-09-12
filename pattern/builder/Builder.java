package pattern.builder;
import java.util.List;

public interface Builder {
    Builder setTitle(String title);
    Builder setAuthor(String author);
    Builder setGenre(String genre);
    Builder setPage(int page);
    Builder setHardcover(boolean hardCover);
    Builder setChapters(List<String> chapters);

    Book build();
}
