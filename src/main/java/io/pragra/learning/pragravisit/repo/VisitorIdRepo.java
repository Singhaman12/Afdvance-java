package io.pragra.learning.pragravisit.repo;

import io.pragra.learning.pragravisit.entity.VisitorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorIdRepo extends JpaRepository<VisitorId, String> {
}
