package org.fridgeguard;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Timur Nasibullin
 * @since 3/28/2017
 */
public class DummyTest {
    @Test
    public void run() {
        System.out.println(new BCryptPasswordEncoder().encode("tim"));
    }
}
