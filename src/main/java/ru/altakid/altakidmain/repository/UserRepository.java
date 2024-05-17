package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
