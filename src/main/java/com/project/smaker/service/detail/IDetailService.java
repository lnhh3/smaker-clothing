package com.project.smaker.service.detail;

import com.project.smaker.model.dto.DetailDTO;
import com.project.smaker.model.entity.DetailEntity;

import java.util.List;

public interface IDetailService {
    List<DetailDTO> getDetails();
    DetailDTO getDetail(int detailID);
    DetailEntity postDetail(DetailDTO detailDTO);
    DetailEntity putDetail(int detailID, DetailDTO detailDTO);
    void deleteDetail(int detailID);
}
