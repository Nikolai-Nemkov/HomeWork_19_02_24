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




