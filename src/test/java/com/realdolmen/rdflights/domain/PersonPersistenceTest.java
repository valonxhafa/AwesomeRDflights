package com.realdolmen.rdflights.domain;

import com.realdolmen.rdflights.AbstractPersistenceTest;
import com.realdolmen.rdflights.domain.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonPersistenceTest extends AbstractPersistenceTest {
    @Test
    public void personCanBePersisted() throws Exception {
        User person = new User();
        person.setFirstName("Jane");
        person.setLastName("Doe");
        person.setEmail("Jane.doe@gmail.com");
        person.setGender("V");
        person.setPassword("test");
        em.persist(person);
        assertNotNull(person.getId());
    }

    @Test
    public void personCanBeLoaded() throws Exception {
    	Long longID = (long) 1;
        User person = em.find(User.class, longID);
        assertEquals("Johnny", person.getFirstName());
        assertEquals("Doe", person.getLastName());
    }
}
