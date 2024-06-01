package com.project.smaker.repository.detail;

import com.project.smaker.model.entity.DetailEntity;

import java.util.List;

public interface IDetailRepo {
    List<DetailEntity> getDetails();
    DetailEntity getDetail(int detailID);
    DetailEntity postDetail(DetailEntity detailEntity);
    DetailEntity putDetail(DetailEntity detailEntity);
    void deleteDetail(int detailID);
}
