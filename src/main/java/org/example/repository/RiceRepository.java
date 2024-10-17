package org.example.repository;


import org.example.entity.RiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiceRepository extends JpaRepository<RiceEntity, Long> {
}
