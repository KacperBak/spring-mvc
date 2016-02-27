package de.kacperbak.utils;

public class AppUtils {

    public static String stringArrayValuesToString(String[] array){
        StringBuilder builder = new StringBuilder();
        for(String field: array){
            builder.append(field);
            builder.append(",");
        }
        String result = builder.toString();
        return (result.isEmpty()) ? result : result.substring(0,result.lastIndexOf(","));
    }
}
