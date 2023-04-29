import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsRemover {
    public static void main(String[] args) {
        String text = "This text should be OK like A this";
        String pattern = "\\b\\w*[AaOrK]+\\w*\\b";
        RemoveWords(text, pattern);
    }

    public static void RemoveWords(String text, String pattern) {
        Pattern patter = Pattern.compile(pattern);
        Matcher matcher = patter.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.replaceAll(""));
        }
    }
}
