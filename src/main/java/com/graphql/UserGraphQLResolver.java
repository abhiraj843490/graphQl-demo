package com.graphql;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserGraphQLResolver {

    private final UserRepository userRepository;

    // Query
    @QueryMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @QueryMapping
    public User getUserById(@Argument Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Mutation
    @MutationMapping
    public User createUser(@Argument String name,
                           @Argument String email) {
        User user = new User(null, name, email);
        return userRepository.save(user);
    }
}

