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
@Entity(name = "device_application")

// таблица с приложениями, установленными на устройстве
public class DeviceApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // ссылка на поле "id" таблицы device
    @Column(name = "device_id")
    private String device_id;

    @Column(name = "app_name")
    private String appName;

    // уникальный идентификатор программы на устройстве
    @Column(name = "app_id")
    private String appId;

    // признак что приложение всегда запрещено
    @Column(name = "is_blocked")
    private boolean isBlocked;

    // признак что приложение всегда разрешено (не может быть true одновременно с isBlocked
    @Column(name = "is_allow")
    private boolean isAllow;

    // общая продолжительность использования приложения
    @Column(name = "work_duration")
    private boolean workDuration;

}
