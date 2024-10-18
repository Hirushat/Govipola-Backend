package org.example.service;

import org.example.dto.Miller;
import org.example.entity.MillerEntity;

import java.util.List;

public interface MillerService {

    public List<MillerEntity> getAllMillers();

    public Miller getMillerById(Long id);

    public boolean saveMiller(Miller miller);

    public void deleteMiller(Long id);
}
