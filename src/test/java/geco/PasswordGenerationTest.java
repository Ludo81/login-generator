package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration passwordGeneration;

    @Before
    public void setUp() throws Exception {
        passwordGeneration = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        String mot = passwordGeneration.getRandomPassword();
        assertEquals(8, mot.length());
    }
}