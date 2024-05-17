package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.DeviceAccessTime;

import java.util.UUID;

public interface DeviceAccessTimeRepository extends JpaRepository<DeviceAccessTime, UUID> {

}
