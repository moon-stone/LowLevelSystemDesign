import java.util.List;

public class IteratorImpl<T> implements Iterator<T> {
    List<T> collection;
    int index = 0;

    IteratorImpl(List<T> collection){
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        if(this.hasNext()){
            return collection.get(index++);
        }
        return null;
    }
}
