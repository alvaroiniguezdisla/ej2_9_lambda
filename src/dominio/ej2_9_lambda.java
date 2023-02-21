package dominio;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ej2_9_lambda {
    public static ArrayList nuevalistapares(int[] lista){
        ArrayList listanueva = new ArrayList();
      return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).filter(i->i%2==0).collect(Collectors.toCollection(ArrayList::new));
    }
}
