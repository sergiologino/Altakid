package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.AppAccount;
import java.util.UUID;

public interface AppAccountRepository extends JpaRepository<AppAccount, UUID> {

    /*List<AppAccount> findAll();

    Optional<AppAccount> findById(UUID id);

    Optional<AppAccount> findByName(String name);

    AppAccount save(AppAccount app);

    AppAccount update(AppAccount app);

    void delete(UUID id);*/


}
