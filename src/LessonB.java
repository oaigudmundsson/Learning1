import com.blog.Blog;

public class LessonB {
    public static void main(String args[]) {
        Blog blog = new Blog();
        blog.setTitle("My first blog");
        blog.save();

        Blog blog2 = new Blog();
        blog2.setTitle("My second blog");
        blog2.save();
    }
}
