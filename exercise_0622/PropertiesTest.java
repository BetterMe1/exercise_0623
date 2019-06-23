package exercise.exercise_0622;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args)  throws Exception{
        Properties properties = new Properties();
        /*properties.put("xa","西安");
        properties.put("hz","杭州");
        properties.put("sh","上海");
        File file = new File("E:\\workspace2Eclipse\\untitled\\exercise\\src\\exercise\\resources\\test1.properties");
        properties.store(new FileOutputStream(file),"first commit");*/
        File file = new File("E:\\workspace2Eclipse\\untitled\\exercise\\src\\exercise\\resources\\test1.properties");
        properties.load(new FileInputStream(file));
        System.out.println(properties);
    }
}