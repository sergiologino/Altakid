package ru.altakid.altakidmain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // идентификатор самого устройства : IMEI или s/n
    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "device_name")
    private String deviceName;
}
