
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<Group> {
    List<Group> groups;

    public Stream() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}





















