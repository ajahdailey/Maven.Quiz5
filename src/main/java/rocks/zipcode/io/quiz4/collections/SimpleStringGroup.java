package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {
  List<String> myList;

  public SimpleStringGroup() {
      myList = new ArrayList<>();
    }

    public Integer count() {
        return myList.size();
    }

    public void insert(String string) {
    myList.add(string);
  }

    public Boolean has(String string) {
        return myList.contains(string);
    }

    public String fetch(int indexOfValue) {
        return myList.get(indexOfValue);
    }

    public void delete(String string) {
    myList.remove(string);
  }

    public void clear() {
    myList.clear();
  }

    @Override
    public Iterator iterator() {
        return myList.iterator();
    }
}
