package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.Profile;

import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

}
