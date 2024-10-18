package org.example.service;

import org.example.dto.Middleman;
import org.example.entity.MiddlemanEntity;
import org.example.repository.MiddlemanRepository;

import java.util.List;

public interface MiddlemanService {
    public List<MiddlemanEntity> getAllMiddlemen();

    public Middleman getMiddlemanById(Long id);

    public boolean saveMiddleman(Middleman middleman);

    public void deleteMiddleman(Long id) ;
}
