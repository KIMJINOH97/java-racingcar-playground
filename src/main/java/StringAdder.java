import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdder {
    public static Integer splitAndSum(String str) {
        if(isNullOrEmpty(str)){
            return 0;
        }

        if (oneNumber(str)){
            return Integer.parseInt(str);
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(str);
        if (matcher.find()){
            String delimiter = matcher.group(1);
            String[] numberList = matcher.group(2).split(delimiter);
            return add(numberList);
        }

        String[] numberList = str.split(",|:");

        return add(numberList);
    }

    private static Integer add(String[] strList) {
        Integer sum = 0;

        for (String s : strList) {
            Integer strToInt = Integer.valueOf(s);
            isPositive(strToInt);
            sum += Integer.valueOf(s);
        }

        return sum;
    }

    private static void isPositive(Integer number) {
        if (number < 0){
            throw new RuntimeException();
        }
    }

    private static boolean oneNumber(String str) {
        return str.length() == 1;
    }


    private static boolean isNullOrEmpty(String str) {
        return str == null || str == "";
    }

}
