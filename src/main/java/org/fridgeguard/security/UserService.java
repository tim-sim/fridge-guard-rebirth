package org.fridgeguard.security;

import org.fridgeguard.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Timur Nasibullin
 * @since 3/28/2017
 */
@Service
public class UserService implements UserDetailsService {
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private Map<String, UserDetails> users = new HashMap<String, UserDetails>() {{
        put("tim", new User("tim", passwordEncoder.encode("tim"), true));
        put("admin", new User("admin", passwordEncoder.encode("admin"), true));
        put("slowpoke", new User("slowpoke", passwordEncoder.encode("slowpoke"), false));
    }};

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (users.containsKey(username)) {
            return users.get(username);
        } else {
            throw new UsernameNotFoundException("User '" + username + "' not found");
        }
    }
}
