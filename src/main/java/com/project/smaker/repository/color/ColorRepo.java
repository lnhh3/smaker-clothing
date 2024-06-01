package com.project.smaker.repository.color;

import com.project.smaker.model.entity.ColorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColorRepo implements IColorRepo{
    @Autowired
    private IColorJpaRepo jpaRepo;

    @Override
    public List<ColorEntity> getColors() {
        return jpaRepo.findAll();
    }

    @Override
    public ColorEntity getColor(int colorID) {
        return jpaRepo.findById(colorID).get();
    }

    @Override
    public ColorEntity putColor(ColorEntity colorEntity) {
        return jpaRepo.save(colorEntity);
    }

    @Override
    public ColorEntity postColor(ColorEntity colorEntity) {
        return jpaRepo.saveAndFlush(colorEntity);
    }

    @Override
    public void deleteColor(int colorID) {
        jpaRepo.deleteById(colorID);
    }
}
