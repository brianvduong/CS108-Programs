import java.util.ArrayList;
public class CsvParser 
{
	private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE     = '"';

    public static ArrayList<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    public static ArrayList<String> parseLine(String cvsLine, char separator) {
        return parseLine(cvsLine, separator, DEFAULT_QUOTE);
    }

    public static ArrayList<String> parseLine(String cvsLine, char separator, char customQuote) {

        //if empty, return!
        if (cvsLine == null || cvsLine.isEmpty()) {
            return new ArrayList<String>();
        }

        ArrayList<String> result = new ArrayList<String>();
        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;
        int startPos = 0;
        char[] chars = cvsLine.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        	char ch = chars[i];
        	// This gets rid of a ridiculous warning in Eclipse
        	if (startPos == 0) {
        		startPos = 0;
        	}

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                    startPos = 0;
                } else {
                    // allow ""
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }
                }
            } else {
                if (ch == customQuote) {
                    inQuotes = true;
                    startPos = i;

                    // allow ""
                    if (chars[i] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //Add quote mark when the second of two contiguous quote marks encountered
                    if (startCollectChar && chars[i] == '\"') {
                        curVal.append('"');
                    }
                } else if (ch == separator) {
                    result.add(curVal.toString());
                    curVal = new StringBuffer();
                    startCollectChar = false;
                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }
        // Add the last one
        result.add(curVal.toString());
        return result;
    }
}
