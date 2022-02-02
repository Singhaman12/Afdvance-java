package io.pragra.learning.pragravisit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity(name = "visitor")
@Data
@Table(name = "TABLE_VISITOR")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class PragraVisitor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "visitor_id", updatable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Instant createDate;
    private Instant updateDate;
    private StatusEnum status;
    @Transient
    private String greetingOfDay;


    @OneToMany
    @JoinColumn(name = "visitor_id")
    private List<CovidDetail> covidDetail;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private VisitorId visitorId;
}
