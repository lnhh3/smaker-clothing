package com.project.smaker.repository.color;

import com.project.smaker.model.entity.ColorEntity;

import java.util.List;

public interface IColorRepo {
    List<ColorEntity> getColors();
    ColorEntity getColor(int colorID);
    ColorEntity putColor(ColorEntity colorEntity);
    ColorEntity postColor(ColorEntity colorEntity);
    void deleteColor(int colorID);
}
