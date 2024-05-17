package ru.altakid.altakidmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.altakid.altakidmain.model.Device;
import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {

   /* List<Device> findAll();

    Device findById(UUID id);

    Device findByUserId(UUID userId);*/
}
