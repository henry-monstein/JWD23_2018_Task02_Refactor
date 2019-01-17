package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    private  final static String NUMBER = "^\\d+(\\.\\d+)?$";
    private  final static String SIMPLEWORD="[A-Z][a-z]";
    private  final static String FILTER_TYPE="[A-Z]{1}+";
    private  final static String BAG_TYPE=".{1,10}";
    private  final static String WAND_TYPE="all-in-one";
    private  final static String FREQYENCY_RANGE = "^\\d+(\\.\\d+)?\\-\\d+(\\.\\d+)?$";




    public static String extractNumber(String testString){
        Pattern p = Pattern.compile(NUMBER);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group();
        return null;
    }

    public static String extractSimpleWord(String testString){
        Pattern p = Pattern.compile(SIMPLEWORD);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group();
        return null;
    }

    public static Character extractFilterType(String testString){
        Pattern p = Pattern.compile(FILTER_TYPE);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group().charAt(0);
        return null;
    }
    public static String extractBagType(String testString){
        Pattern p = Pattern.compile(BAG_TYPE);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group();
        return null;
    }



    public static String extractWandType(String testString){
        Pattern p = Pattern.compile(WAND_TYPE);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group();
        return null;
    }



    public static String extractFrequencyRange(String testString){
        Pattern p = Pattern.compile(FREQYENCY_RANGE);
        Matcher m = p.matcher(testString);
        while(m.find())
            return m.group();
        return null;
    }

    public static boolean isNumber(String probableNumber) {
        Pattern validationPattern = Pattern.compile(NUMBER);
        Matcher validationMatcher = validationPattern.matcher(probableNumber);
        return validationMatcher.find();
    }

}
