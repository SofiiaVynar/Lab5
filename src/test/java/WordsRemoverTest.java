import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WordsRemoverTest {
    @Test
    public void testRemoveWords() {
        String text = "This text should be OK like A this";
        String pattern = "\\b\\w*[AaOrK]+\\w*\\b";
        String expected = "This text should be  like  this";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        WordsRemover.RemoveWords(text, pattern);

        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
    }
}