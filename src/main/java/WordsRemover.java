import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsRemover {
    private static final Pattern PATTERN = Pattern.compile("\\b\\w*[AaOrK]+\\w*\\b");

    public String removeWords(final String text) {
        Matcher matcher = PATTERN.matcher(text);
        StringBuilder builder = new StringBuilder();

        while (matcher.find()) {
            String group = matcher.group();
            String newWorld = group.replaceAll(group, "");
            matcher.appendReplacement(builder, newWorld);
        }
        matcher.appendTail(builder);
        return builder.toString();
    }
}
