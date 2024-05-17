package ru.altakid.altakidmain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity(name = "device_access_time")
public class DeviceAccessTime {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // ссылка на поле "id" таблицы device
    @Column(name = "device_id")
    private String device_id;

    //временно: время начала доступа при ежедневном расписании
    @Column(name="time_begin")
    private Instant timeBegin;

    //временно: время окончания доступа при ежедневном расписании
    @Column(name="time_end")
    private Instant timeEnd;

    // пока тоже временно флаг доступности девайса (блокировка отключена)
    @Column(name="is_available")
    private boolean isAvailable;

    // признак использования расписания блокировки, если True то время блокировки и разблокировки берется из расписания
    @Column(name = "use_schedule")
    private boolean useSchedule;





}
