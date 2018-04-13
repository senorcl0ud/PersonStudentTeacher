package personstudentteacher;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findyById(long id){
        Person personElement = null;
       for(Person person : personList) {
           if (id == person.getId()) {
               personElement = person;
           }
       }
       return personElement;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id){
        for(Person person : personList) {
            if (id == person.getId()) {
                personList.remove(person);
            }
        }
    }

    public int getCount(){
        return personList.size();
    }
}
