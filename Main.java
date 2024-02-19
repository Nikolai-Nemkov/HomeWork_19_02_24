
import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream();
        stream1.addGroup(new Group("Group 1"));
        stream1.addGroup(new Group("Group 2"));
        stream1.addGroup(new Group("Group 3"));

        Stream stream2 = new Stream();
        stream2.addGroup(new Group("Group 4"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        System.out.println("Before sorting:");
        for (Stream stream : streams) {
            for (Group group : stream) {
                System.out.println(group.getName());
            }
        }
    }
}