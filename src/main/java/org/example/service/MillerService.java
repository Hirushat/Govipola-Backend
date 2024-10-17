package org.example.service;

import org.example.entity.MillerEntity;

import java.util.List;

public interface MillerService {

    public List<MillerEntity> getAllMillers();

    public MillerEntity getMillerById(Long id);

    public MillerEntity saveMiller(MillerEntity miller);

    public void deleteMiller(Long id);
}
