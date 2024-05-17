package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.DeviceApplication;

import java.util.UUID;

public interface DeviceApplicationRepository extends JpaRepository<DeviceApplication, UUID> {


}
