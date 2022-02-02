package io.pragra.learning.pragravisit.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name="covid_details")
public class CovidDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private Instant screenDate;
    private CovidStatus status;
}
