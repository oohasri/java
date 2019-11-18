public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1 = str1.trim();
        str2 = str2.trim();
        String str = str1.concat(str2);
        return str;
    }
    public Integer getIndexOrNull(String str, char c) {

        int index;
        index = str.indexOf(c);
        if(index >= 0) {
            return index;
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        int index;
        index = str1.indexOf(str2);
        if(index >= 0) {
            return index;
        }
        else {
            return null;
        }
    }
    public String concatSubstring(String str1, int start, int end, String str2) {
        String newstr = str1.substring(start, end);
        newstr = newstr.concat(str2);
        return newstr;
    }
}