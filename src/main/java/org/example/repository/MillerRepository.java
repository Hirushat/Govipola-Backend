package org.example.repository;

import org.example.dto.Miller;
import org.example.entity.MillerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MillerRepository extends JpaRepository<MillerEntity, Long> {
}
