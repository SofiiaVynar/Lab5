import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class WordsRemoverTest {
    @Test
    public void testRemoveWords() {
        String text = "This text is OK like A this A1a2O3r4K5 a";
        String expected = "This text is  like  this  ";
        WordsRemover remover = new WordsRemover();
        String result = remover.removeWords(text);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRemoveWordsWithEmpty(){
        String text = "";
        String expected = "";
        WordsRemover remover = new WordsRemover();
        String result = remover.removeWords(text);
        Assertions.assertEquals(expected, result);
    }


}
