package com.baeldung.keycloak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "event_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String client_id;

    private String details_json;

    private String error;

    private String ip_address;

    private String realm_id;

    private String session_id;

    private Long event_time;

    private String type;

    private String user_id;



}
