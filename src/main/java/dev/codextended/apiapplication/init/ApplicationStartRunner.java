package dev.codextended.apiapplication.init;

import dev.codextended.apiapplication.model.Role;
import dev.codextended.apiapplication.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class ApplicationStartRunner implements CommandLineRunner {
    private final RoleRepository roleRepository;
    @Override
    public void run(String... args) throws Exception {
//        Role roleUser = Role.builder()
//                .code("123")
//                .name("ROLE_USER")
//                .build();
//        Role roleAdmin = Role.builder()
//                .code("456")
//                .name("ROLE_ADMIN")
//                .build();
//        roleRepository.saveAll(Arrays.asList(roleUser, roleAdmin));
    }
}
