package com.project.smaker.service.detail;

import com.project.smaker.model.dto.DetailDTO;
import com.project.smaker.model.entity.DetailEntity;
import com.project.smaker.repository.detail.DetailRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DetailService implements IDetailService{
    @Autowired
    private DetailRepo detailRepo;
    private ModelMapper mapper = new ModelMapper();

    @Override
    public List<DetailDTO> getDetails() {
        List<DetailEntity> detailEntities = detailRepo.getDetails();
        List<DetailDTO> detailDTOS = new ArrayList<>();
        detailEntities.forEach(detailEntity -> {
            DetailDTO detailDTO = mapper.map(detailEntity, DetailDTO.class);
            detailDTOS.add(detailDTO);
        });
        return detailDTOS;
    }

    @Override
    public DetailDTO getDetail(int detailID) {
        return null;
    }

    @Override
    public DetailEntity postDetail(DetailDTO detailDTO) {
        DetailEntity detailEntity = mapper.map(detailDTO, DetailEntity.class);
        return detailRepo.postDetail(detailEntity);
    }

    @Override
    public DetailEntity putDetail(int detailID, DetailDTO detailDTO) {
        detailDTO.setDetailID(detailID);
        DetailEntity detailEntity = mapper.map(detailDTO, DetailEntity.class);
        return detailRepo.putDetail(detailEntity);
    }

    @Override
    public void deleteDetail(int detailID) {
        detailRepo.deleteDetail(detailID);
    }
}
