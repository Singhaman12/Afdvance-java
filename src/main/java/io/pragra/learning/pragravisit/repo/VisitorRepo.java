package io.pragra.learning.pragravisit.repo;

import io.pragra.learning.pragravisit.entity.StatusEnum;
import io.pragra.learning.pragravisit.entity.PragraVisitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitorRepo extends JpaRepository<PragraVisitor,Integer> {
       List<PragraVisitor> findAllByLastName(String lastname);
    List<PragraVisitor> findAllByStatus(StatusEnum statusEnum);

    List<PragraVisitor> findAllByLastNameAndFirstName(String lastname, String firstname);

    List<PragraVisitor> findAllByFirstName(String firstname);
}
