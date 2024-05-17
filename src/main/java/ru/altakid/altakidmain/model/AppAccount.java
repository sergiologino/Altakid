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
@Entity(name = "account")
public class AppAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "avatar")
    private String avatar;

    @Column(name="created_date")
    private Instant createdAt;

    @Column(name = "updated_date")
    private Instant updatedAt;


}
