package com.baeldung.keycloak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String email;

    @Column(name ="email_constraint")
    private String contraint;

    private boolean email_verified;

    private boolean enabled;

    private String federation_link;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String realm_id;

    private String username;

    private Long created_timestamp;

    private String service_account_client_link;

    private Integer not_before;



}
