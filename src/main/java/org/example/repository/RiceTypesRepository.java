package org.example.repository;

import org.example.entity.RiceTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiceTypesRepository extends JpaRepository<RiceTypesEntity, Long> {
}
