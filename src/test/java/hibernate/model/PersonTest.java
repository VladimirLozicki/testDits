package hibernate.model;

import hibernate.dao.PersonDao;


public class PersonTest {

    @org.testng.annotations.Test
    public void testGetName() {
        PersonDao personDao = new PersonDao();
        Person person = new Person();
        personDao.save(person);
    }
}