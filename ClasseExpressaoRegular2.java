import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseExpresseRegular2{
    public static void main(String[] args){
        Pattern p = Pattern.compile("((hi|su)per)mercado");
        Matcher n=p.matcher("supermercado");
        while(n.find()){
            System.out.print(n.group(null));
        }
    }
}
