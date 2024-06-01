package com.project.smaker.service.color;

import com.project.smaker.model.dto.ColorDTO;
import com.project.smaker.model.entity.ColorEntity;
import com.project.smaker.repository.color.ColorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService implements IColorService{
    @Autowired
    private ColorRepo colorRepo;
    private final ModelMapper mapper = new ModelMapper();
    @Override
    public List<ColorDTO> getColors() {
        List<ColorEntity> colorsEntity = colorRepo.getColors();
        List<ColorDTO> colorsDTO = new ArrayList<>();
        colorsEntity.forEach(colorEntity -> {
            ColorDTO colorDTO = mapper.map(colorEntity, ColorDTO.class);
            colorsDTO.add(colorDTO);
        });
        return colorsDTO;
    }

    @Override
    public ColorDTO getColor(int colorID) {
        ColorEntity colorEntity = colorRepo.getColor(colorID);
        ColorDTO colorDTO = mapper.map(colorEntity, ColorDTO.class);
        return colorDTO;
    }

    @Override
    public ColorEntity postColor(ColorDTO colorDTO) {
        ColorEntity colorEntity = mapper.map(colorDTO, ColorEntity.class);
        return colorRepo.postColor(colorEntity);
    }

    @Override
    public ColorEntity putColor(int colorID, ColorDTO colorDTO) {
        colorDTO.setColorID(colorID);
        ColorEntity colorEntity = mapper.map(colorDTO, ColorEntity.class);
        return colorRepo.putColor(colorEntity);
    }

    @Override
    public void deleteColor(int colorID) {
        colorRepo.deleteColor(colorID);
    }
}
