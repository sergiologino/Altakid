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
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "account_id")
    private String accountId;

    @Column
    private String login;

    @Column
    private String name;

    @Column(name = "role_id")
    private String role;

    @Column(name = "is_admin")
    private String isAdmin;

    // пароль в хешир. виде
    @Column
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column
    private String phonebookLink;






}
