# HomeWork_19_02_24

## Урок 3. 
— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;.
Формат сдачи: ссылка на гитхаб проект

## Group.java 

public class Group {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

## Stream.java

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

## StreamComparator.java

import java.util.Comparator;
public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        return stream1.groups.size() - stream2.groups.size();
    }
}

## StreamService.java

import java.util.Collections;

import java.util.List;

public class StreamService {

    public void sortStreams(List<Stream> streams) {
    
        Collections.sort(streams, new StreamComparator());
    }

}

## main.java

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







