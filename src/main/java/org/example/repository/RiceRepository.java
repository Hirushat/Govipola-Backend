package org.example.repository;


import org.example.entity.FarmerEntity;
import org.example.entity.RiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RiceRepository extends JpaRepository<RiceEntity, Long> {

    Optional<RiceEntity> findRiceByFarmerAndType(FarmerEntity farmer, String type);

    @Query("SELECT r.farmer.name, r.type, r.priceFromFarmer, r.farmer.stockInKg FROM RiceEntity r WHERE r.type = :type")
    List<Object[]> getFarmerPricesByRiceType(@Param("type") String type);

    @Query("SELECT r.middleman.name, r.type, r.priceFromMiddleman, r.middleman.stockInKg FROM RiceEntity r WHERE r.type = :type")
    List<Object[]> getMiddlemanPricesByRiceType(@Param("type") String type);

    @Query("SELECT r.miller.name, r.type, r.priceFromMiller, r.miller.stockInKg FROM RiceEntity r WHERE r.type = :type")
    List<Object[]> getMillerPricesByRiceType(@Param("type") String type);

}
