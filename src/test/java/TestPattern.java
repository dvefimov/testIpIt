import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: техно сити
 * Date: 17.06.14
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class TestPattern {

    @Test
    public void test1(){
        String test = "(type my new) name my new(1)";
        Pattern p = Pattern.compile("(.+)");
        Matcher m = p.matcher(test);

        if(m.find()){
            System.out.println(m.group());
        }

        int end = test.indexOf(") ");
        String name = test.substring(end + 2);
        System.out.println(name);
        String type = test.substring(test.indexOf("(")+1, end);
        System.out.println(type);
    }
}
