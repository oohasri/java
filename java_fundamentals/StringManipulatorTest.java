public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        String str = sm.trimAndConcat("    hello!   ","   World!  ");
        System.out.println(str);
        char c = 'z';
        Integer index = sm.getIndexOrNull(str, c);
        System.out.println(index);
        String substr = "lo";
        Integer subindex = sm.getIndexOrNull(str, substr);
        System.out.println(subindex);
        String newstr = sm.concatSubstring(str, 4,6, "ooha");
        System.out.println(newstr);
    }
}