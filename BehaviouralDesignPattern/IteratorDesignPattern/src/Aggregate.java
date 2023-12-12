import java.util.List;

public class Aggregate<T> {
    List<T> list;

    Aggregate(List<T> list){
        this.list = list;
    }

    public Iterator<T> createIterator(){
        return new IteratorImpl<T>(list);
    }

}
