package org.example.service;

import org.example.entity.MiddlemanEntity;
import org.example.repository.MiddlemanRepository;

import java.util.List;

public interface MiddlemanService {
    public List<MiddlemanEntity> getAllMiddlemen();

    public MiddlemanEntity getMiddlemanById(Long id);

    public MiddlemanEntity saveMiddleman(MiddlemanEntity middleman);

    public void deleteMiddleman(Long id) ;
}
