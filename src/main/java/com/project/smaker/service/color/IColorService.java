package com.project.smaker.service.color;

import com.project.smaker.model.dto.ColorDTO;
import com.project.smaker.model.entity.ColorEntity;

import java.util.List;

public interface IColorService {
    List<ColorDTO> getColors();
    ColorDTO getColor(int colorID);
    ColorEntity postColor(ColorDTO colorDTO);
    ColorEntity putColor(int colorID, ColorDTO colorDTO);
    void deleteColor(int colorID);
}
