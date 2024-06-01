package com.project.smaker.repository.detail;

import com.project.smaker.model.entity.DetailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DetailRepo implements IDetailRepo{
    @Autowired
    private IDetailJpaRepo jpaRepo;

    @Override
    public List<DetailEntity> getDetails() {
        return jpaRepo.findAll();
    }

    @Override
    public DetailEntity getDetail(int detailID) {
        return jpaRepo.findById(detailID).get();
    }

    @Override
    public DetailEntity postDetail(DetailEntity detailEntity) {
        return jpaRepo.save(detailEntity);
    }

    @Override
    public DetailEntity putDetail(DetailEntity detailEntity) {
        return jpaRepo.saveAndFlush(detailEntity);
    }

    @Override
    public void deleteDetail(int detailID) {
        jpaRepo.deleteById(detailID);
    }
}
