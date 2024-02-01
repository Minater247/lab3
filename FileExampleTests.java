import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileExampleTests {

    @Test
    public void testGetFiles() throws IOException {
        File f = new File("some-files/");
        List<File> result = FileExample.getFiles(f);
        assertEquals(5, result.size());
        assertEquals(new File("some-files/a.txt"), result.get(0));
        assertEquals(new File("some-files/more-files/b.txt"), result.get(1));
        assertEquals(new File("some-files/more-files/c.java"), result.get(2));
        assertEquals(new File("some-files/more-files/even-more-files/a.txt"), result.get(3));
        assertEquals(new File("some-files/more-files/even-more-files/d.java"), result.get(4));
    }

    @Test
    public void testGetFiles2() throws IOException {
        File f = new File("some-files/more-files");
        List<File> result = FileExample.getFiles(f);
        assertEquals(4, result.size());
        assertEquals(new File("some-files/more-files/b.txt"), result.get(0));
        assertEquals(new File("some-files/more-files/c.java"), result.get(1));
        assertEquals(new File("some-files/more-files/even-more-files/a.txt"), result.get(2));
        assertEquals(new File("some-files/more-files/even-more-files/d.java"), result.get(3));
    }

    @Test
    public void testGetFiles3() throws IOException {
        File f = new File("some-files/a.txt");
        List<File> result = FileExample.getFiles(f);
        assertEquals(1, result.size());
        assertEquals(new File("some-files/a.txt"), result.get(0));
    }
}